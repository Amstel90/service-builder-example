package com.epam.sb.students.web;

import com.epam.sb.students.model.impl.StudentImpl;
import com.epam.sb.students.model.impl.StudentModelImpl;
import com.epam.sb.students.service.StudentLocalServiceUtil;
import com.epam.sb.students.service.persistence.StudentFinderUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;
import com.epam.sb.students.model.Student;

import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import java.util.List;

@Controller
@RequestMapping("VIEW")
public class StudentsController {

    @RenderMapping
    public ModelAndView home() throws SystemException {
        return list();
    }

    @RenderMapping(params = "action=student_add")
    public ModelAndView add() throws SystemException {

        return new ModelAndView("edit", "student", StudentLocalServiceUtil.createStudent(0));
    }

    @RenderMapping(params = "action=student_edit")
    public ModelAndView edit(@RequestParam("studentId") long studentId) throws SystemException, PortalException {

        return new ModelAndView("edit", "student", StudentLocalServiceUtil.getStudent(studentId));
    }

    @RenderMapping(params = "action=student_list")
    public ModelAndView list() throws SystemException {

        List<Student> students = StudentLocalServiceUtil.getStudents(-1, -1);
        return displayList(students);

    }

    @RenderMapping(params = "action=student_list_dynamic_query")
    public ModelAndView listDynamicQuery() throws SystemException {

        List<Student> students = StudentLocalServiceUtil.findStudentsWithGradeMore5();
        return displayList(students);
    }

    @RenderMapping(params = "action=student_list_custom_sql")
    public ModelAndView listContainingA() throws SystemException {

        List<Student> students = StudentLocalServiceUtil.findStudentsContaningAInName();
        return displayList(students);
    }

    private ModelAndView displayList(List<Student> students) {

        return new ModelAndView("list", "students", students);
    }

    @RenderMapping(params = "action=student_view")
    public ModelAndView view(@RequestParam("studentId") long studentId) throws SystemException, PortalException {

        Student student = StudentLocalServiceUtil.getStudent(studentId);

        return new ModelAndView("view", "student", student);
    }

    @ActionMapping("student_save")
    public void save(ActionResponse actionResponse,
                     @ModelAttribute("student") StudentImpl student,
                     BindingResult bindingResult) throws Exception {

        //long newId = CounterLocalServiceUtil.increment(studentModel.getModelClassName());

        if (!bindingResult.hasErrors()) {
            Student result = null;
            if (student.getStudentId() == 0) {
                result = StudentLocalServiceUtil.addStudent(student);
            } else {
                result = StudentLocalServiceUtil.updateStudent(student);
            }

            actionResponse.setRenderParameter("action", "student_view");
            actionResponse.setRenderParameter("studentId", String.valueOf(
                            result.getStudentId())
            );
        } else {
            actionResponse.setRenderParameter("action", "" +
                    "student_save");
        }
    }
}

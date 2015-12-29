package com.epam.sb.students.service.impl;

import com.epam.sb.students.model.Student;
import com.epam.sb.students.service.base.StudentLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the student local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.epam.sb.students.service.StudentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.epam.sb.students.service.base.StudentLocalServiceBaseImpl
 * @see com.epam.sb.students.service.StudentLocalServiceUtil
 */
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.epam.sb.students.service.StudentLocalServiceUtil} to access the student local service.
     */

    public List<Student> findByStudentName(String studentName) throws SystemException {
        return this.getStudentPersistence().findByStudentName(studentName);

    }

    public List<Student> findStudentsWithGradeMore5() throws SystemException {

        DynamicQuery dynamicQuery = dynamicQuery()
                .add(PropertyFactoryUtil.forName("grade").gt(5.0));

        return getStudentPersistence().findWithDynamicQuery(dynamicQuery);

    }


    public List<Student> findStudentsContaningAInName() throws SystemException {
        return getStudentFinder().findLikeA();
    }
}

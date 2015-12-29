package com.epam.sb.students.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.epam.sb.students.service.http.CourseServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.epam.sb.students.service.http.CourseServiceSoap
 * @generated
 */
public class CourseSoap implements Serializable {
    private long _courseId;
    private String _courseName;

    public CourseSoap() {
    }

    public static CourseSoap toSoapModel(Course model) {
        CourseSoap soapModel = new CourseSoap();

        soapModel.setCourseId(model.getCourseId());
        soapModel.setCourseName(model.getCourseName());

        return soapModel;
    }

    public static CourseSoap[] toSoapModels(Course[] models) {
        CourseSoap[] soapModels = new CourseSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CourseSoap[][] toSoapModels(Course[][] models) {
        CourseSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CourseSoap[models.length][models[0].length];
        } else {
            soapModels = new CourseSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CourseSoap[] toSoapModels(List<Course> models) {
        List<CourseSoap> soapModels = new ArrayList<CourseSoap>(models.size());

        for (Course model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CourseSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _courseId;
    }

    public void setPrimaryKey(long pk) {
        setCourseId(pk);
    }

    public long getCourseId() {
        return _courseId;
    }

    public void setCourseId(long courseId) {
        _courseId = courseId;
    }

    public String getCourseName() {
        return _courseName;
    }

    public void setCourseName(String courseName) {
        _courseName = courseName;
    }
}

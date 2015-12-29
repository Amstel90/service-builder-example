package com.epam.sb.students.model;

import com.epam.sb.students.service.ClpSerializer;
import com.epam.sb.students.service.CourseLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CourseClp extends BaseModelImpl<Course> implements Course {
    private long _courseId;
    private String _courseName;
    private BaseModel<?> _courseRemoteModel;
    private Class<?> _clpSerializerClass = com.epam.sb.students.service.ClpSerializer.class;

    public CourseClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Course.class;
    }

    @Override
    public String getModelClassName() {
        return Course.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _courseId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCourseId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _courseId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("courseId", getCourseId());
        attributes.put("courseName", getCourseName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long courseId = (Long) attributes.get("courseId");

        if (courseId != null) {
            setCourseId(courseId);
        }

        String courseName = (String) attributes.get("courseName");

        if (courseName != null) {
            setCourseName(courseName);
        }
    }

    @Override
    public long getCourseId() {
        return _courseId;
    }

    @Override
    public void setCourseId(long courseId) {
        _courseId = courseId;

        if (_courseRemoteModel != null) {
            try {
                Class<?> clazz = _courseRemoteModel.getClass();

                Method method = clazz.getMethod("setCourseId", long.class);

                method.invoke(_courseRemoteModel, courseId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCourseName() {
        return _courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        _courseName = courseName;

        if (_courseRemoteModel != null) {
            try {
                Class<?> clazz = _courseRemoteModel.getClass();

                Method method = clazz.getMethod("setCourseName", String.class);

                method.invoke(_courseRemoteModel, courseName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCourseRemoteModel() {
        return _courseRemoteModel;
    }

    public void setCourseRemoteModel(BaseModel<?> courseRemoteModel) {
        _courseRemoteModel = courseRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _courseRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_courseRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CourseLocalServiceUtil.addCourse(this);
        } else {
            CourseLocalServiceUtil.updateCourse(this);
        }
    }

    @Override
    public Course toEscapedModel() {
        return (Course) ProxyUtil.newProxyInstance(Course.class.getClassLoader(),
            new Class[] { Course.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CourseClp clone = new CourseClp();

        clone.setCourseId(getCourseId());
        clone.setCourseName(getCourseName());

        return clone;
    }

    @Override
    public int compareTo(Course course) {
        int value = 0;

        value = getCourseName().compareTo(course.getCourseName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CourseClp)) {
            return false;
        }

        CourseClp course = (CourseClp) obj;

        long primaryKey = course.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{courseId=");
        sb.append(getCourseId());
        sb.append(", courseName=");
        sb.append(getCourseName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.epam.sb.students.model.Course");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>courseId</column-name><column-value><![CDATA[");
        sb.append(getCourseId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseName</column-name><column-value><![CDATA[");
        sb.append(getCourseName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

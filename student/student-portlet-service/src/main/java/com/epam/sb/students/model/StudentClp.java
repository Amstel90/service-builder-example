package com.epam.sb.students.model;

import com.epam.sb.students.service.ClpSerializer;
import com.epam.sb.students.service.StudentLocalServiceUtil;

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


public class StudentClp extends BaseModelImpl<Student> implements Student {
    private long _studentId;
    private String _studentName;
    private double _grade;
    private BaseModel<?> _studentRemoteModel;
    private Class<?> _clpSerializerClass = com.epam.sb.students.service.ClpSerializer.class;

    public StudentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _studentId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("studentName", getStudentName());
        attributes.put("grade", getGrade());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        String studentName = (String) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        Double grade = (Double) attributes.get("grade");

        if (grade != null) {
            setGrade(grade);
        }
    }

    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentId", long.class);

                method.invoke(_studentRemoteModel, studentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStudentName() {
        return _studentName;
    }

    @Override
    public void setStudentName(String studentName) {
        _studentName = studentName;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentName", String.class);

                method.invoke(_studentRemoteModel, studentName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getGrade() {
        return _grade;
    }

    @Override
    public void setGrade(double grade) {
        _grade = grade;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setGrade", double.class);

                method.invoke(_studentRemoteModel, grade);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStudentRemoteModel() {
        return _studentRemoteModel;
    }

    public void setStudentRemoteModel(BaseModel<?> studentRemoteModel) {
        _studentRemoteModel = studentRemoteModel;
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

        Class<?> remoteModelClass = _studentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_studentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StudentLocalServiceUtil.addStudent(this);
        } else {
            StudentLocalServiceUtil.updateStudent(this);
        }
    }

    @Override
    public Student toEscapedModel() {
        return (Student) ProxyUtil.newProxyInstance(Student.class.getClassLoader(),
            new Class[] { Student.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StudentClp clone = new StudentClp();

        clone.setStudentId(getStudentId());
        clone.setStudentName(getStudentName());
        clone.setGrade(getGrade());

        return clone;
    }

    @Override
    public int compareTo(Student student) {
        int value = 0;

        value = getStudentName().compareTo(student.getStudentName());

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

        if (!(obj instanceof StudentClp)) {
            return false;
        }

        StudentClp student = (StudentClp) obj;

        long primaryKey = student.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{studentId=");
        sb.append(getStudentId());
        sb.append(", studentName=");
        sb.append(getStudentName());
        sb.append(", grade=");
        sb.append(getGrade());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.epam.sb.students.model.Student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentName</column-name><column-value><![CDATA[");
        sb.append(getStudentName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>grade</column-name><column-value><![CDATA[");
        sb.append(getGrade());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

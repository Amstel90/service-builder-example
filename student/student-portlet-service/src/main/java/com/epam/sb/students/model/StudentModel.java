package com.epam.sb.students.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Student service. Represents a row in the &quot;student_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.epam.sb.students.model.impl.StudentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.epam.sb.students.model.impl.StudentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @see com.epam.sb.students.model.impl.StudentImpl
 * @see com.epam.sb.students.model.impl.StudentModelImpl
 * @generated
 */
public interface StudentModel extends BaseModel<Student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link Student} interface instead.
     */

    /**
     * Returns the primary key of this student.
     *
     * @return the primary key of this student
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this student.
     *
     * @param primaryKey the primary key of this student
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the student ID of this student.
     *
     * @return the student ID of this student
     */
    public long getStudentId();

    /**
     * Sets the student ID of this student.
     *
     * @param studentId the student ID of this student
     */
    public void setStudentId(long studentId);

    /**
     * Returns the student name of this student.
     *
     * @return the student name of this student
     */
    @AutoEscape
    public String getStudentName();

    /**
     * Sets the student name of this student.
     *
     * @param studentName the student name of this student
     */
    public void setStudentName(String studentName);

    /**
     * Returns the grade of this student.
     *
     * @return the grade of this student
     */
    public double getGrade();

    /**
     * Sets the grade of this student.
     *
     * @param grade the grade of this student
     */
    public void setGrade(double grade);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.epam.sb.students.model.Student student);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.epam.sb.students.model.Student> toCacheModel();

    @Override
    public com.epam.sb.students.model.Student toEscapedModel();

    @Override
    public com.epam.sb.students.model.Student toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}

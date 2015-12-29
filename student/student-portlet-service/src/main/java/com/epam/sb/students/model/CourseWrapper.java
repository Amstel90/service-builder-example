package com.epam.sb.students.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Course}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Course
 * @generated
 */
public class CourseWrapper implements Course, ModelWrapper<Course> {
    private Course _course;

    public CourseWrapper(Course course) {
        _course = course;
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

    /**
    * Returns the primary key of this course.
    *
    * @return the primary key of this course
    */
    @Override
    public long getPrimaryKey() {
        return _course.getPrimaryKey();
    }

    /**
    * Sets the primary key of this course.
    *
    * @param primaryKey the primary key of this course
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _course.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the course ID of this course.
    *
    * @return the course ID of this course
    */
    @Override
    public long getCourseId() {
        return _course.getCourseId();
    }

    /**
    * Sets the course ID of this course.
    *
    * @param courseId the course ID of this course
    */
    @Override
    public void setCourseId(long courseId) {
        _course.setCourseId(courseId);
    }

    /**
    * Returns the course name of this course.
    *
    * @return the course name of this course
    */
    @Override
    public java.lang.String getCourseName() {
        return _course.getCourseName();
    }

    /**
    * Sets the course name of this course.
    *
    * @param courseName the course name of this course
    */
    @Override
    public void setCourseName(java.lang.String courseName) {
        _course.setCourseName(courseName);
    }

    @Override
    public boolean isNew() {
        return _course.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _course.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _course.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _course.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _course.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _course.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _course.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _course.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _course.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _course.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _course.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CourseWrapper((Course) _course.clone());
    }

    @Override
    public int compareTo(com.epam.sb.students.model.Course course) {
        return _course.compareTo(course);
    }

    @Override
    public int hashCode() {
        return _course.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.epam.sb.students.model.Course> toCacheModel() {
        return _course.toCacheModel();
    }

    @Override
    public com.epam.sb.students.model.Course toEscapedModel() {
        return new CourseWrapper(_course.toEscapedModel());
    }

    @Override
    public com.epam.sb.students.model.Course toUnescapedModel() {
        return new CourseWrapper(_course.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _course.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _course.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _course.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CourseWrapper)) {
            return false;
        }

        CourseWrapper courseWrapper = (CourseWrapper) obj;

        if (Validator.equals(_course, courseWrapper._course)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Course getWrappedCourse() {
        return _course;
    }

    @Override
    public Course getWrappedModel() {
        return _course;
    }

    @Override
    public void resetOriginalValues() {
        _course.resetOriginalValues();
    }
}

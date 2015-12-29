package com.epam.sb.students.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentLocalService
 * @generated
 */
public class StudentLocalServiceWrapper implements StudentLocalService,
    ServiceWrapper<StudentLocalService> {
    private StudentLocalService _studentLocalService;

    public StudentLocalServiceWrapper(StudentLocalService studentLocalService) {
        _studentLocalService = studentLocalService;
    }

    /**
    * Adds the student to the database. Also notifies the appropriate model listeners.
    *
    * @param student the student
    * @return the student that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.epam.sb.students.model.Student addStudent(
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.addStudent(student);
    }

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param studentId the primary key for the new student
    * @return the new student
    */
    @Override
    public com.epam.sb.students.model.Student createStudent(long studentId) {
        return _studentLocalService.createStudent(studentId);
    }

    /**
    * Deletes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student
    * @return the student that was removed
    * @throws PortalException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.epam.sb.students.model.Student deleteStudent(long studentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.deleteStudent(studentId);
    }

    /**
    * Deletes the student from the database. Also notifies the appropriate model listeners.
    *
    * @param student the student
    * @return the student that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.epam.sb.students.model.Student deleteStudent(
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.deleteStudent(student);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _studentLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.epam.sb.students.model.Student fetchStudent(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.fetchStudent(studentId);
    }

    /**
    * Returns the student with the primary key.
    *
    * @param studentId the primary key of the student
    * @return the student
    * @throws PortalException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.epam.sb.students.model.Student getStudent(long studentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getStudent(studentId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the students.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @return the range of students
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.epam.sb.students.model.Student> getStudents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getStudents(start, end);
    }

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStudentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getStudentsCount();
    }

    /**
    * Updates the student in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param student the student
    * @return the student that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.epam.sb.students.model.Student updateStudent(
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.updateStudent(student);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addCourseStudent(long courseId, long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.addCourseStudent(courseId, studentId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addCourseStudent(long courseId,
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.addCourseStudent(courseId, student);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addCourseStudents(long courseId, long[] studentIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.addCourseStudents(courseId, studentIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addCourseStudents(long courseId,
        java.util.List<com.epam.sb.students.model.Student> Students)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.addCourseStudents(courseId, Students);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void clearCourseStudents(long courseId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.clearCourseStudents(courseId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteCourseStudent(long courseId, long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.deleteCourseStudent(courseId, studentId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteCourseStudent(long courseId,
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.deleteCourseStudent(courseId, student);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteCourseStudents(long courseId, long[] studentIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.deleteCourseStudents(courseId, studentIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteCourseStudents(long courseId,
        java.util.List<com.epam.sb.students.model.Student> Students)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.deleteCourseStudents(courseId, Students);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.epam.sb.students.model.Student> getCourseStudents(
        long courseId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getCourseStudents(courseId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.epam.sb.students.model.Student> getCourseStudents(
        long courseId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getCourseStudents(courseId, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.epam.sb.students.model.Student> getCourseStudents(
        long courseId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getCourseStudents(courseId, start, end,
            orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCourseStudentsCount(long courseId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.getCourseStudentsCount(courseId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasCourseStudent(long courseId, long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.hasCourseStudent(courseId, studentId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasCourseStudents(long courseId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.hasCourseStudents(courseId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void setCourseStudents(long courseId, long[] studentIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _studentLocalService.setCourseStudents(courseId, studentIds);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _studentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _studentLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _studentLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.findByStudentName(studentName);
    }

    @Override
    public java.util.List<com.epam.sb.students.model.Student> findStudentsWithGradeMore5()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.findStudentsWithGradeMore5();
    }

    @Override
    public java.util.List<com.epam.sb.students.model.Student> findStudentsContaningAInName()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentLocalService.findStudentsContaningAInName();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StudentLocalService getWrappedStudentLocalService() {
        return _studentLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStudentLocalService(
        StudentLocalService studentLocalService) {
        _studentLocalService = studentLocalService;
    }

    @Override
    public StudentLocalService getWrappedService() {
        return _studentLocalService;
    }

    @Override
    public void setWrappedService(StudentLocalService studentLocalService) {
        _studentLocalService = studentLocalService;
    }
}

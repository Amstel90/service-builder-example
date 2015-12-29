package com.epam.sb.students.service.persistence;

import com.epam.sb.students.model.Course;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the course service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CoursePersistenceImpl
 * @see CourseUtil
 * @generated
 */
public interface CoursePersistence extends BasePersistence<Course> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CourseUtil} to access the course persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the course in the entity cache if it is enabled.
    *
    * @param course the course
    */
    public void cacheResult(com.epam.sb.students.model.Course course);

    /**
    * Caches the courses in the entity cache if it is enabled.
    *
    * @param courses the courses
    */
    public void cacheResult(
        java.util.List<com.epam.sb.students.model.Course> courses);

    /**
    * Creates a new course with the primary key. Does not add the course to the database.
    *
    * @param courseId the primary key for the new course
    * @return the new course
    */
    public com.epam.sb.students.model.Course create(long courseId);

    /**
    * Removes the course with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param courseId the primary key of the course
    * @return the course that was removed
    * @throws com.epam.sb.students.NoSuchCourseException if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Course remove(long courseId)
        throws com.epam.sb.students.NoSuchCourseException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.epam.sb.students.model.Course updateImpl(
        com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the course with the primary key or throws a {@link com.epam.sb.students.NoSuchCourseException} if it could not be found.
    *
    * @param courseId the primary key of the course
    * @return the course
    * @throws com.epam.sb.students.NoSuchCourseException if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Course findByPrimaryKey(long courseId)
        throws com.epam.sb.students.NoSuchCourseException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the course with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param courseId the primary key of the course
    * @return the course, or <code>null</code> if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Course fetchByPrimaryKey(long courseId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the courses.
    *
    * @return the courses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the courses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of courses
    * @param end the upper bound of the range of courses (not inclusive)
    * @return the range of courses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the courses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of courses
    * @param end the upper bound of the range of courses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of courses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the courses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of courses.
    *
    * @return the number of courses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the students associated with the course.
    *
    * @param pk the primary key of the course
    * @return the students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the students associated with the course.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the course
    * @param start the lower bound of the range of courses
    * @param end the upper bound of the range of courses (not inclusive)
    * @return the range of students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the students associated with the course.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the course
    * @param start the lower bound of the range of courses
    * @param end the upper bound of the range of courses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students associated with the course.
    *
    * @param pk the primary key of the course
    * @return the number of students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public int getStudentsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the student is associated with the course.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @return <code>true</code> if the student is associated with the course; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the course has any students associated with it.
    *
    * @param pk the primary key of the course to check for associations with students
    * @return <code>true</code> if the course has any students associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsStudents(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @throws SystemException if a system exception occurred
    */
    public void addStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param student the student
    * @throws SystemException if a system exception occurred
    */
    public void addStudent(long pk, com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students
    * @throws SystemException if a system exception occurred
    */
    public void addStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students
    * @throws SystemException if a system exception occurred
    */
    public void addStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the course and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course to clear the associated students from
    * @throws SystemException if a system exception occurred
    */
    public void clearStudents(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @throws SystemException if a system exception occurred
    */
    public void removeStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param student the student
    * @throws SystemException if a system exception occurred
    */
    public void removeStudent(long pk,
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students
    * @throws SystemException if a system exception occurred
    */
    public void removeStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students
    * @throws SystemException if a system exception occurred
    */
    public void removeStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students to be associated with the course
    * @throws SystemException if a system exception occurred
    */
    public void setStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students to be associated with the course
    * @throws SystemException if a system exception occurred
    */
    public void setStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException;
}

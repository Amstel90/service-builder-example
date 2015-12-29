package com.epam.sb.students.service.persistence;

import com.epam.sb.students.model.Student;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentPersistenceImpl
 * @see StudentUtil
 * @generated
 */
public interface StudentPersistence extends BasePersistence<Student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the students where studentName = &#63;.
    *
    * @param studentName the student name
    * @return the matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the students where studentName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param studentName the student name
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @return the range of matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the students where studentName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param studentName the student name
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student
    * @throws com.epam.sb.students.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student findByStudentName_First(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student fetchByStudentName_First(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student
    * @throws com.epam.sb.students.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student findByStudentName_Last(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student fetchByStudentName_Last(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the students before and after the current student in the ordered set where studentName = &#63;.
    *
    * @param studentId the primary key of the current student
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next student
    * @throws com.epam.sb.students.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student[] findByStudentName_PrevAndNext(
        long studentId, java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the students where studentName = &#63; from the database.
    *
    * @param studentName the student name
    * @throws SystemException if a system exception occurred
    */
    public void removeByStudentName(java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students where studentName = &#63;.
    *
    * @param studentName the student name
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public int countByStudentName(java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the student in the entity cache if it is enabled.
    *
    * @param student the student
    */
    public void cacheResult(com.epam.sb.students.model.Student student);

    /**
    * Caches the students in the entity cache if it is enabled.
    *
    * @param students the students
    */
    public void cacheResult(
        java.util.List<com.epam.sb.students.model.Student> students);

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param studentId the primary key for the new student
    * @return the new student
    */
    public com.epam.sb.students.model.Student create(long studentId);

    /**
    * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student
    * @return the student that was removed
    * @throws com.epam.sb.students.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student remove(long studentId)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.epam.sb.students.model.Student updateImpl(
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student with the primary key or throws a {@link com.epam.sb.students.NoSuchStudentException} if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student
    * @throws com.epam.sb.students.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student findByPrimaryKey(long studentId)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student, or <code>null</code> if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.epam.sb.students.model.Student fetchByPrimaryKey(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the students.
    *
    * @return the students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.epam.sb.students.model.Student> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the students.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Student> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the students from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the courses associated with the student.
    *
    * @param pk the primary key of the student
    * @return the courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> getCourses(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the courses associated with the student.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the student
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @return the range of courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> getCourses(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the courses associated with the student.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.epam.sb.students.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the student
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.epam.sb.students.model.Course> getCourses(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of courses associated with the student.
    *
    * @param pk the primary key of the student
    * @return the number of courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public int getCoursesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the course is associated with the student.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @return <code>true</code> if the course is associated with the student; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the student has any courses associated with it.
    *
    * @param pk the primary key of the student to check for associations with courses
    * @return <code>true</code> if the student has any courses associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsCourses(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @throws SystemException if a system exception occurred
    */
    public void addCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param course the course
    * @throws SystemException if a system exception occurred
    */
    public void addCourse(long pk, com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses
    * @throws SystemException if a system exception occurred
    */
    public void addCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses
    * @throws SystemException if a system exception occurred
    */
    public void addCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the student and its courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student to clear the associated courses from
    * @throws SystemException if a system exception occurred
    */
    public void clearCourses(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @throws SystemException if a system exception occurred
    */
    public void removeCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param course the course
    * @throws SystemException if a system exception occurred
    */
    public void removeCourse(long pk, com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses
    * @throws SystemException if a system exception occurred
    */
    public void removeCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses
    * @throws SystemException if a system exception occurred
    */
    public void removeCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses to be associated with the student
    * @throws SystemException if a system exception occurred
    */
    public void setCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses to be associated with the student
    * @throws SystemException if a system exception occurred
    */
    public void setCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException;
}

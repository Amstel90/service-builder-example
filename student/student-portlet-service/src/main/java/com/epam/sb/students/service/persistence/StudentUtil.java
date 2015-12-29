package com.epam.sb.students.service.persistence;

import com.epam.sb.students.model.Student;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the student service. This utility wraps {@link StudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentPersistence
 * @see StudentPersistenceImpl
 * @generated
 */
public class StudentUtil {
    private static StudentPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Student student) {
        getPersistence().clearCache(student);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Student> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Student> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Student> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Student update(Student student) throws SystemException {
        return getPersistence().update(student);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Student update(Student student, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(student, serviceContext);
    }

    /**
    * Returns all the students where studentName = &#63;.
    *
    * @param studentName the student name
    * @return the matching students
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStudentName(studentName);
    }

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
    public static java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByStudentName(studentName, start, end);
    }

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
    public static java.util.List<com.epam.sb.students.model.Student> findByStudentName(
        java.lang.String studentName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudentName(studentName, start, end, orderByComparator);
    }

    /**
    * Returns the first student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student
    * @throws com.epam.sb.students.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student findByStudentName_First(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudentName_First(studentName, orderByComparator);
    }

    /**
    * Returns the first student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student fetchByStudentName_First(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStudentName_First(studentName, orderByComparator);
    }

    /**
    * Returns the last student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student
    * @throws com.epam.sb.students.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student findByStudentName_Last(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudentName_Last(studentName, orderByComparator);
    }

    /**
    * Returns the last student in the ordered set where studentName = &#63;.
    *
    * @param studentName the student name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student fetchByStudentName_Last(
        java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStudentName_Last(studentName, orderByComparator);
    }

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
    public static com.epam.sb.students.model.Student[] findByStudentName_PrevAndNext(
        long studentId, java.lang.String studentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStudentName_PrevAndNext(studentId, studentName,
            orderByComparator);
    }

    /**
    * Removes all the students where studentName = &#63; from the database.
    *
    * @param studentName the student name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStudentName(java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStudentName(studentName);
    }

    /**
    * Returns the number of students where studentName = &#63;.
    *
    * @param studentName the student name
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public static int countByStudentName(java.lang.String studentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStudentName(studentName);
    }

    /**
    * Caches the student in the entity cache if it is enabled.
    *
    * @param student the student
    */
    public static void cacheResult(com.epam.sb.students.model.Student student) {
        getPersistence().cacheResult(student);
    }

    /**
    * Caches the students in the entity cache if it is enabled.
    *
    * @param students the students
    */
    public static void cacheResult(
        java.util.List<com.epam.sb.students.model.Student> students) {
        getPersistence().cacheResult(students);
    }

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param studentId the primary key for the new student
    * @return the new student
    */
    public static com.epam.sb.students.model.Student create(long studentId) {
        return getPersistence().create(studentId);
    }

    /**
    * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student
    * @return the student that was removed
    * @throws com.epam.sb.students.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student remove(long studentId)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(studentId);
    }

    public static com.epam.sb.students.model.Student updateImpl(
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(student);
    }

    /**
    * Returns the student with the primary key or throws a {@link com.epam.sb.students.NoSuchStudentException} if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student
    * @throws com.epam.sb.students.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student findByPrimaryKey(
        long studentId)
        throws com.epam.sb.students.NoSuchStudentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(studentId);
    }

    /**
    * Returns the student with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student, or <code>null</code> if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Student fetchByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(studentId);
    }

    /**
    * Returns all the students.
    *
    * @return the students
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.epam.sb.students.model.Student> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.epam.sb.students.model.Student> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.epam.sb.students.model.Student> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the students from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the courses associated with the student.
    *
    * @param pk the primary key of the student
    * @return the courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.epam.sb.students.model.Course> getCourses(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCourses(pk);
    }

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
    public static java.util.List<com.epam.sb.students.model.Course> getCourses(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCourses(pk, start, end);
    }

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
    public static java.util.List<com.epam.sb.students.model.Course> getCourses(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCourses(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of courses associated with the student.
    *
    * @param pk the primary key of the student
    * @return the number of courses associated with the student
    * @throws SystemException if a system exception occurred
    */
    public static int getCoursesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCoursesSize(pk);
    }

    /**
    * Returns <code>true</code> if the course is associated with the student.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @return <code>true</code> if the course is associated with the student; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsCourse(pk, coursePK);
    }

    /**
    * Returns <code>true</code> if the student has any courses associated with it.
    *
    * @param pk the primary key of the student to check for associations with courses
    * @return <code>true</code> if the student has any courses associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsCourses(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsCourses(pk);
    }

    /**
    * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @throws SystemException if a system exception occurred
    */
    public static void addCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCourse(pk, coursePK);
    }

    /**
    * Adds an association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param course the course
    * @throws SystemException if a system exception occurred
    */
    public static void addCourse(long pk,
        com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCourse(pk, course);
    }

    /**
    * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses
    * @throws SystemException if a system exception occurred
    */
    public static void addCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCourses(pk, coursePKs);
    }

    /**
    * Adds an association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses
    * @throws SystemException if a system exception occurred
    */
    public static void addCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCourses(pk, courses);
    }

    /**
    * Clears all associations between the student and its courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student to clear the associated courses from
    * @throws SystemException if a system exception occurred
    */
    public static void clearCourses(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearCourses(pk);
    }

    /**
    * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePK the primary key of the course
    * @throws SystemException if a system exception occurred
    */
    public static void removeCourse(long pk, long coursePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCourse(pk, coursePK);
    }

    /**
    * Removes the association between the student and the course. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param course the course
    * @throws SystemException if a system exception occurred
    */
    public static void removeCourse(long pk,
        com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCourse(pk, course);
    }

    /**
    * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses
    * @throws SystemException if a system exception occurred
    */
    public static void removeCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCourses(pk, coursePKs);
    }

    /**
    * Removes the association between the student and the courses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses
    * @throws SystemException if a system exception occurred
    */
    public static void removeCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCourses(pk, courses);
    }

    /**
    * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param coursePKs the primary keys of the courses to be associated with the student
    * @throws SystemException if a system exception occurred
    */
    public static void setCourses(long pk, long[] coursePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setCourses(pk, coursePKs);
    }

    /**
    * Sets the courses associated with the student, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the student
    * @param courses the courses to be associated with the student
    * @throws SystemException if a system exception occurred
    */
    public static void setCourses(long pk,
        java.util.List<com.epam.sb.students.model.Course> courses)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setCourses(pk, courses);
    }

    public static StudentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StudentPersistence) PortletBeanLocatorUtil.locate(com.epam.sb.students.service.ClpSerializer.getServletContextName(),
                    StudentPersistence.class.getName());

            ReferenceRegistry.registerReference(StudentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StudentPersistence persistence) {
    }
}

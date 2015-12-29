package com.epam.sb.students.service.persistence;

import com.epam.sb.students.model.Course;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the course service. This utility wraps {@link CoursePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CoursePersistence
 * @see CoursePersistenceImpl
 * @generated
 */
public class CourseUtil {
    private static CoursePersistence _persistence;

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
    public static void clearCache(Course course) {
        getPersistence().clearCache(course);
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
    public static List<Course> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Course> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Course> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Course update(Course course) throws SystemException {
        return getPersistence().update(course);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Course update(Course course, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(course, serviceContext);
    }

    /**
    * Caches the course in the entity cache if it is enabled.
    *
    * @param course the course
    */
    public static void cacheResult(com.epam.sb.students.model.Course course) {
        getPersistence().cacheResult(course);
    }

    /**
    * Caches the courses in the entity cache if it is enabled.
    *
    * @param courses the courses
    */
    public static void cacheResult(
        java.util.List<com.epam.sb.students.model.Course> courses) {
        getPersistence().cacheResult(courses);
    }

    /**
    * Creates a new course with the primary key. Does not add the course to the database.
    *
    * @param courseId the primary key for the new course
    * @return the new course
    */
    public static com.epam.sb.students.model.Course create(long courseId) {
        return getPersistence().create(courseId);
    }

    /**
    * Removes the course with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param courseId the primary key of the course
    * @return the course that was removed
    * @throws com.epam.sb.students.NoSuchCourseException if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Course remove(long courseId)
        throws com.epam.sb.students.NoSuchCourseException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(courseId);
    }

    public static com.epam.sb.students.model.Course updateImpl(
        com.epam.sb.students.model.Course course)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(course);
    }

    /**
    * Returns the course with the primary key or throws a {@link com.epam.sb.students.NoSuchCourseException} if it could not be found.
    *
    * @param courseId the primary key of the course
    * @return the course
    * @throws com.epam.sb.students.NoSuchCourseException if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Course findByPrimaryKey(
        long courseId)
        throws com.epam.sb.students.NoSuchCourseException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(courseId);
    }

    /**
    * Returns the course with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param courseId the primary key of the course
    * @return the course, or <code>null</code> if a course with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.epam.sb.students.model.Course fetchByPrimaryKey(
        long courseId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(courseId);
    }

    /**
    * Returns all the courses.
    *
    * @return the courses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.epam.sb.students.model.Course> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.epam.sb.students.model.Course> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.epam.sb.students.model.Course> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the courses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of courses.
    *
    * @return the number of courses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the students associated with the course.
    *
    * @param pk the primary key of the course
    * @return the students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getStudents(pk);
    }

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
    public static java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getStudents(pk, start, end);
    }

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
    public static java.util.List<com.epam.sb.students.model.Student> getStudents(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getStudents(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of students associated with the course.
    *
    * @param pk the primary key of the course
    * @return the number of students associated with the course
    * @throws SystemException if a system exception occurred
    */
    public static int getStudentsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getStudentsSize(pk);
    }

    /**
    * Returns <code>true</code> if the student is associated with the course.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @return <code>true</code> if the student is associated with the course; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsStudent(pk, studentPK);
    }

    /**
    * Returns <code>true</code> if the course has any students associated with it.
    *
    * @param pk the primary key of the course to check for associations with students
    * @return <code>true</code> if the course has any students associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsStudents(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsStudents(pk);
    }

    /**
    * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @throws SystemException if a system exception occurred
    */
    public static void addStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addStudent(pk, studentPK);
    }

    /**
    * Adds an association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param student the student
    * @throws SystemException if a system exception occurred
    */
    public static void addStudent(long pk,
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addStudent(pk, student);
    }

    /**
    * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students
    * @throws SystemException if a system exception occurred
    */
    public static void addStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addStudents(pk, studentPKs);
    }

    /**
    * Adds an association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students
    * @throws SystemException if a system exception occurred
    */
    public static void addStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addStudents(pk, students);
    }

    /**
    * Clears all associations between the course and its students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course to clear the associated students from
    * @throws SystemException if a system exception occurred
    */
    public static void clearStudents(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearStudents(pk);
    }

    /**
    * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPK the primary key of the student
    * @throws SystemException if a system exception occurred
    */
    public static void removeStudent(long pk, long studentPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeStudent(pk, studentPK);
    }

    /**
    * Removes the association between the course and the student. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param student the student
    * @throws SystemException if a system exception occurred
    */
    public static void removeStudent(long pk,
        com.epam.sb.students.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeStudent(pk, student);
    }

    /**
    * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students
    * @throws SystemException if a system exception occurred
    */
    public static void removeStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeStudents(pk, studentPKs);
    }

    /**
    * Removes the association between the course and the students. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students
    * @throws SystemException if a system exception occurred
    */
    public static void removeStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeStudents(pk, students);
    }

    /**
    * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param studentPKs the primary keys of the students to be associated with the course
    * @throws SystemException if a system exception occurred
    */
    public static void setStudents(long pk, long[] studentPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setStudents(pk, studentPKs);
    }

    /**
    * Sets the students associated with the course, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the course
    * @param students the students to be associated with the course
    * @throws SystemException if a system exception occurred
    */
    public static void setStudents(long pk,
        java.util.List<com.epam.sb.students.model.Student> students)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setStudents(pk, students);
    }

    public static CoursePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CoursePersistence) PortletBeanLocatorUtil.locate(com.epam.sb.students.service.ClpSerializer.getServletContextName(),
                    CoursePersistence.class.getName());

            ReferenceRegistry.registerReference(CourseUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CoursePersistence persistence) {
    }
}

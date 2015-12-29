package com.epam.sb.students.service.persistence;

import com.epam.sb.students.model.Course;
import com.epam.sb.students.service.CourseLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CourseActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CourseActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CourseLocalServiceUtil.getService());
        setClass(Course.class);

        setClassLoader(com.epam.sb.students.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("courseId");
    }
}

package com.epam.sb.students.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class StudentFinderUtil {
    private static StudentFinder _finder;

    public static java.util.List<com.epam.sb.students.model.Student> findLikeA() {
        return getFinder().findLikeA();
    }

    public static StudentFinder getFinder() {
        if (_finder == null) {
            _finder = (StudentFinder) PortletBeanLocatorUtil.locate(com.epam.sb.students.service.ClpSerializer.getServletContextName(),
                    StudentFinder.class.getName());

            ReferenceRegistry.registerReference(StudentFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(StudentFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(StudentFinderUtil.class, "_finder");
    }
}

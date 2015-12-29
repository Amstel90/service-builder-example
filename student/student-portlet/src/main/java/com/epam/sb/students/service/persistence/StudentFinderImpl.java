package com.epam.sb.students.service.persistence;


import com.epam.sb.students.model.Student;
import com.epam.sb.students.model.impl.StudentImpl;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.util.List;

public class StudentFinderImpl extends BasePersistenceImpl<Student> implements StudentFinder{

    public List<Student> findLikeA() {
        Session session = null;

        try {

            session = openSession();

            String sql = CustomSQLUtil.get(FIND_LIKE_A);

            SQLQuery q = session.createSQLQuery(sql);
            q.addEntity("Student_Student", StudentImpl.class);
            q.setCacheable(false);

            return (List<Student>) QueryUtil.list(q, getDialect(), -1, -1);
        } catch (Exception e) {
            try {
                throw new SystemException(e);
            } catch (SystemException se) {
                se.printStackTrace();
            }
        } finally {
            closeSession(session);
        }

        return null;
    }

    private static final String FIND_LIKE_A =
            StudentFinder.class.getName() + ".findLikeA";

}

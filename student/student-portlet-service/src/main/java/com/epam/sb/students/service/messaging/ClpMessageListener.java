package com.epam.sb.students.service.messaging;

import com.epam.sb.students.service.ClpSerializer;
import com.epam.sb.students.service.CourseLocalServiceUtil;
import com.epam.sb.students.service.CourseServiceUtil;
import com.epam.sb.students.service.StudentLocalServiceUtil;
import com.epam.sb.students.service.StudentServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            CourseLocalServiceUtil.clearService();

            CourseServiceUtil.clearService();
            StudentLocalServiceUtil.clearService();

            StudentServiceUtil.clearService();
        }
    }
}

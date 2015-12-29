<%@ page import="javax.portlet.PortletURL" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="backURL">
    <portlet:param name="view" value="student_list"/>
</portlet:renderURL>
<liferay-ui:header backURL="${backURL}" backLabel="students list" title="students"/>

<aui:fieldset>

    <aui:field-wrapper inlineLabel="true" label="id">:
        ${student.studentId}
    </aui:field-wrapper>
    <aui:field-wrapper inlineLabel="true" label="name">:
        ${student.studentName}
    </aui:field-wrapper>

    <aui:field-wrapper inlineLabel="true" label="grade">:
        ${student.grade}
    </aui:field-wrapper>

    <aui:button-row>
        <portlet:renderURL var="editURL">
            <portlet:param name="action" value="student_edit"/>
            <portlet:param name="studentId" value="${student.studentId}"/>
        </portlet:renderURL>
        <aui:button href="${editURL}" value="Edit Student" />
    </aui:button-row>

</aui:fieldset>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
    PortletURL iteratorURL = renderResponse.createRenderURL();
    iteratorURL.setParameter("action", "student_list");
%>

<h1>Student List</h1>

<aui:button-row>
    <portlet:renderURL var="addURL">
        <portlet:param name="action" value="student_add"/>
    </portlet:renderURL>
    <aui:button href="${addURL}" value="Add Student" />
</aui:button-row>



<liferay-ui:search-container delta="5"
                             iteratorURL="<%= iteratorURL %>"
                             emptyResultsMessage="no-items-were-found">

    <liferay-ui:search-container-results results="${students}"/>

    <liferay-ui:search-container-row className="com.epam.sb.students.model.Student"
                                     keyProperty="primaryKey"
                                     modelVar="item"
                                     rowIdProperty="primaryKey">
        <portlet:renderURL var="rowURL">
            <portlet:param name="action" value="student_view" />
            <portlet:param name="studentId" value="${item.studentId}" />
        </portlet:renderURL>

        <liferay-ui:search-container-column-text href="${rowURL}" name="id" property="studentId"/>
        <liferay-ui:search-container-column-text href="${rowURL}" name="name" property="studentName"/>
        <liferay-ui:search-container-column-text href="${rowURL}" name="grade" property="grade"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<portlet:renderURL var="listDynamicQuery">
    <portlet:param name="action" value="student_list_dynamic_query"/>
</portlet:renderURL>

<portlet:renderURL var="listCutomSQL">
    <portlet:param name="action" value="student_list_custom_sql"/>
</portlet:renderURL>

<ul>
    <li>
        <aui:a href="${listDynamicQuery}">
            View Dynamic Query Results
        </aui:a>
    </li>

    <li>
        <aui:a href="${listCutomSQL}" >
            View Custom SQL Results
        </aui:a>
    </li>
</ul>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.epam.sb.students.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:actionURL name="student_save" var="saveURL"/>

<aui:form  action="${saveURL}" method="post">

    <aui:model-context bean="${student}" model="<%= Student.class %>"/>

    <aui:input name="studentId" type="hidden"/>

    <aui:fieldset>
        <aui:input name="studentName" cssClass="name"/>
        <aui:input name="grade" cssClass="name"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="save"/>
        <aui:button value="cancel" onClick="javascript:history.go(-1)"/>
    </aui:button-row>
</aui:form>
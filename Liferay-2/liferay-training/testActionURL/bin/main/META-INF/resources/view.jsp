<%@ include file="/init.jsp" %>

<portlet:defineObjects/>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<<portlet:actionURL name="actionmethod" var="actionmethodURL" />

<a href="${actionmethodURL}">Action url created by liferay</a>
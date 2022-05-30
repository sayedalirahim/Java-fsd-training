<%@ include file="/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>


<h1>Sender:</h1>
<portlet:actionURL name="sender" var="sender"></portlet:actionURL>


<form action="${sender}" method="post">
Enter a message:-
<input type="text" name="<portlet:namespace/>message">
<input type="submit">
</form>

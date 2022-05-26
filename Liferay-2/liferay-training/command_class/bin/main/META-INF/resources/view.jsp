<%@ include file="/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:renderURL var="viewLeave">
<portlet:param name="leaveId" value="1234"/>
<portlet:param name="mvcRenderCommandName" value="viewleave_info"/>
</portlet:renderURL>

<portlet:actionURL name="leave_editLeave" var="editLeave">
<portlet:param name="mvcActionCommand" value="leave_editLeave"/>
</portlet:actionURL>

<portlet:resourceURL id="delete_leave_res" var="deleteLeavesRes">
<portlet:param name="leaveId" value="abcd"/>
</portlet:resourceURL>




<a href="${viewLeave}">Render url created by liferay</a>
<br/>
<a href="${editLeave}">Action url created by liferay</a>

<br/>
<aui:a href="${deleteLeavesRes}">Click here to delete</aui:a>

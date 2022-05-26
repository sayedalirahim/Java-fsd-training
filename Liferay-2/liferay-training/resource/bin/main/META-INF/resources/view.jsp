<%@ include file="/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>





<liferay-portlet:resourceURL var="resourceUrl1">
<liferay-portlet:param name="param1" value="Value1" />
</liferay-portlet:resourceURL>

<a href="#" onclick="callServeResource()"> This is resource</a>
<script type="text/javascript">
function callServeResource(){
	AUI().use('aui-io-request', function(A){
		A.io.request('${resourceUrl1}',{
			method:'post',
			data: {
			<portlet:namespace />param2: 'value2',
	},
	on: {
		success: function()
		{
			alert(this.get('responseData'));
		}
	}
	
	});
});
}
</script>
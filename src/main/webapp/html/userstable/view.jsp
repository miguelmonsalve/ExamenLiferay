

<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<portlet:defineObjects />

<h2>Tabla de usuarios registrados de Liferay</h2>

<%
List<User> users = (List<User>)renderRequest.getAttribute("usuarios");
%>


<table class="table table-striped table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Apellido</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach items="<%=users%>" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
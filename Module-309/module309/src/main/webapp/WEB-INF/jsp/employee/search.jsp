<%--
  Created by IntelliJ IDEA.
  User: Jerome Work
  Date: 12/16/2024
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section class="bg-light2 pt-5 pb-5">
    <div class="container">
        <h1 class="text-center">Employee Search</h1>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/employee/search" class="mb-0">
            <div class="row justify-content-center">
                <div class="col-6">
                    <div class="mb-3">
<%--                        <label for="firstNameId" class="form-label">First Name</label>--%>
<%--                        <input type="text" class="form-control" id="firstNameId" name="firstName" value="${search}">--%>
                        <label for="employeeId" class="form-label">Employee ID</label>
                        <input type="number" class="form-control" id="employeeId" name="employeeId" value="${search}">
                    </div>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-6">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </div>
        </form>
    </div>
</section>

<c:if test="${not empty search}">
    <section class="bg-light2 pt-5 pb-5">
        <div class="container">
            <h2 class="text-center">Employees Found (${employeesKey})</h2>

            <table class="table mt-5">
                <tr>
                    <th>Employee ID</th>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>Employee Email</th>
                    <th>Office ID</th>
                </tr>
                <c:forEach var="employee" items="${employeesKey}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.firstname}</td>
                        <td>${employee.lastname}</td>
                        <td>${employee.email}</td>
                        <td>${employee.officeId}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</c:if>

<jsp:include page="../include/footer.jsp"/>
</body>
</html>

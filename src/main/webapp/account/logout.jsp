<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/2/20
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    session.invalidate();
    response.sendRedirect("/streamMedia");
%>
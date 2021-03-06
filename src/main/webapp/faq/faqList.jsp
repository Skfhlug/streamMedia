<%--
  Created by IntelliJ IDEA.
  User: Jeanne
  Date: 2/28/20
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../taglib.jsp"%>
<c:set var="title" value="FAQ List" />
<%@include file="../head.jsp"%>
<link rel="stylesheet" href="css/account.css">
</head>
<body>
<%@include file="../navbar.jsp"%>
<main class="container-fluid wrapper">
    <div class="row">
        <div class="col-sm-8">

            <ul class="list-group list-group-flush">
                <li class="list-group-item list-group-item-info"><h1>All FAQ</h1></li>
                <c:forEach var="faq" items="${listFAQ}">
                    <li class="list-group-item "><a class="btn-link mr-auto" href="faq-details?uid=<c:out value="${faq.faqId}"/>">${faq.title}</a>
                        <c:if test="${pageContext.request.isUserInRole('admin')}">
                        <span class="btn-group ml-auto btn-media-right" role="group" aria-label="Edit and Delete FAQ">
                        <a href="faq-edit?uid=<c:out value="${faq.faqId}"/>" class="btn btn-primary" ><i class="fas fa-edit fa-2x" aria-hidden="true"></i>Edit FAQ</a>
                    <a href="faq-delete?uid=<c:out value="${faq.faqId}"/>" class="btn btn-danger" ><i class="fas fa-trash-alt fa-2x" aria-hidden="true"></i>Delete FAQ</a>

                        </span>
                        </c:if>
                    </li>
                </c:forEach>
                <c:if test="${pageContext.request.isUserInRole('admin')}">

                    <a href="faq-new" class="btn btn-success ml-auto" ><i class="fas fa-plus-square fa-1x"></i>Add FAQ</a>
               </c:if>

            </ul>
        </div>

</div>
</main>

<%@include file="../footer.jsp"%>
<%@include file="../afterFooter.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Jeanne
  Date: 2/28/20
  Time: Date: 3/1/20
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../taglib.jsp"%>
<c:set var="title" value="Genre Details" />
<%@include file="../head.jsp"%>
<link rel="stylesheet" href="css/account.css">
</head>
<body>
<%@include file="../navbar.jsp"%>
<main class="container-fluid wrapper" role="main">
   <h1>Genre Details</h1>
      <div class="row">
         <c:choose>
            <c:when test="${genre ne null}">
               <div class="col-sm-6 offset-sm-3">
                  <div class="card">

                     <div class="card-body">
                        <h2 class="card-title">${genre.title}</h2>
                        <ul class="list-group list-group-flush">
                           <li class="list-group-item">${genre.description}</li>
                        </ul>
                     </div>
                     <c:if test="${pageContext.request.isUserInRole('admin')}">
                            <span class="btn-group ml-auto " role="group" aria-label="Edit and Delete Genre">
                        <a href="genre-edit?uid=<c:out value="${genre.genreId}"/>" class="btn btn-primary" >
                            <i class="fas fa-edit fa-2x" aria-hidden="true"></i>Edit Genre</a>
                    <a href="genre-delete?uid=<c:out value="${genre.genreId}"/>" class="btn btn-danger" >
                        <i class="fas fa-trash-alt fa-2x" aria-hidden="true"></i>Delete Genre</a>
                        </span>
                     </c:if>
                     <a href="genres" class="btn btn-link" ><i class="fas fa-list"></i> Genre List</a>
                  </div>
               </div>
            </c:when>
            <c:otherwise>
               <p>Genre was not found!</p>
            </c:otherwise>
         </c:choose>

      </div>
</main>
<%@include file="../footer.jsp"%>
<%@include file="../afterFooter.jsp"%>
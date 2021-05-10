<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="head.jsp" %>
<%@include file="footer.jsp" %>

</head>
<body>

<!-- This is Add Note form -->
<div class="container">
<%@include file="navbar.jsp" %>
</div>
<br>

<div class="container ">
<h3>Please Fill Your Note Details...</h3>
<br>
<!--This is Add Form  -->
<form action="SaveNoteServlet" method="post">
  <div class="mb-3">
    <label for="title" class="form-label" ><b>Note Title</b></label>
    <input name="txttitle" type="text" class="form-control" id="titlle" placeholder="Enter here" required />
  
  </div>
  <div class="mb-3">
    <label for="Content" class="form-label"><b>Note Content</b></label>
    <textarea name="txtcontent"
     class="form-control"
      id="content" 
      style="min-height:250px" 
      placeholder="Enter your content here"
       required ></textarea>
  </div>
  
  <div class="container text-center">
  <button type="submit" class="btn btn-primary"><b>ADD</b></button>
  </div>
</form>
</div>
</body>
</html>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.helper.*,org.hibernate.*,com.entities.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="head.jsp" %>
<%@include file="footer.jsp" %>
</head>
<body>
<div class="container">
	<%@ include file="navbar.jsp" %>
	
	<h2>Edit Your Note</h2>

    <br>
    <%
    int noteId=Integer.parseInt(request.getParameter("note_id").trim());
    Session s=FactoryProvider.getFactory().openSession();
    
    
    Note note=(Note) s.get(Note.class, noteId);
    s.close();
    %>
    <!--This is Edit Form  -->
<form action="UpdateServlet" method="post">
  <div class="mb-3">
  <input value="<%=note.getId()%>" name="noteId" type="hidden"/>
  
  
    <label for="title" class="form-label" ><b>Note Title</b></label>
    <input name="txttitle" type="text"
     class="form-control"
      id="titlle"
     placeholder="Enter here" value="<%=note.getTitle() %>" />
  
  </div>
  <div class="mb-3">
  
  
    <label for="Content" class="form-label"><b>Note Content</b></label>
    <textarea name="txtcontent"
     class="form-control"
      id="content" 
      style="min-height:250px" 
      placeholder="Enter your content here"
      ><%=note.getContent() %></textarea>
      
  </div>
  
  <div class="container text-center">
  <button type="submit" class="btn btn-success"><b>SAVE YOUR NOTE</b></button>
  </div>
</form>
	</div>
</body>
</html>
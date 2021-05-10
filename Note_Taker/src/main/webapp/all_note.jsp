<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes:Taker</title>
<%@include file="head.jsp" %>
<%@include file="footer.jsp" %>
</head>
<body>
<div class="container">
<%@include file="navbar.jsp" %>
<br>
<h1 class="text-uppercase">All Notes</h1>

<div class="row">
<div class="col-12">
<%
Session s=FactoryProvider.getFactory().openSession();

Query q1=s.createQuery("from Note");
List<Note> list=q1.list();
for(Note note:list)
{
%>
<div class="card mt-3">
<br>
  <img src="img/notes.png" style="max-width:100px;" class="card-img-top col-4 mx-auto text-center">
  <div class="card-body px-5">
    <h5 class="card-title"><%= note.getTitle() %></h5>
    <p class="card-text" ><%= note.getContent() %></p>
  
    <p class="text-primary" style="margin-left:1075px"><b><%=note.getAddedDate() %></b></p>
    <div class="container text-center mt-2">
    <a href="DeleteNoteServlet?note_id=<%= note.getId() %>" class="btn btn-danger">DELETE</a>
    <a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">UPDATE</a>
    </div>
  </div>
</div>
	<%
}

s.close();

%>

</div>
</div>

</div>

</body>
</html>
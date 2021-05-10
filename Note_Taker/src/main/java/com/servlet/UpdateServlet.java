package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
			 
			 
		  String title=request.getParameter("txttitle");
		  String content=request.getParameter("txtcontent");
		  int  noteId=Integer.parseInt(request.getParameter("noteId").trim());
		  
		  Session s=FactoryProvider.getFactory().openSession();
		  Transaction tx=s.beginTransaction();
		  
		  Note n1=s.get(Note.class, noteId);
		  n1.setTitle(title);
		  n1.setContent(content);
		  n1.setAddedDate(new Date());
		  tx.commit();
		  
		  s.close();
		  
		  response.sendRedirect("all_note.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

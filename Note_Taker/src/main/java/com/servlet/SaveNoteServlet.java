package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.persistence.Temporal;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//Title,Content Fetch
			
			String title=request.getParameter("txttitle");
			String content=request.getParameter("txtcontent");
			
	
			
			Note n1=new Note(title,content,new Date());
			//System.out.println(n1.getId()+" : "+n1.getTitle());
			
			//Hiberante:save()
			Session s= FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			s.save(n1);
			tx.commit();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1 style='text-align:center'>Note is Added Successfully</h1>");
			out.println("<h1 style='text-align:center'><a href='all_note.jsp'>View All</a></h1>");
			
			
			s.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

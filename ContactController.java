package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactDAO;
import model.ContactDTO;

@WebServlet("/contact_1")
public class ContactController extends HttpServlet{
	
	   @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   PrintWriter pw=resp.getWriter();
		   
		  
			   String getName=req.getParameter("name1");
			   String getMail=req.getParameter("mail1");
			   String getSubject=req.getParameter("subject1");
			   String getMessage=req.getParameter("message1");
			   
			   pw.print(getName);
			   pw.print(getMail);
			   pw.print(getSubject);
			   pw.print(getMessage);
			   
			   ContactDTO c1=new ContactDTO();
			   ContactDAO c2=new ContactDAO();
			   
			   c1.setContact_name(getName);
			   c1.setContact_mail(getMail);
			   c1.setContact_subject(getSubject);
			   c1.setContact_message(getMessage);
			   
			  
			  
			   int count= c2.getContact(c1);
			   pw.print(count);
			   
			   if(count>0) {
			   pw.print("record inserted");
			   }else {
				   pw.print("record not inserted");
			   }
		   }
	   }
	



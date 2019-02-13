package com.eamtk.embedded.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
         throws ServletException, IOException {
	   
	  new StartupJBPMProcess(); 
	  
      resp.setContentType("text/plain");
      resp.getWriter().write("Hello World! Maven Web Project - KAEAM Servlet Process Edition.");
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		   throws ServletException, IOException {
	   
	   new StartupJBPMProcess();
	   
	   resp.setContentType("text/plain");
	   resp.getWriter().write("Hello World! Maven Web Project - KAEAM Servlet Process Edition.");
   }
  
}

package com.javacodegeeks.examples.view;

import java.io.IOException;

//import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexView extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		storeInSessionAndRespond(request, response);
	}

	private void storeInSessionAndRespond(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int firstParam = Integer.parseInt(request.getParameter("arg0").toString());
		int secondParam = Integer.parseInt(request.getParameter("arg1").toString());
		
		
		String str = request.getParameter("operazione"); 

		 	int tot=0; 
			
		 	if ("add".equals(str)){ 
		 		tot = firstParam+secondParam; 
		 	} 
		 	else if ("sub".equals(str)){ 
		 		tot = firstParam-secondParam; 
		 	} 
		 	else if ("mul".equals(str)){ 
		 		tot = firstParam*secondParam; 
		 	} 
		 	else if ("div".equals(str)){ 
		 		tot = firstParam/secondParam; 
		 	} 
			
		 	Integer result = Integer.valueOf(tot); 
		 	System.out.println(result); 
		
		
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}

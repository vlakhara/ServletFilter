package com.vipul;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/result")
public class FilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollNo = Integer.parseInt(request.getParameter("sRoll"));
		int marks = Integer.parseInt(request.getParameter("sMarks"));
		int per = Integer.parseInt(request.getParameter("sPer"));
		String name = request.getParameter("sName");
		PrintWriter out = response.getWriter();
		out.println("	Roll No. 	: " + rollNo);
		out.println("	Name 	 	: " + name);
		out.println("	Marks	 	: " + marks + "/500");
		out.println("	Percentage  	: " + per);
		out.println();
		out.println("	" + request.getAttribute("k") + "	");
	}
}
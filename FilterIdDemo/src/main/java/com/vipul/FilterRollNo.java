package com.vipul;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/result")
//@WebFilter("/hello.jsp")
public class FilterRollNo implements Filter {
       
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		req.setAttribute("k", "From Filter");
		if(Integer.parseInt(request.getParameter("sRoll")) >  0)
			chain.doFilter(request, response);
		else
			resp.sendRedirect("index.jsp");
			
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}

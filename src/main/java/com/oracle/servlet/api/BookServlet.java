package com.oracle.servlet.api;

import com.alibaba.fastjson.JSON;
import com.oracle.service.impl.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "BookServlet",urlPatterns = "/book.html")
public class BookServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	private BookService bookService =new BookService();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Map> maps = bookService.queryBooks();
			response.getWriter().append(JSON.toJSONString(maps));
		}catch (Exception e){
			e.printStackTrace();
			response.getWriter().append("服务器异常了");
		}



	}
}

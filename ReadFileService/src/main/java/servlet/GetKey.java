package servlet;

import java.io.IOException;
import java.util.ArrayList;

import ApplicationDao.ApplicationFunctions;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/getKey")
public class GetKey extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String keyword = req.getParameter("key");
		ApplicationFunctions af = new ApplicationFunctions();
		
		ArrayList<String> lines = af.getKeyLines(keyword);
		HttpSession session = req.getSession();
		
		session.setAttribute("searchedLines", lines);
		
		req.getRequestDispatcher("/jsp/searchedLines.jsp").forward(req, resp);
		
	}
	
	
}

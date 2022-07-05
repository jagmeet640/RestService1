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

@WebServlet("/readData")
public class Read extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationFunctions af = new ApplicationFunctions();
		ArrayList<String> file = new ArrayList<>();
		file = af.linkToLogFile();
		HttpSession session = req.getSession();
		session.setAttribute("file", file);
		req.getRequestDispatcher("/jsp/readFile.jsp").forward(req, resp);
	}

}

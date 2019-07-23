package day3.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/count", "" })
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Count sessCount = (Count) request.getSession().getAttribute("sessCount");
		sessCount.plusOne();
		Count appCount = (Count) request.getServletContext().getAttribute("appCount");
		appCount.plusOne();
		
		request.getRequestDispatcher("/WEB-INF/Count.jsp").forward(request, response);
	}
}

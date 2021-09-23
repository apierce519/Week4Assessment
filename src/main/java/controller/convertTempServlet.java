package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class convertTempServlet
 */
@WebServlet("/convertTempServlet")
public class convertTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// private static double newTemp = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public convertTempServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String temperature = request.getParameter("Temperature");
		String conversionType = request.getParameter("conversionType");
		// convertTemperature(temperature);
		TempConverter converter = new TempConverter(conversionType, temperature);
		request.setAttribute("convertedTemperature", converter);
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);

	}
}

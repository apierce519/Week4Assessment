package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StringSorter;

/**
 * Servlet implementation class alphabetizeServlet
 */
@WebServlet("/alphabetizeServlet")
public class alphabetizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public alphabetizeServlet() {
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

		ArrayList<String> wordList = new ArrayList<>();
		wordList.add(request.getParameter("Word1"));
		wordList.add(request.getParameter("Word2"));
		wordList.add(request.getParameter("Word3"));
		wordList.add(request.getParameter("Word4"));
		wordList.add(request.getParameter("Word5"));

		StringSorter sorter = new StringSorter(wordList);

		request.setAttribute("sortedList", sorter);
		getServletContext().getRequestDispatcher("/alphabetizedResults.jsp").forward(request, response);

	}

}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.SunshineRestFul_client;

/**
 * Servlet implementation class SunshineRestFulController
 */
@WebServlet("/SunshineRestFulController")
public class SunshineRestFulController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SunshineRestFulController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String tenhs = request.getParameter("tenhs");
		SunshineRestFul_client ss = new SunshineRestFul_client();
		if (action.equalsIgnoreCase("timxml")) {
			request.setAttribute("dshs", ss.findXML(tenhs));
			request.getRequestDispatcher("demo.jsp").forward(request, response);
		} else if (action.equalsIgnoreCase("timjson")){
			request.setAttribute("dshs1", ss.findJSON(tenhs));
			request.getRequestDispatcher("demo.jsp").forward(request, response);
		}
	}

}

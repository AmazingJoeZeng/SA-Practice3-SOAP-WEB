package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soap_alimail.Webservice;
import soap_alimail.WebserviceService;

/**
 * Servlet implementation class ServerMain
 */
@WebServlet("/ServerMain")
public class ServerMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String address=request.getParameter("address");
		String content=request.getParameter("content");
		WebserviceService WebServiceService = new WebserviceService();
		Webservice WebServicePort = WebServiceService.getWebservicePort();
		WebServicePort.sendMail(address, content);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String address=request.getParameter("address");
		String content=request.getParameter("content");
		WebserviceService WebServiceService = new WebserviceService();
		Webservice WebServicePort = WebServiceService.getWebservicePort();
		WebServicePort.sendMail(address, content);
	}

}

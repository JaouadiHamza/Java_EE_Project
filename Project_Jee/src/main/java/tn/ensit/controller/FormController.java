package tn.ensit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tn.ensit.beans.*;
/**
 * Servlet implementation class FormController
 */
@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true) ;
		
		String fname = (String ) request.getParameter("fname") ;
		
		float Chest = Float.parseFloat(request.getParameter("Chest"))  ;
		float Stomach = Float.parseFloat(request.getParameter("Stomach"))  ;
		float Waist = Float.parseFloat(request.getParameter("Waist"))  ;
		float Hip = Float.parseFloat(request.getParameter("Hip"))  ;
		float Sleeve_Length = Float.parseFloat(request.getParameter("Sleeve_Length"))  ;
		
		
		float Shoulder = Float.parseFloat(request.getParameter("Shoulder"))  ;
		float Length = Float.parseFloat(request.getParameter("Length"))  ;
		int  budget = Integer.parseInt(request.getParameter("budget"))  ;
		//float Shoulder = Float.parseFloat(request.getParameter("Shoulder"))  ;

		Suits suits = new Suits (Shoulder, Length, budget) ;	
		
		float price = suits.price(suits.getBudget()); 
		
		session.setAttribute("priceTot",price) ;
		session.setAttribute("fname",fname) ;
		session.setAttribute("Chest",Chest) ;
		session.setAttribute("Waist",Waist) ;
		session.setAttribute("Hip",Hip) ;
		session.setAttribute("Sleeve_Length",Sleeve_Length) ;
		session.setAttribute("Stomach",Stomach) ;
		session.setAttribute("Length",Length) ;
		session.setAttribute("budget",budget) ;
		session.setAttribute("Shoulder",Shoulder) ;
		
		
		
		
		
		
		
		
		
		
		
		
		request.getRequestDispatcher("/Result.jsp").forward(request, response);
		doGet(request, response);
		
		
	}

}

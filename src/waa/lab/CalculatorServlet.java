package waa.lab;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("calculator.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String add1 = request.getParameter("num1").trim() ;
		String add2 = request.getParameter("num2").trim();
		String mult1 = request.getParameter("num3").trim();
		String mult2 = request.getParameter("num4").trim();

		String sum = "";
		String product = "";
		Calculator calculator = new Calculator();
		
		try{
			Integer a1 = Integer.parseInt(add1);
			Integer a2 = Integer.parseInt(add2);
			sum = "" + calculator.add(a1, a2);
		}catch (NumberFormatException e){
			if (add1.isEmpty()) add1 = "";
			if (add2.isEmpty()) add2 = "";
			sum = "";
		}
		
		try{
			Integer m1 = Integer.parseInt(mult1);
			Integer m2 = Integer.parseInt(mult2);
			product = "" + calculator.multiply(m1, m2);
		}catch(NumberFormatException e) {
			if (mult1.isEmpty()) mult1 = "";
			if (mult2.isEmpty()) mult2 = "";
			product = "";
		}
		MyData result = new MyData(add1, add2, sum, mult1, mult2, product);		
		request.setAttribute("result", result);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}

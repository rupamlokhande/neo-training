package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bmi")
public class CalculateBMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public CalculateBMIServlet() {
        // TODO Auto-generated constructor stub
    }


//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double w=Double.parseDouble(request.getParameter("weight"));
        double h=Double.parseDouble(request.getParameter("height"));
        CalculateBMI cb=new CalculateBMI();
        double ans=cb.Calculate(w,h);
        String result=cb.description(ans);
        System.out.println(result);
        System.out.println(w);
        System.out.println(h);
		request.setAttribute("result",result);
		RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}

}

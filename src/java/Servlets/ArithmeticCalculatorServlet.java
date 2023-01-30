package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zeina Mint
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Retrieve input and initialize it
        String input1 = request.getParameter("num1");
        request.setAttribute("num1", input1);
        
        
        String input2 = request.getParameter("num2");
        request.setAttribute("num2", input2);
        
        String arithmetic = request.getParameter("submit");
        request.setAttribute("submit", arithmetic);

        
        //If age is empty
        if (input1 == null || input1.equals("") && input2 == null || input2.equals(""))
        {
            //error message
             request.setAttribute("result", "---");
            
        }  
        else if (input1 == null || input1.equals("") 
                || input2 == null || input2.equals(""))
        { 
           request.setAttribute("result", "Invalid");
        }
        else{
            
            if(arithmetic.equals("+")){
                double result = Double.valueOf(input1) + Double.valueOf(input2);
                request.setAttribute("result", result);
                }
            else if(arithmetic.equals("*")){
                double result = Double.valueOf(input1) * Double.valueOf(input2);
                request.setAttribute("result", result);
                }
            else if(arithmetic.equals("%")){
                double result = (Double.valueOf(input1))/(Double.valueOf(input2));
                request.setAttribute("result", result);
                }
            else if(arithmetic.equals("-")){
                double result = Double.valueOf(input1) - Double.valueOf(input2);
                request.setAttribute("result", result);
                }
        }
            
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response); 
    }
        



}
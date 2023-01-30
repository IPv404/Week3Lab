/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Retrieve input and initialize it
        String input = request.getParameter("age");
        request.setAttribute("age", input);
        
        //If age is empty
        if (input == null || input.equals(""))
        {
            //error message
             request.setAttribute("message", "You must give your current age");
            
        }  
        else 
        { 
            //Calculate next age
            int nextAge = Integer.valueOf(input) + 1;
        
            //display age
            request.setAttribute("message", "Your age next birthday will be " + nextAge);
        }
            
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response); 
    }
        



}

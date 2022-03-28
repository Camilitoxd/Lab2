/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unipiloto.edu.servlet;

import co.edu.unipoloto.session.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Camilo Gomez
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");
            int valor1 = Integer.parseInt(request.getParameter("valor1"));
            int valor2 = Integer.parseInt(request.getParameter("valor2"));
            String operaciones = request.getParameter("operaciones");

            if ("sumar".equals(operaciones)) {

                out.println("<h1>Servlet suma = " + calcBean.suma(valor1, valor2) + "</h1>");
            }
            else if("restar".equals(operaciones))
            {
                out.println("<h1>Servlet resta = " + calcBean.resta(valor1, valor2) + "</h1>");
            }
            else if("multiplicacion".equals(operaciones))
            {
                out.println("<h1>Servlet multiplicar = " + calcBean.multiplicacion(valor1, valor2) + "</h1>");
            }
            else if("division".equals(operaciones))
            {
                out.println("<h1>Servlet division = " + calcBean.division(valor1, valor2) + "</h1>");
            }
            else if("modulo".equals(operaciones))
            {
                out.println("<h1>Servlet modulo = " + calcBean.modulo(valor1, valor2) + "</h1>");
            }
            else if("elevado".equals(operaciones))
            {
                out.println("<h1>Servlet elevado = " + calcBean.elevado(valor1, valor2) + "</h1>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

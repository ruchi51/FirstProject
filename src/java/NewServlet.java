/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.sql.*;
/**
 *
 * @author ruchi
 */
public class NewServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Connection con=NewClass.getcon();
            PreparedStatement ps=con.prepareStatement("select * from stuper");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                out.println(rs.getString(1));
                out.println(rs.getString(2));
                out.println("<br>");
            }
        }
        catch(Exception e)
        {
                out.println(e);
        }
        finally
        {
                out.close();
        }
        }
    }

    

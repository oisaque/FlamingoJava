package com.javatpoint;  
  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.Cookie;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class LoginServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
            out.print("Você logou com sucesso!");  
            out.print("<br>Bem-Vindo, "+name);  
              
            Cookie ck=new Cookie("name",name);  
            response.addCookie(ck);  
        }else{  
            out.print("Desculpe, usuário ou senha incorreto!");  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
          
        out.close();  
    }  
  
}  
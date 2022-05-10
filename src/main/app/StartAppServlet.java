package app;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet({"/LoginServlet","/login"})
public class StartAppServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("name");
	    String pass = request.getParameter("pass");

	    String msg = "IDまたはPASSが間違っています";
	    String nameMsg = "IDは必須です";
	    String passMsg = "PASSは必須です";
	    String path = "/login.jsp";
	    int frag[] = {0,0};
	
	    if (!Utility.isNullOrEmpty(name)) {
	    	frag[0] = 1;
	    	
	    }else {
	    	request.setAttribute("name", nameMsg);
	    	
	    }
	    
	    if (!Utility.isNullOrEmpty(pass)) {
	    	frag[1] = 1;
	    	
	    }else {
	    	request.setAttribute("pass", passMsg);
	    	
	    }
	    
	    if(frag[0] == 1 && frag[1] == 1) {
	    	if(name.equals("axiz") && pass.equals("axizuser")) {
	    		msg = "ようこそ、" + name + "さん";
	    		path = "/result.jsp";
	    		request.setAttribute("result", msg);
	    		//request.getRequestDispatcher(path).forward(request, response);
	    		
	    	}else {
	    		request.setAttribute("msg", msg);
	    		
	    	}
	    	
	    
	    
	    }
		request.getRequestDispatcher(path).forward(request, response);	
	    
	}


}

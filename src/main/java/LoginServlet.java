

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

	    String result = "";
	    String loginMsg = "IDまたはPASSが間違っています";
	    String nameMsg = "IDは必須です";
	    String passMsg = "PASSは必須です";
	    int frag[] = {0,0};

	    if (name != null && !name.isEmpty()) {
	    	result = "ようこそ、" + name + "さん";
	    	frag[0] = 1;
	    	
	    }else {
	    	request.setAttribute("name", nameMsg);
	    	
	    }
	    
	    if (pass != null && !pass.isEmpty()) {
	    	frag[1] = 1;
	    	
	    }else {
	    	request.setAttribute("pass", passMsg);
	    	
	    }
	    
	    if(frag[0] == 1 && frag[1] == 1) {
	    	if(name.equals("axiz") && pass.equals("axizuser")) {
	    		
	    		request.setAttribute("result", result);
	    		request.getRequestDispatcher("/result.jsp").forward(request, response);
	    		
	    	}else {
	    		request.setAttribute("msg", loginMsg);
	    		
	    	}
	    	
	    
	    
	    }
		request.getRequestDispatcher("/login.jsp").forward(request, response);	
	    
	}


}

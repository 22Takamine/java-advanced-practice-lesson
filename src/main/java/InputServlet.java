
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/inputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	// ここに必要な処理を記述してください。
    	request.setCharacterEncoding("UTF-8");
    	String birthPlace = request.getParameter("birthPlace");
    	String name = request.getParameter("name");
    	String language = request.getParameter("language");
    	String btn = request.getParameter("btn");
    	String msg = "";
    	
    	
    	if(!Utility.isNullOrEmpty(btn)) {
    		if(btn.equals("simple")) {
    			
    	    	if(Utility.isNullOrEmpty(birthPlace)) {
    	    		Human human = new Human();
    	    		msg = human.returnHumanInfo();
    	    		
    	    	}else if(birthPlace.equals("japan")) {
    	    		Human japan = new Japanese();
    	    		msg = japan.returnHumanInfo();
    	    		
    	    	}else if(birthPlace.equals("america")) {
    	    		Human america = new Amerian();
    	    		msg = america.returnHumanInfo();
    	    		
    	    	}
    			
    		}else if(btn.equals("details")) {
    			if(Utility.isNullOrEmpty(name)) {
    	    		name = "名無し";
    	    	}
    	    	
    	    	if(Utility.isNullOrEmpty(language)) {
    	    		language = "不明";
    	    	}
    	    		
    	    	if(Utility.isNullOrEmpty(birthPlace)) {
    	    		Human human = new Human(name,language);
    	    		msg = human.returnHumanInfo();
    	    		
    	    	}else if(birthPlace.equals("japan")) {
    	    		Human japan = new Japanese(name,language);
    	    		msg = japan.returnHumanInfo();
    	    		
    	    	}else if(birthPlace.equals("america")) {
    	    		Human america = new Amerian(name,language);
    	    		msg = america.returnHumanInfo();
    	    		
    	    	}
    		}
    		
    	}
    	       	   	
    	request.setAttribute("info", msg);

        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}

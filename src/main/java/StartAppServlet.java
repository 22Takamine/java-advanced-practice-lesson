

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.App;
import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
import app.GameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StartAppServlet() {
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
		App clock = new ClockApp();
		
	    String name = request.getParameter("name");
	    String type = request.getParameter("type");

	    String result = "";
	    GameApp card = new CardGameApp(type);
	    GameApp darts = new DartsGameApp(type);
	    if(name != null && !name.isEmpty()) {
	    	if(type.equals("トランプ")) {
		    	result = card.start(name);
		    	result += card.play();
		    	
		    }else if(type.equals("ダーツ")) {
		    	result = darts.start(name);
		    	result += darts.play();
		    	
		    }else if(type.equals("時計")) {
		    	result = clock.start(name);
		    	
		    }else if(type.equals("その他")){
		    	result = "アプリの実行に失敗しました。";
		    	
		    }
	    	
	    }
	    
	    
	    request.setAttribute("resultData", result);
	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}

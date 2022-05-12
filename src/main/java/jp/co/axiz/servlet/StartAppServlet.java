package jp.co.axiz.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

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
	    String name = request.getParameter("name");
	    String type = request.getParameter("type");

	    String result = "";
	    
	    App app = null;
	    
	    
	    
	    if(name != null && !name.isEmpty()) {
	    	if(type.equals("トランプ")) {
	    		
	    		app = new CardGameApp(type);
		    	result = app.start(name);
		    	
		    }else if(type.equals("ダーツ")) {
		    	
		    	app= new DartsGameApp(type);
		    	result = app.start(name);
		    	
		    }else if(type.equals("時計")) {
		    	app = new ClockApp();
		    	
		    	result = app.start(name);
		    	
		    }else if(type.equals("その他")){
		    	result = "アプリの実行に失敗しました。";
		    	
		    }
	    	  
	    }
	    
	    if(app instanceof GameApp) {
	    	int msg = ((GameApp)app).getPlayTime();
	    	result += "実行時間:" + msg + "分";
	    }
	    
	    
	    
	    request.setAttribute("resultData", result);
	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}

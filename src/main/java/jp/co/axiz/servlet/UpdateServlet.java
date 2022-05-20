package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.Car;
import jp.co.axiz.util.Utility;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
    	HttpSession session = request.getSession();
    	
    	ArrayList<Car> historyList = new ArrayList<>();
    	historyList = (ArrayList<Car>) session.getAttribute("List");
    	// ここに必要な処理を記述してください。
    	request.setCharacterEncoding("UTF-8");
	    String bodyColor = request.getParameter("bodyColor");
	    String speed = request.getParameter("speed");
	    String btn = request.getParameter("btn");
	    
	    Integer speedDate = Utility.checkAndParseInt(speed);
	    
	    if(btn.equals("back")) {
	    	request.getRequestDispatcher("input.jsp").forward(request, response);
	    }
	    
	    if(Utility.isNullOrEmpty(bodyColor) || Utility.isNullOrEmpty(speed)) {
	    	request.setAttribute("result", "未入力の項目があります。");
	    	
	    	request.getRequestDispatcher("update.jsp").forward(request, response);
	    }
	    
	    Car car = new Car();
	    car.setCarName(historyList.get(0).getCarName());
	    car.setBodyClolr(bodyColor);
	    car.setMaxSpeed(historyList.get(0).getMaxSpeed());
	    car.setSpeed(speedDate);
	    
	    historyList.add(car);
	    
	    request.setAttribute("latestCar", car);
	    session.setAttribute("List", historyList);
	    request.setAttribute("result", "車体の色と現在速度を変更しました。");
        // 結果画面へ遷移
        request.getRequestDispatcher("update.jsp").forward(request, response);

    }
}

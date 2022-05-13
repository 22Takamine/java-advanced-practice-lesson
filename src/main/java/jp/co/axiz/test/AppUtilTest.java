package jp.co.axiz.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

class AppUtilTest {

	CardGameApp card = new CardGameApp();
	DartsGameApp darts = new DartsGameApp();
	ClockApp clock = new ClockApp();
	
	App app = card;
	//App app = darts;
	//App app = clock;
		
	@Test
	public void GameApp(){
		boolean result = AppUtil.isGameApp(app);
		boolean expected = true;
		
		System.out.println("GameApp:" + result);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void CardGameApp(){
		boolean result = AppUtil.isCardGameApp(app);
		boolean expected = true;
		
		System.out.println("CardGameApp:" + result);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void DartsGameApp(){
		boolean result = AppUtil.isDartsGameApp(app);
		boolean expected = true;
		
		System.out.println("DartsGameApp:" + result);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void ClockApp(){
		boolean result = AppUtil.isClockApp(app);
		boolean expected = true;
		
		System.out.println("ClockApp:" + result);
		
		assertEquals(expected,result);
	}
	
	@Test
	public void getAppName(){
		String result = AppUtil.getAppName(app);
		
		System.out.println(result);
		
	}

}

package jp.co.axiz.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

class AppUtilTest {

	CardGameApp card = new CardGameApp();
	DartsGameApp darts = new DartsGameApp();
	ClockApp clock = new ClockApp();
	
		
	@Test
	public void GameApp(){
		assertEquals(true,AppUtil.isGameApp(card));
		assertEquals(true,AppUtil.isGameApp(darts));
		assertEquals(false,AppUtil.isGameApp(clock));
	}
	
	@Test
	public void CardGameApp(){
		assertEquals(true,AppUtil.isCardGameApp(card));
		assertEquals(false,AppUtil.isCardGameApp(darts));
		assertEquals(false,AppUtil.isCardGameApp(clock));
	}
	
	@Test
	public void DartsGameApp(){
		assertEquals(false,AppUtil.isDartsGameApp(card));
		assertEquals(true,AppUtil.isDartsGameApp(darts));
		assertEquals(false,AppUtil.isDartsGameApp(clock));
	}
	
	@Test
	public void ClockApp(){
		assertEquals(false,AppUtil.isClockApp(card));
		assertEquals(false,AppUtil.isClockApp(darts));
		assertEquals(true,AppUtil.isClockApp(clock));
	}
	
	@Test
	public void getAppName(){
		System.out.println(AppUtil.getAppName(card));
		System.out.println(AppUtil.getAppName(darts));
		System.out.println(AppUtil.getAppName(clock));
	}

}

package com.smalwe.bowling.utils;

import java.util.Random;

public class BowlingUtils {
	
	public int throwBall() {
		
		Random r = new Random();
		return (1 + r.nextInt(10));
		
	}
}

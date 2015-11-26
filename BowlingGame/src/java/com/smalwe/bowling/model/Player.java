package com.smalwe.bowling.model;

import com.smalwe.bowling.utils.BowlingUtils;

public class Player {
	
	Bowling bowling  = new Bowling();
	
	BowlingUtils bu = new BowlingUtils();
	
	public void startGame() {
		bowling.setCurrentChance(1);
		bowling.setCurrentSlot(1);
		bowling.setTotalPoints(0);
	}
	
	public void throwsBall() {
		
		int count = 0;
		
		System.out.println("Current chance:" + bowling.getCurrentChance());
		System.out.println("Current slot:" + bowling.getCurrentSlot());
		
		count = bu.throwBall();
		
		System.out.println("Num of bowls fell:" + count);
		
		if(count == 10) {
			
			System.out.println("Strike");
			bowling.setTotalPoints(bowling.getTotalPoints() + 20);
			bowling.setCurrentSlot(2);
		}
		
		else {
			bowling.setTotalPoints(bowling.getTotalPoints() + count);
		}
		
		System.out.println("Total points :" + bowling.getTotalPoints());
	
		if(bowling.getCurrentSlot() % 2 == 0) {
			bowling.setCurrentChance(bowling.getCurrentChance() + 1);
			bowling.setCurrentSlot(1);
		}
		
		else {
			bowling.setCurrentSlot(bowling.getCurrentSlot() + 1);
		}
			
			
			
			
			
		
		
		
	}
	
	public boolean isChanceLeft() {
		if(bowling.getCurrentChance() <= 10) {
			return true;
		}
		
		return false;
	}
}

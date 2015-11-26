package com.smalwe.bowling.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.smalwe.bowling.model.Player;

public class GamePlay {
	
	
	
	public static void main (String args[]) throws IOException {
	
		Player p = new Player();
		
		p.startGame();
		
		while(p.isChanceLeft()) {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String line = br.readLine();
		        p.throwsBall();
		}
		
		System.out.println("Game Over");
		
	}
}

package com.redmart.prob.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import com.redmart.prob.model.Block;
import com.redmart.prob.model.Position;

/**
 * @author smalwe
 * 
 * Prob : http://geeks.redmart.com/2015/01/07/skiing-in-singapore-a-coding-diversion/
 * Steps:
 * 1. Get the input into matrix  - Done
 * 2. Create a map with key (number) : value (position in matrix)
 * 3. Starting from smallest number , search for corresponding longest and deepest path
 * 4. Store it in an object called block which has fields as value,longestPathVal, deepestPathVal
 * 
 */


public class FinalPath {
	
	public static void main (String args[]) throws IOException {
		
		getValueMap(getMatrixFromInput("input.txt"));
		
		
	}

	public static Block getNearByLongestPathVal(Block b, int rows, int cols) {
		int brow = b.getPosition().getRow();
		int bcol = b.getPosition().getCol();
		List<Position> positions = new ArrayList<Position>();
		if(brow == 0 && rows > 1) {
			positions.add(new Position(brow+1,bcol));
		}
		else if(brow == (rows -1)) {
			positions.add(new Position(brow-1, bcol));
		}
		else {
			positions.add(new Position(brow+1,bcol));
			positions.add(new Position(brow-1, bcol));
		}
		
		
		if(bcol == 0 && cols > 1) {
			positions.add(new Position(brow,bcol+1));
		}
		else if(bcol == (cols -1)) {
			positions.add(new Position(brow, bcol-1));
		}
		else {
			positions.add(new Position(brow,bcol+1));
			positions.add(new Position(brow, bcol-1));
		}
		
		
		
		
		return null;
	}
	
	
	
	
	public static int[] getLongestAndSteepestPath(SortedMap<Integer,List<Position>> valueMap) {
		
		
		return null;	
		
		
	}
	
	
	public static Map<Integer,List<Position>> getValueMap(int[][] inputMatrix) {
		
		
		
		SortedMap<Integer,List<Position>> valueMap = new TreeMap<Integer , List<Position>>();
		
		for (int i=0; i< inputMatrix.length ; i++ ) {
			for (int j= 0 ; j< inputMatrix[0].length ; j++) {
				
				
				int value = inputMatrix[i][j];
				
				if(valueMap.get(value) == null) {
					List <Position> positions = new ArrayList<Position>();
					positions.add(new Position(i,j));
					
					valueMap.put(value, positions);
				}
				else {
					valueMap.get(value).add(new Position (i,j));
				}
				
				
			}

		}
		
		for(Entry<Integer, List<Position>> entry : valueMap.entrySet() ) {
			List<Position> pos = entry.getValue();
			System.out.println("Key:" + entry.getKey() + " Value:" );
			for(Position p : pos) {
				System.out.println("Coordinates:" + p.getRow() + "," + p.getCol());
			}
		}
		
		System.out.println(valueMap.toString());
		
		
		
		return valueMap;
	}
	
	
	
	public static int[][] getMatrixFromInput(String filePath) throws IOException {
		
		int inputMatrix [][] = null;	
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			int rows = 0; 
			int cols = 0;
			String matrixSpecs[] = line.split(" ");
			rows = Integer.parseInt(matrixSpecs[0]);
			cols = Integer.parseInt(matrixSpecs[1]);
			
			inputMatrix = new int[rows][cols];
			
			String contentPerRow[] = new String [cols];
			int rowsCount = 0;
			
			System.out.println ("Rows:" + rows + "  Cols:" + cols);
			line = br.readLine();
			while (line != null) {
				//sb.append(line);
				contentPerRow = line.split(" ");
				System.out.println(contentPerRow.length);
				for(int i = 0 ; i< contentPerRow.length; i++) {
					System.out.println("RowNum:" + rowsCount + " COl count:" + i + " Content:" + contentPerRow[i]);
					inputMatrix[rowsCount][i] = Integer.parseInt(contentPerRow[i]);
					
				}
				rowsCount++;
				
				//sb.append(System.lineSeparator());
				line = br.readLine();
			}
			for (int i=0; i< rows ; i++ ) {
				for (int j= 0 ; j< cols ; j++) {
					System.out.print(inputMatrix[i][j]);
					System.out.print (" ");
				}
			System.out.println();
			}
			return inputMatrix;
			//System.out.println (fullString);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			br.close();
		}
	return inputMatrix;
	}

}

package com.smalwe.examples.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StoreDetails {
	
	String disp = "";
	
	static JTextField edit;

	static JTextField nonEdit;

	static TextHandler handler = null;
	static JFrame frame ;
	
	public static void main (String args[]) {
		
		frame = new JFrame("Store Details");
		
		frame.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		JLabel jlbempty = new JLabel("");
		jlbempty.setPreferredSize(new Dimension(175,100));
		frame.getContentPane().add(jlbempty,BorderLayout.CENTER);
		edit = new JTextField("Name",10);
		nonEdit = new JTextField("Age",10);
		
		//handler = new TextHandler();
		frame.getContentPane().add(edit);
		frame.getContentPane().add(nonEdit);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	
	private class TextHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == edit) {
				disp = "text1:" + e.getActionCommand();
			}
			else if(e.getSource() == nonEdit) {
				disp = "text2:" + e.getActionCommand();
			}
			
			JOptionPane.showMessageDialog(null, disp);
		}
	}
}

package com.matrix;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Board implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private GridLayout layout;
	private static JButton[][] button = new JButton[3][3];
	private int count;
	private boolean isX = false;
	private static boolean xWin = false;
	private static boolean	oWin = false;
	public void createAndShowGUI(){
		frame = new JFrame("TicTacToe");
		frame.setSize(300,300);
		panel = new JPanel();
		layout = new GridLayout(3,3);
		panel.setLayout(layout);
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
			button[x][y] = new JButton("");
			}
		}
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
			button[x][y].addActionListener(this);
			}
		}

		for(int x = 0; x< 3; x++){
			for(int y = 0; y < 3; y++){
			panel.add(button[x][y]);
			}
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
	private static void checkAndSetWin(){
		//O Horizontal checks
		if(button[0][0].getText() == "O" && button[0][1].getText() == "O" && button[0][2].getText() == "O") oWin = true;
		if(button[1][0].getText() == "O" && button[1][1].getText() == "O" && button[1][2].getText() == "O") oWin = true;
		if(button[2][0].getText() == "O" && button[2][1].getText() == "O" && button[2][2].getText() == "O") oWin = true;
		//O Vertical Checks
		if(button[0][0].getText() == "O" && button[1][0].getText() == "O" && button[2][0].getText() == "O") oWin = true;
		if(button[0][1].getText() == "O" && button[1][1].getText() == "O" && button[2][1].getText() == "O") oWin = true;
		if(button[0][2].getText() == "O" && button[1][2].getText() == "O" && button[2][2].getText() == "O") oWin = true;
		//O Diagnal Checks
		if(button[0][0].getText() == "O" && button[1][1].getText() == "O" && button[2][2].getText() == "O") oWin = true;
		if(button[0][2].getText() == "O" && button[1][1].getText() == "O" && button[2][0].getText() == "O") oWin = true;
		//X Horizontal checks
		if(button[0][0].getText() == "X" && button[0][1].getText() == "X" && button[0][2].getText() == "X") xWin = true;
		if(button[1][0].getText() == "X" && button[1][1].getText() == "X" && button[1][2].getText() == "X") xWin = true;
		if(button[2][0].getText() == "X" && button[2][1].getText() == "X" && button[2][2].getText() == "X") xWin = true;
		//X Vertical Checks
		if(button[0][0].getText() == "X" && button[1][0].getText() == "X" && button[2][0].getText() == "X") xWin = true;
		if(button[0][1].getText() == "X" && button[1][1].getText() == "X" && button[2][1].getText() == "X") xWin = true;
		if(button[0][2].getText() == "X" && button[1][2].getText() == "X" && button[2][2].getText() == "X") xWin = true;
		//X Diagnal Checks
		if(button[0][0].getText() == "X" && button[1][1].getText() == "X" && button[2][2].getText() == "X") xWin = true;
		if(button[0][2].getText() == "X" && button[1][1].getText() == "X" && button[2][0].getText() == "X") xWin = true;
		
	}
	
	public void actionPerformed(ActionEvent e){
		count++;
		
		if(e.getSource() == button[0][0]){
		if(isX == false){
			button[0][0].setText("O");
			isX = true;
			button[0][0].setEnabled(false);
			}
		else if(isX == true){
			button[0][0].setText("X");
			isX = false;
			button[0][0].setEnabled(false);
			}
		}
		if(e.getSource() == button[0][1]){
		if(isX == false){
			button[0][1].setText("O");
			isX = true;
			button[0][1].setEnabled(false);
			}
		else if(isX == true){
			button[0][1].setText("X");
			isX = false;
			button[0][1].setEnabled(false);
			}
		}
		if(e.getSource() == button[0][2]){
		if(isX == false){
			button[0][2].setText("O");
			isX = true;
			button[0][2].setEnabled(false);
			}
		else if(isX == true){
			button[0][2].setText("X");
			isX = false;
			button[0][2].setEnabled(false);
			}
		}
		if(e.getSource() == button[1][0]){
		if(isX == false){
			button[1][0].setText("O");
			isX = true;
			button[1][0].setEnabled(false);
			}
		else if(isX == true){
			button[1][0].setText("X");
			isX = false;
			button[1][0].setEnabled(false);
			}
		}
		if(e.getSource() == button[1][1]){
		if(isX == false){
			button[1][1].setText("O");
			isX = true;
			button[1][1].setEnabled(false);
			}
		else if(isX == true){
			button[1][1].setText("X");
			isX = false;
			button[1][1].setEnabled(false);
			}
		}
		if(e.getSource() == button[1][2]){
		if(isX == false){
			button[1][2].setText("O");
			isX = true;
			button[1][2].setEnabled(false);
			}
		else if(isX == true){
			button[1][2].setText("X");
			isX = false;
			button[1][2].setEnabled(false);
			}
		}
		if(e.getSource() == button[2][0]){
		if(isX == false){
			button[2][0].setText("O");
			isX = true;
			button[2][0].setEnabled(false);
			}
		else if(isX == true){
			button[2][0].setText("X");
			isX = false;
			button[2][0].setEnabled(false);
			}
		}
		if(e.getSource() == button[2][1]){
		if(isX == false){
			button[2][1].setText("O");
			isX = true;
			button[2][1].setEnabled(false);
			}
		else if(isX == true){
			button[2][1].setText("X");
			isX = false;
			button[2][1].setEnabled(false);
			}
		}
		if(e.getSource() == button[2][2]){
		if(isX == false){
			button[2][2].setText("O");
			isX = true;
			button[2][2].setEnabled(false);
			}
		else if(isX == true){
			button[2][2].setText("X");
			isX = false;
			button[2][2].setEnabled(false);
			}
		}
		checkAndSetWin();
		if(oWin == true){
		JOptionPane.showMessageDialog(frame,
    		"Player O Wins!");
		System.exit(0);
		} 
		if(xWin == true){
		JOptionPane.showMessageDialog(frame,
    		"Player X Wins!");
		System.exit(0);
		}
		else if(count == 9){
		JOptionPane.showMessageDialog(frame,
    		"Game Was A Tie!");
		System.exit(0);
		}
	}
}
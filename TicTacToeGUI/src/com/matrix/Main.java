package com.matrix;
import javax.swing.SwingUtilities;
public class Main{

	public static void main(String[] args){
	SwingUtilities.invokeLater(new Runnable(){
	public void run(){
	Board example = new Board();
	example.createAndShowGUI();}});
	}
}
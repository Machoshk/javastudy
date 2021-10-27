package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;


public class App {

	public static void main(String[] args) {
		// JFrame은 윈도우 창
		SwingUtilities.invokeLater(()->{
			new MainFrame("Test Swing App");
		});
		

	}

}

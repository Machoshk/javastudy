package gui;

import java.awt.Color;
import javax.swing.JPanel;


public class MainPanel extends JPanel implements ColorChangeListener{
	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		setBackground(Color.green);
	}
	
	@Override
	public void changColor(Color color) {
		setBackground(color);	// 배경색 바꾸기 추상메서드 chnagColor완성
	}
}

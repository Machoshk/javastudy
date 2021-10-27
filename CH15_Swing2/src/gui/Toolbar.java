package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;



class ColorListener implements ActionListener{
	private ColorChangeListener colorChanger;
	private Color color;

	public ColorListener(ColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changColor(color);
	}
}

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;

	public Toolbar(ColorChangeListener colorChanger) {
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new ColorListener(colorChanger,Color.RED));
		blueButton.addActionListener(new ColorListener(colorChanger,Color.BLUE));
		
		add(redButton);
		add(blueButton);
		
	}

}

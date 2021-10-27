package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
		
	public MainFrame(String title) {
		super(title);	//JFrame에 타이틀을 생성하도록
		
		MainPanel mainPanel = new MainPanel();
		
		setLayout(new BorderLayout()); 	// 메인프레임창에 컴포넌트를 붙이기 위함
		
		JPanel panel = new JPanel();	//JPanel 패널을 생성
		panel.setBackground(Color.GREEN);	// 색 설정
		add(panel, BorderLayout.CENTER);	//메인 프레임에 붙이기 (중앙 가운데에 위치)
		
		setLayout(new BorderLayout());
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);	// 중앙 가운데 패널을 붙이기
		
		
		setSize(600, 400);	// 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창 닫을시 프로그램 종료
		setVisible(true);

	}

}

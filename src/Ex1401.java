import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame {
	
	public Ex1401() {
		setTitle("프레임 및 아이콘"); // 프레임
		setSize(600, 300); //프레임
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("img/th.JPG").getImage());
		setVisible(true); // 보이기 (이 문은 없으면 못 봐요)
	}

//public class Ex1401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex1401();

	}

}

import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame{
	
	public Ex1404() {
		setTitle("계산기");
		setSize(300, 250);
	
		
		//제목 페널
		JPanel titlePanel=new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롱돋음", Font.BOLD, 20));
		titlePanel.add(title);
		
		// 숫자 페널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		// 추가 
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(numPanel);
		
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// 버튼 페널
		JPanel btnPanel01 = new JPanel();
		btnPanel01.setBounds(0, 80, 300, 40);
		add(btnPanel01);
		
		// 결과 페널
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 160, 300, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel ("결과값: ");
		resPanel.add(lbl1);
		JButton lbl2 = new JButton("-");
		resPanel.add(lbl2);
		
		//프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex1404();

	}

}

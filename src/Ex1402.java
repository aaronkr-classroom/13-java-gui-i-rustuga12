import javax.swing.*;
import java.awt.*;

public class Ex1402  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		// 프레임 설정
		frame.setTitle("My 1st GUI!");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 페널 추가하기
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		// 버튼 추가하기 
		JButton btn1 = new JButton("Coca Cola", new ImageIcon("img/th.jpg"));
		JButton btn2 = new JButton("DOGE COIN", new ImageIcon("img/doge.jpg"));
		JButton btn3 = new JButton(" PEPE ", new ImageIcon("img/pepe.jpg"));
		btn1.setSize(64, 64); // Not change??
		btn2.setSize(64,64);
		btn3.setSize(64,64);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		// JChecBox
		JRadioButton rbtn1  = new JRadioButton("1학년");
		JRadioButton rbtn2  = new JRadioButton("2학년", true);
		JRadioButton rbtn3  = new JRadioButton("3학년");
		JRadioButton rbtn4  = new JRadioButton("4학년");
		JRadioButton rbtn5  = new JRadioButton("기타");
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(rbtn4);
		panel.add(rbtn5);
		
		// JComboBox
		String email[] = {"naver.com", "google.com", "kakao.com"};
		JComboBox cbox1 = new JComboBox(email);
		panel.add(cbox1);
		
		vector cbox2 = new Vector();
		phone.add("SKT");
		phone.add("LG U+");
		JComboBox cbox2 = new JComboBox(phone);
		panel.add(cbox2);
		
		// JLabel + JTextArea
		JLabel msg = new JLabel("메시지를 입력하세요: ");
		panel.add(msg);
		JTextArea msgTxt = new JTextArea(5, 10);
		panel.add(msgTxt);
		
		// JTextField + JPasswordField
		JLabel unameLb1 = new JLabel("username: ");
		panel.add(unameLb1);
		JTextField uname = new JTextField(10);
		panel.add(uname);
		
		JLabel pwordLb1 = new JLabel("password: ");
		panel.add(pwordLb1);
		JPasswordField pword = new JPasswordField(10);
		panel.add(pword);
		
		
		
		frame.setVisible(true);
	}

}

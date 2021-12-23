package TheLogic.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Result implements ActionListener {
	public int gameMode;
	char guess;
	char answer;
	int index;
	int correct_guesses =0;
	int total_questions;
	int result;
	int seconds=25;
	
	JFrame frame = new JFrame("The LogiC - by Fuad & Fian");
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JLabel text = new JLabel();
	JButton buttonT = new JButton();
	JButton buttonF = new JButton();
	JButton bHome = new JButton();
	JLabel answer_labelT = new JLabel();
	JLabel answer_labelF = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	Image trueImage;
	Image falseImage;
	Image bHomeImg;

	public Result () {
		try {
			trueImage = ImageIO.read(getClass().getResource("true_1ppi.png"));
			falseImage = ImageIO.read(getClass().getResource("false_1ppi.png"));
			bHomeImg = ImageIO.read(getClass().getResource("homeeeppi.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(new Color(193,207,192));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		bHome.setIcon(new ImageIcon(bHomeImg));
		bHome.setBounds(590, 20, 60, 60);
//		bHome.addActionListener(this);
		
		textfield.setBounds(15,0,650,80);
		textfield.setBackground(new Color(193,207,192));
		textfield.setForeground(new Color(40,30,1));
		textfield.setFont(new Font("Fredoka One",Font.BOLD,50));
		textfield.setHorizontalAlignment(JTextField.LEFT);
		textfield.setEditable(false);

		textarea.setBounds(50,150,550,250);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(107,122,161));
		textarea.setForeground(new Color(249,249,249));
		textarea.setFont(new Font("Fredoka One",Font.BOLD,40));
		textarea.setEditable(false);

		buttonT.setIcon(new ImageIcon(trueImage));
		buttonT.setBounds(150,450,109,109);
		buttonT.setFont(new Font("Fredoka One",Font.BOLD,35));
		buttonT.setFocusable(false);
		buttonT.addActionListener(this);

		buttonF.setIcon(new ImageIcon(falseImage));
		buttonF.setBounds(400,450,109,109);
		buttonF.setFont(new Font("Fredoka One",Font.BOLD,35));
		buttonF.setFocusable(false);
		buttonF.addActionListener(this);

		text.setBounds(300,445,100,120);
		text.setBackground(new Color(193,207,192));
		text.setForeground(new Color(40,31,1));
		text.setFont(new Font("Fredoka One",Font.BOLD,40));
		text.setText("OR");

		seconds_left.setBounds(480,20,100,60);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(216,91,22));
		seconds_left.setFont(new Font("Fredoka One",Font.BOLD,40));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JLabel.RIGHT);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));

		number_right.setBounds(225,225,200,100);
		number_right.setBackground(new Color(231, 224,201));
		number_right.setForeground(new Color(40,31,0));
		number_right.setFont(new Font("Fredoka One",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);

		percentage.setBounds(225,325,200,100);
		percentage.setBackground(new Color(231, 224,201));
		percentage.setForeground(new Color(40,31,0));
		percentage.setFont(new Font("Fredoka One",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.add(text);
		frame.add(bHome);
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelT);
		frame.add(answer_labelF);
		frame.add(buttonT);
		frame.add(buttonF);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
	}
	public void results(){
			
			buttonT.setEnabled(false);
			buttonF.setEnabled(false);
			
			result = (int)((correct_guesses/(double)total_questions)*100);
			
			textfield.setText("RESULTS!");
			
			number_right.setText("("+correct_guesses+"/"+total_questions+")");
			percentage.setText(result+"%");
			
			frame.add(number_right);
			frame.add(percentage);
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

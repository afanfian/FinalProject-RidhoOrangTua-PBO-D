package TheLogic.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Home implements ActionListener {
	JFrame frame = new JFrame("The LogiC By Fian & Fuad");
	JLabel label = new JLabel();
	private JButton Play;
	
	public Home() {
		
		
		this.Play = new JButton();
		label.setBounds(145, 35, 396, 467);
		label.setIcon(new ImageIcon("Asset 45ppi.png"));	
		label.setVisible(true);
		frame.getContentPane().add(label);
		
		

		Play.setIcon(new ImageIcon("Asset 48ppi.png"));
		Play.setBounds(163, 519, 360, 110);
		Play.setVisible(true);
        Play.addActionListener(this);
        frame.add(Play); 
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,700);
		frame.getContentPane().setBackground(new Color(193,207,192));
		frame.setLayout(null);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		showsLevel();

		
	}
	private void showsLevel(){
        Play.addActionListener(e -> toLevel(1));
    }
	
	private void toLevel(int value){
        Level level = new Level();
        System.out.println(value);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}




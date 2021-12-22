package TheLogic.game;

import java.awt.event.*;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;

public class Level implements ActionListener {
	JFrame frame ;
	JLabel Tlevel = new JLabel();
	JPanel Backround = new JPanel();
    private JButton bEasy;
    private JButton bMedium;
    private JButton bHard;
    Image bEasyImg;
    Image bMediumImg;
    Image bHardImg;
    Image TLevelImg;
    public Level(){
        bEasy = new JButton();
        bMedium = new JButton();
        bHard = new JButton();
        
        try {
			TLevelImg = ImageIO.read(getClass().getResource("levelppi.png"));
			bEasyImg = ImageIO.read(getClass().getResource("easyppi.png"));
			bMediumImg = ImageIO.read(getClass().getResource("mediumppi.png"));
			bHardImg = ImageIO.read(getClass().getResource("hardppi.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
       
//      Level.setText("LEVEL");
		Tlevel.setIcon(new ImageIcon(TLevelImg));
		Tlevel.setBounds(188, 65, 290, 90);
		Tlevel.setHorizontalAlignment(JLabel.CENTER);
		Tlevel.setFont(new Font("Fredoka One",Font.BOLD,40));
		Tlevel.setForeground(new Color(40,31,1));

		bEasy.setIcon(new ImageIcon(bEasyImg));
		bEasy.setBounds(175,190,310,110);
		bEasy.setHorizontalAlignment(JTextField.CENTER);
		bEasy.setFont(new Font("Fredoka One",Font.BOLD,25));
		bEasy.setFocusable(false);
		bEasy.addActionListener(this);

		bMedium.setIcon(new ImageIcon(bMediumImg));
		bMedium.setBounds(175,310,310,110);
		bMedium.setHorizontalAlignment(JButton.CENTER);
		bMedium.setFont(new Font("Fredoka One",Font.BOLD,25));
		bMedium.setFocusable(false);
		bMedium.addActionListener(this);

		bHard.setIcon(new ImageIcon(bHardImg));
		bHard.setBounds(175,430,310,110);
		bHard.setFont(new Font("Fredoka One",Font.BOLD,25));
		bHard.setFocusable(false);
		bHard.addActionListener(this);
		
        frame = new JFrame("The LogiC By Fian & Fuad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.getContentPane().setBackground(new Color(193,207,192));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
       
        frame.add(Tlevel);
        frame.add(Backround);
        frame.add(bEasy);
        frame.add(bMedium);
        frame.add(bHard);
        
        showLevel();
    }

    private void showLevel(){
        bEasy.addActionListener(e -> toGame(1));
        bMedium.addActionListener(e -> toGame(2));
        bHard.addActionListener(e -> toGame(3));
    }

    private void toGame(int value){
        Quiz quiz = new Quiz(value);
        System.out.println(value);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
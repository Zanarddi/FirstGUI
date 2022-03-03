package newGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame02 extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame02(){
		
		ImageIcon icon = new ImageIcon("like.png");
		ImageIcon icon2 = new ImageIcon("button.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(100, 450, 200, 200);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(100, 100, 500, 300);
		button.addActionListener(this);
		button.setText("I'm a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-35);
		button.setForeground(Color.black);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 700);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("poo");	
			//button.setEnabled(false);
			label.setVisible(true);
		}
		
	}

}

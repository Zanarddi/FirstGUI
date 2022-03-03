package newGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){

		this.setTitle("JFrame title goes here"); // sets title of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of the application when pressing X
		this.setResizable(false); //prevent this from being resized
		this.setSize(420, 420); //sets the x and y dimensions of the this
		this.setVisible(true); // make the this visible
		
		ImageIcon image = new ImageIcon("bulbassaur.jpg"); //create an image icon
		this.setIconImage(image.getImage()); //change icon of he this
		this.getContentPane().setBackground(new Color(12, 200, 159)); //change color of background
		
	}

}

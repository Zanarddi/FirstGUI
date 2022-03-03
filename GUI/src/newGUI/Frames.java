package newGUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {
	public static void main(String[] args) {
		
		//JFrame = a GUI window to add components to
		/*
		JFrame frame = new JFrame(); //creates a jframe
		
		frame.setTitle("JFrame title goes here"); // sets title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of the application when pressing X
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420, 420); //sets the x and y dimensions of the frame
		frame.setVisible(true); // make the frame visible
		
		ImageIcon image = new ImageIcon("bulbassaur.jpg"); //create an image icon
		frame.setIconImage(image.getImage()); //change icon of he frame
		frame.getContentPane().setBackground(new Color(12, 200, 159)); //change color of background
		*/
		
		MyFrame myFrame = new MyFrame();
	}

}

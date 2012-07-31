import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class Character_UI extends JFrame implements ActionListener {

	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		Character_UI thisHere = Character_UI();

	}

	private Character_UI() 
	{
		startUI();
		
		return;
	}

	void startUI() 
	{
		setSize(1000,1000);
		setTitle("Character");
		setLayout(null);
		
		BufferedImage img = null;
		try 
		{
		    img = ImageIO.read(new File("images/playerAnatomy.jpg"));
		} 
		
		catch (IOException e)
		{
			System.out.println("unable to find the image!");
		}
		
		
		JTextField errorConsole = new JTextField();
		
		errorConsole.setSize(200,1000);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		
	}

}

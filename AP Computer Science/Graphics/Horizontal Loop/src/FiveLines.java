		import javax.swing.*;
		import java.awt.*;
		import java.util.Scanner;

public class FiveLines extends Canvas
{

	static Canvas canvas = new FiveLines();
	
	public static void main(String[] args)
	{
		JFrame gui = new JFrame ("Your Flag!");
		gui.setSize(1370,730);
		gui.setVisible(true);
		gui.setLocation(0,0);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		gui.add(canvas);
		canvas.setBackground(Color.LIGHT_GRAY);
	}

	public void paint (Graphics g)
	{	
			int j2 = 40;
			for(int j=1;j<500;j=j+100)
			{
				g.setColor(Color.RED);
				g.drawLine(j, 200, (j+j2), 200);
			}

	}

}

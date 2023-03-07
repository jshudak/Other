		import javax.swing.*;
		import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

public class ThreeRandShapes extends Canvas{

	static Canvas canvas = new ThreeRandShapes();
	
	public static void main(String[] args)
	{
			JFrame gui = new JFrame ("Your Flag!");
			gui.setSize(1370,730);
			gui.setVisible(true);
			gui.setLocation(0,0);
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			gui.add(canvas);
			canvas.setBackground(Color.WHITE);
		}
	
	public void paint (Graphics g)
	{	
		Random gen = new Random();
		int shape, x1, x2, y1, y2, h1, w1, colorChoice, R, G, B;
		for (int j=0;j<420;j++)
		{
			R = gen.nextInt(256);
			G = gen.nextInt(256);
			B = gen.nextInt(256);
			Color paintColor = new Color (R, G, B);
			shape = gen.nextInt(3);
			
			if (shape ==0)
			{
				g.setColor(paintColor);
				x1 = gen.nextInt(1200)+50;
				x2 = gen.nextInt(1200)+50;
				y1 = gen.nextInt(550)+50;
				y2 = gen.nextInt(550)+50;
				g.drawLine(x1, y1, x2, y2);
			}
			else if (shape ==1)
			{
				g.setColor(paintColor);
				x1 = gen.nextInt(1000)+50;
				w1 = gen.nextInt(200)+50;
				y1 = gen.nextInt(350)+50;
				h1 = gen.nextInt(200)+50;
				g.fillRect(x1, y1, w1, h1);
			}
			else if (shape ==2)
			{
				g.setColor(paintColor);
				x1 = gen.nextInt(1000)+50;
				w1 = gen.nextInt(200)+50;
				y1 = gen.nextInt(350)+50;
				h1 = gen.nextInt(200)+50;
				g.fillOval(x1, y1, w1, h1);
			}
		}
		

	}
}
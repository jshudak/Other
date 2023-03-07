		import javax.swing.*;
		import java.awt.*;
		import java.util.Scanner;
		
public class ThreeFlags extends Canvas{

	static int choice = 0;
	static Canvas canvas = new ThreeFlags();
	
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner (System.in);
		
		System.out.println("Pick 1, 2, or 3");
		System.out.print("Pick: ");
		choice = keyb.nextInt();
		
		while (choice > 3 || choice <1 )
		{
			System.out.println("Please only choose either 1, 2, or 3.");
			System.out.print("Pick: ");
			choice = keyb.nextInt();
		}
		

		JFrame gui = new JFrame ("Your Chosen Flag!");
		gui.setSize(1370,730);
		gui.setVisible(true);
		gui.setLocation(0,0);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		gui.add(canvas);
		canvas.setBackground(Color.WHITE);
	}

	public void paint (Graphics g)
	{
		if (choice == 1)
		{
			System.out.print("Russia");
			g.setColor(Color.white);
			g.fillRect(0, 0, 1370, 242);
			g.setColor(Color.blue);
			g.fillRect(0, 242, 1370, 242);
			g.setColor(Color.red);
			g.fillRect(0, 484, 1370, 242);
		}
		
		else if (choice == 2)
		{
			System.out.print("South Korea");
			canvas.setBackground(Color.WHITE);
			g.setColor(Color.red);
			g.fillArc(500, 150, 400, 400, 330, 180);
			g.setColor(Color.blue);
			g.fillArc(500, 150, 400, 400, 130, 200);
			g.setColor(Color.BLUE);
			g.fillOval(690, 290, 200, 200);
			g.setColor(Color.RED);
			g.fillOval(530, 180, 200, 200);
// ------------------- TOP LEFT CORNER ------------------
			g.setColor(Color.BLACK);
			int [] xCords1 = {385, 300, 270, 355};
			int [] yCords1 = {95, 210, 190, 75};
			g.fillPolygon(xCords1, yCords1, 4);
			int [] xCords2 = {425, 340, 310, 395};
			int [] yCords2 = {120, 235, 215, 100};
			g.fillPolygon(xCords2, yCords2, 4);
			int [] xCords3 = {465, 380, 350, 435};
			int [] yCords3 = {145, 260, 240, 125};
			g.fillPolygon(xCords3, yCords3, 4);
// ---------------- BOTTOM LEFT CORNER ------------------
			g.setColor(Color.BLACK);
			int [] xCords4 = {385, 300, 270, 355};
			int [] yCords4 = {595, 480, 500, 615};
			g.fillPolygon(xCords4, yCords4, 4);
			int [] xCords5 = {425, 340, 310, 395};
			int [] yCords5 = {570, 455, 475, 590};
			g.fillPolygon(xCords5, yCords5, 4);
			int [] xCords6 = {465, 380, 350, 435};
			int [] yCords6 = {545, 430, 450, 565};
			g.fillPolygon(xCords6, yCords6, 4);
			g.setColor(Color.WHITE);
			int [] xCords7 = {395, 385, 345, 355};
			int [] yCords7 = {520, 510, 535, 545};
			g.fillPolygon(xCords7, yCords7, 4);
// ------------------ TOP RIGHT CORNER -------------------
			g.setColor(Color.BLACK);
			int [] xCords8 = {1035, 1120, 1150, 1065};
			int [] yCords8 = {95, 210, 190, 75};
			g.fillPolygon(xCords8, yCords8, 4);
			int [] xCords9 = {995, 1080, 1110, 1025};
			int [] yCords9 = {120, 235, 215, 100};
			g.fillPolygon(xCords9, yCords9, 4);
			int [] xCords10 = {955, 1040, 1070, 985};
			int [] yCords10 = {145, 260, 240, 125};
			g.fillPolygon(xCords10, yCords10, 4);
			g.setColor(Color.WHITE);
			int [] xCords11 = {1065, 1075, 1115, 1105};
			int [] yCords11 = {145, 155, 130, 120};
			g.fillPolygon(xCords11, yCords11, 4);
			int [] xCords12 = {985, 995, 1035, 1025};
			int [] yCords12 = {195, 205, 180, 170};
			g.fillPolygon(xCords12, yCords12, 4);
// ---------------- BOTTOM RIGHT CORNER -----------------
			g.setColor(Color.BLACK);
			int [] xCords13 = {1035, 1120, 1150, 1065};
			int [] yCords13 = {595, 480, 500, 615};
			g.fillPolygon(xCords13, yCords13, 4);
			int [] xCords14 = {995, 1080, 1110, 1025};
			int [] yCords14 = {570, 455, 475, 590};
			g.fillPolygon(xCords14, yCords14, 4);
			int [] xCords15 = {955, 1040, 1070, 985};
			int [] yCords15 = {545, 430, 450, 565};
			g.fillPolygon(xCords15, yCords15, 4);
			g.setColor(Color.WHITE);
			int [] xCords16 = {1115, 1115, 985, 995};
			int [] yCords16 = {565, 550, 465, 485};
			g.fillPolygon(xCords16, yCords16, 4); 
		}
		
		else if (choice == 3)
		{
			g.setColor(Color.RED);
			g.fillOval(500, 150, 400, 400);
		}
	}
}

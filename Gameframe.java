import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;




public class Gameframe extends JFrame implements MouseMotionListener {
	
		private Image back;
		private Image dbImage;
		private Graphics dbg;
		int x,y;
		int mx, my;
		
		
		
		//popups
		private int[] popX = {195,540, 800, 900, 540, 330 }; 
		private int[] popY={200, 190, 200, 460, 300, 450};
		private int popR = 30;
		//private boolean popExist = false; 
		private Color popColor = Color.red;
		
	
		//Continents
		 private int cX[] = {40, 270, 470, 370, 670, 830};
		 private int cY[] = {40, 340, 250, 40, 60, 410};
		 private int cH[] = {300, 230, 250, 210, 350, 140};
		 private int cW[] = {330, 170, 200, 300, 390, 190};

		
		
	public Gameframe() {   //Constructor  duh!
		back = new ImageIcon("map.png").getImage();
		setTitle("Java Game");
		setSize(1100,700);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null); //This allows the window to start in the middle
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x=15;
		y=15;
		addMouseListener(new MC());
	}
	
	
	
	private void makePopup(Graphics g) {
		g.setColor(popColor);
		
		
		for(int i =0; i< popX.length ;i++) {		
		g.fillOval(popX[i], popY[i],  popR, popR);
		}
			
		
	} 
	
	
	public void checkContinent() {
		for(int i =0; i< cX.length; i++) {
			if((cX[i])== x && cY[i]==y) {
				System.out.println("CHECK");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	public void drawRegion(Graphics g) {
		for(int i =0; i<6;i++) {
			g.drawRect(cX[i],cY[i],cW[i],cH[i]);
		}
		
	}
	
	
	
	
	
	public class MC extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int xCoord = e.getX();
			int yCoord = e.getY();
			x = xCoord;
			y = yCoord;
			System.out.println("Test");
			
			
			

			}
		public void mouseRealeased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
			
		}	
		public void mouseExited(MouseEvent e) {
			
		}
		
		

	}
	
	
	
	
	
	
	
	
	public void paint(Graphics g) {
		
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage,0,0,this);
	}

	public void paintComponent(Graphics g) {
		checkContinent();
		g.drawImage(back, 50,40,null );
		drawRegion(g);
		
		g.drawOval(x, y, 10, 10);
		makePopup(g);
		
		
		repaint();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

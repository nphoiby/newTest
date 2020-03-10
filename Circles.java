import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
 

public class Circles extends JFrame{
public Circles() {
	setTitle("Round Things");
    setSize(960,960);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
public void paint(Graphics g)
{
    g.setColor(Color.yellow);
    g.fillOval(180, 180, 20, 20);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Circles();
			
	}

}

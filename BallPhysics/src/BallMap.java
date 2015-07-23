import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;


public class BallMap extends JPanel implements MouseListener, ActionListener, KeyListener {
	
	private Timer timer;	
	Ball ball = null;
	
	public BallMap() {
		addMouseListener(this);
		addKeyListener(this);		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500, 500));
		setFocusable(true);		
		timer = new Timer(15, this);
        timer.start();		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(ball != null) {
			ball.moveBall();
			if(ball.y >= 450 - ball.width / 2 || ball.y <= 0 + ball.width / 2)
				ball.dy *= -1;
		}
		repaint();		
	}	
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
        g.setColor(Color.WHITE);  
    	g.drawLine(0, 450, 500, 450);
    	if(ball != null)
    		g.fillOval(ball.x - ball.width / 2, ball.y - ball.width / 2, ball.width, ball.width);
        Toolkit.getDefaultToolkit().sync();
    }		
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ball = new Ball(e.getX(), e.getY(), 50);
		System.out.println(e.getX() + " " + e.getY());		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int kc = e.getKeyCode();
    	if (kc == KeyEvent.VK_ESCAPE)
			System.exit(0);
	}
	
	@Override
	public void keyTyped(KeyEvent e) { }
	
	@Override
	public void keyReleased(KeyEvent e) { }

	@Override
	public void mousePressed(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) { }

	@Override
	public void mouseExited(MouseEvent e) { }

}

import java.awt.EventQueue;

import javax.swing.JFrame;

public class BallPhysics extends JFrame {

	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	BallPhysics bp = new BallPhysics();
                bp.setVisible(true);
            }
        });
	}
	
	public BallPhysics() {
		add(new BallMap());        
        setResizable(false);
        pack();        
        setTitle("BallPhysics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println("adsfasdfasdf");
	}

}

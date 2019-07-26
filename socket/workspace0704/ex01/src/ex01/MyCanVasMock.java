package ex01;

	import java.awt.Canvas;

	import java.awt.Color;

	import java.awt.Graphics;

	import javax.swing.JFrame;


	/* MyCanVasMock */

	public class MyCanVasMock extends JFrame{

	    private int arcNum=360;

	    private int x,y;
	    
	    public MyCanVasMock() {

	        Canvas can = new Canvas(){

	            @Override

	            public void update(Graphics g) {

	                paint(g);

	            }

	            @Override

	            public void paint(Graphics g) {

	                g.drawArc(x, y, 100, 100, 0, arcNum);
	            	g.fillOval(x, y, rd, rd);
	            }

	        };

	        add(can);

	        can.setBackground(Color.yellow);

	        setBounds(100, 100, 300, 300);

	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        setVisible(true);

	    }

	    public static void main(String[] args) {
	    	
	        new MyCanVasMock();

	    }

	}
	

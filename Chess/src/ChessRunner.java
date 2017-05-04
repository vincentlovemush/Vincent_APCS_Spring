import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;

public class ChessRunner extends JPanel implements MouseListener{
	public int mouseX ,mouseY;
	private ImageIcon whiteKnight = new ImageIcon(this.getClass().getResource("org/myproject/mypackage/peanut.jpg"));;
	private ImageIcon blackKnight = new ImageIcon(this.getClass().getResource("org/myproject/mypackage/peanut.jpg"));;
	private Chessboard theBoard = new Chessboard();
	public ChessRunner(){
		addMouseListener(this);
		whiteKnight= new ImageIcon(this.getClass().getResource("org/myproject/mypackage/peanut.jpg"));
	}
	public static void main(String[] a) {
		JFrame f = new JFrame();
		f.setSize(450, 450);
		f.add(new ChessRunner());
//		f.add(new JLabel(new ImageIcon("C:/Users/Vincent/Downloads/IMG_2498.JPG")));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public void paint(Graphics g) {
		for (int i=0;i<400;i=i+50){
			for (int j=0;j<400;j=j+50){
				if ((i%100==0&&j%100==0)||(i%100!=0 && j%100!=0)){
					g.fillRect(i, j, 50, 50);
				}
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		System.out.println(mouseX+"  "+mouseY);
		//get the chesspiece
		}
	public void mouseReleased(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		System.out.println(mouseX+"  "+mouseY);}
		//check ifValid
}
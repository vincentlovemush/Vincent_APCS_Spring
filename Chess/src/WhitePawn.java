import javax.swing.ImageIcon;

public class WhitePawn implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon wPawn= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/images.png");
	public WhitePawn(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return true;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wPawn;
	}
}

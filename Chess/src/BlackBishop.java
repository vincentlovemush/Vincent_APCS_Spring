import javax.swing.ImageIcon;

public class BlackBishop implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon bBishop= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/bishop black.png");
	public BlackBishop(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return false;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bBishop;
	}
}

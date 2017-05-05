import javax.swing.ImageIcon;

public class WhiteRook implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon wRook= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/rook white.png");
	public WhiteRook(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return false;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wRook;
	}
}

import javax.swing.ImageIcon;

public class BlackKing implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon bKing= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/blackking.jpg");
	public BlackKing(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return true;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bKing;
	}
}

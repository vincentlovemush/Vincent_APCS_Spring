import javax.swing.ImageIcon;

public class WhiteKnight implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon wKnight= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/knight white.jpg");
	public WhiteKnight(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return true;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wKnight;
	}
}

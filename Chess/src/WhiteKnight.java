import javax.swing.ImageIcon;

public class WhiteKnight implements Chesspiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon wKnight= new ImageIcon("C:/Users/Vincent/Desktop/Vincent_APCS_Spring/Chess/knight white.png");
	public WhiteKnight(){
		}
	public boolean validMove(int moveX, int moveY) {
	
		return false;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wKnight;
	}
}

import javax.swing.ImageIcon;

public class BlackBishop extends BlackPiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon bBishop= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/bishop black.png");
	public BlackBishop(Chesspiece [][] a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {
	
		return true;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bBishop;
	}
	public boolean hasMoved(){
		return false;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub
		
	}
}

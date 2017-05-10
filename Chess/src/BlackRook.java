import javax.swing.ImageIcon;

public class BlackRook extends BlackPiece {
	private int x;
	private int y;
	private boolean isWhite; 

	private ImageIcon bRook= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/rook black.png");
	public BlackRook(Chesspiece [][] a){
		super(a);
	}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		return true;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bRook;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub

	}
}

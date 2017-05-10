import javax.swing.ImageIcon;

public class WhiteRook extends WhitePiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon wRook= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/rook white.png");
	public WhiteRook(Chesspiece [][] a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		return true;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wRook;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub
		
	}
}

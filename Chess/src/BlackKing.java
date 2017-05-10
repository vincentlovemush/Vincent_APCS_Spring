import javax.swing.ImageIcon;

public class BlackKing extends BlackPiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon bKing= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/blackking.jpg");
	public BlackKing(Chesspiece[][] a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {
	
		return true;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bKing;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub
		
	}
}

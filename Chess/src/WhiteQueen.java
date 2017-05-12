import javax.swing.ImageIcon;

public class WhiteQueen extends WhitePiece {
	private int x;
	private int y;
	private boolean isWhite;
	
	private ImageIcon wQueen= new ImageIcon("./data/queen white.png");
	public WhiteQueen(Chesspiece [][] a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		return true;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wQueen;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub
		
	}
}

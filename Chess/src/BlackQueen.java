import javax.swing.ImageIcon;

public class BlackQueen extends BlackPiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private ImageIcon bQueen= new ImageIcon("./data/queen black.png");
	public BlackQueen(Chesspiece [][] a){
		super (a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		int x2 = Math.abs(moveX-prevX);
		int y2 = Math.abs(moveY-prevY);
		if (x2 == prevX || y2 == prevY){
			return true;
		}else if(x2 == y2){
			return true;
		}else if(x2<2 && y2<2){
			return true;
		}else{
		return false;
		}
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bQueen;
	}
	@Override
	public void moved() {
		// TODO Auto-generated method stub
		
	}
}

import javax.swing.ImageIcon;

public class WhitePawn extends WhitePiece {
	private int x;
	private int y;
	private boolean isWhite; 
	public boolean hasMoved=false;
	private ImageIcon wPawn= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/images.png");
	public WhitePawn(Chesspiece [][] a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		int x2=Math.abs(moveX-prevX);
		System.out.println(x2 +" "+ (prevY-moveY));
		if(prevY-moveY==1&& x2==0)
			return true;
		if(prevY-moveY==2&&!hasMoved)
			return true;
/*		if (x2==1 && prevY-moveY==1 && !(board[moveX/50][moveY/50] instanceof WhitePiece)){
			return true;
		}*/
		return false;
	}
	public boolean isWhite(){
		return true;
	}
	public ImageIcon print(){
		return wPawn;
	}
	public void moved(){
		hasMoved=true;
	}
}

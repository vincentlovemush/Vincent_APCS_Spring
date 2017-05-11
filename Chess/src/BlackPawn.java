import javax.swing.ImageIcon;

public class BlackPawn extends BlackPiece {
	private int x;
	private int y;
	private boolean isWhite; 
	private boolean hasMoved;
	private ImageIcon bPawn= new ImageIcon("C:/Users/APCS2/Desktop/Vincent_APCS_Spring/Chess/blackk pawn.png");
	public BlackPawn(Chesspiece[][]a){
		super(a);
		}
	public boolean validMove(int moveX, int moveY, int prevX, int prevY) {	
		int x2=Math.abs(moveX-prevX);
		System.out.println(x2 +" "+ (moveY-prevY));
		if(moveY-prevY==1&& x2==0&& !(board[moveX][moveY] instanceof WhitePiece))
			return true;
		if(x2==0 && moveY-prevY==2&&!hasMoved &&!(board[moveX][moveY] instanceof WhitePiece)&&!(board[moveX][moveY-1] instanceof WhitePiece))
			return true;
		if (x2==1 && moveY-prevY==1 && (board[moveX][moveY] instanceof WhitePiece)){
			System.out.println(x2+" "+ (prevY-moveY)+" "+ board[moveX][moveY].toString());
			return true;
		}
		return false;
	}
	public boolean isWhite(){
		return false;
	}
	public ImageIcon print(){
		return bPawn;
	}
	@Override
	public void moved() {
		hasMoved = false;
		// TODO Auto-generated method stub
		
	}
}

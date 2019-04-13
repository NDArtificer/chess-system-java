package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	private Color color;
	private int moveCount;
	
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void drecreaseMoveCount() {
		moveCount--;
	}
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	} 
		
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
}

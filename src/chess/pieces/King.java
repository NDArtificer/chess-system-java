package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);

	}

	public String toString() {
		return "K";
	}

	public boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor()!= getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		
		// Movimento para cima
		
		p.setValues(position.getRow() -1, position.getColumn());
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para baixo
		
		p.setValues(position.getRow() +1, position.getColumn());
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para direita
		
		p.setValues(position.getRow() , position.getColumn() +1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para esquerda
		
		p.setValues(position.getRow(), position.getColumn() -1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para noroeste
		
		p.setValues(position.getRow() -1, position.getColumn() -1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para nordeste
		
		p.setValues(position.getRow() -1, position.getColumn() +1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para sudoeste
		
		p.setValues(position.getRow() +1, position.getColumn() -1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Movimento para sudeste
		
		p.setValues(position.getRow() +1, position.getColumn() +1);
		if (getBoard().positionExits(p) && canMove(p)) {
		mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}
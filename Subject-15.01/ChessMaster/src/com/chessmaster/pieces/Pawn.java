package com.chessmaster.pieces;

public class Pawn extends Piece{
	public Pawn(String color, int row, int col){
		super(color,row,col);		
		this.power = 1;
		this.id = 1;
	}
	
	public boolean isMoveActionValidForPawn(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = (moveRowCoeficient == 1);
		boolean isColMoveValid = (moveColCoeficient == 0);
		return isRowMoveValid && isColMoveValid;
	}
	
	public void movePawn(int row, int col) {
		if(isMoveActionValidForPawn(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	public void renderPawn() {
		
	}

	@Override
	public void move(int moveRow, int moveCol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blast() {
		// TODO Auto-generated method stub
		
	}
}
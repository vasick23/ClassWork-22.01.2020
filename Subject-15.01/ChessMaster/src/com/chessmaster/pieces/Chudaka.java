package com.chessmaster.pieces;

public class Chudaka extends Piece{
	public Chudaka(String color, int row, int col) {
		super(color, row, col);
		this.power = 15;
		this.id = 7;
	}
	public boolean isMoveActionValidForPawn(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = (moveRowCoeficient == 1);
		boolean isColMoveValid = (moveColCoeficient == 0);
		return isRowMoveValid && isColMoveValid;
	}
	@Override
	public void move(int moveRow, int moveCol) {
	}
	@Override
	public void attack(int attackRow, int attackCol) {	
	}
	@Override
	public void blast() {
		// TODO Auto-generated method stub
		
	}
}

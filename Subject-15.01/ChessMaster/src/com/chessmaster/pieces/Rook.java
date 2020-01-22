package com.chessmaster.pieces;

public class Rook extends Piece{
	public Rook(String color, int row, int col){
		super(color,row,col);
		this.power = 5;
		this.id = 4;
	}
	public boolean isMoveActionValidForRook(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient >= 0) && (moveColCoeficient <= 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}
		return isRowMoveValid & isColMoveValid;
	}
	
	public void move(int row, int col) {
		if(isMoveActionValidForRook(row, col)) {
			this.row = row;
			this.col = col;
		}
	}	
	public void renderRook() {
		
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

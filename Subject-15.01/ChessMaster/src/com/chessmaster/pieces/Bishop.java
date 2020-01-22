package com.chessmaster.pieces;

public class Bishop extends Piece{	
	public Bishop(String color, int row, int col){
		super(color,row,col);
		this.power = 5;
		this.id = 2;
	}
	public boolean isMoveDiagonalForBishop(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		int StartPosition = this.row + this.col;
		int NextPosition = moveRow + moveCol;
		boolean isDiagonalValid = false;
		if(StartPosition == NextPosition) {
			isDiagonalValid = true;
		}else {
			if(moveRowCoeficient == moveColCoeficient) {
				isDiagonalValid = true;
			}
		}
		return isDiagonalValid;
	}
	public void move(int row, int col) {
		if(isMoveDiagonalForBishop(row, col)) {
			this.row = row;
			this.col = col;
		}
	}
	public void renderBishop() {
		
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
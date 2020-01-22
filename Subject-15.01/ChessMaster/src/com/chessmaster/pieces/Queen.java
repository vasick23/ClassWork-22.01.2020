package com.chessmaster.pieces;

public class Queen extends Piece{
	public Queen(String color, int row, int col){
		super(color,row,col);
		this.power = 10;
		this.id = 6;
	}
	public boolean isMoveActionValidForQueen(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient >= 0) && (moveColCoeficient <= 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}
		return isRowMoveValid && isColMoveValid;
	}
	public boolean isMoveDiagonalForQueen(int moveRow, int moveCol) {
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
		if((isMoveActionValidForQueen(row, col)) && (isMoveDiagonalForQueen(row, col))) {
			this.row = row;
			this.col = col;
		}
	}
	public void renderQueen() {
		
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

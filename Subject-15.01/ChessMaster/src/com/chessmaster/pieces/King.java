package com.chessmaster.pieces;

public class King extends Piece{
	public King(String color, int row, int col){
		super(color,row,col);
		this.power = 6;
		this.id = 5;
	}
	public boolean isMoveActionValidForKing(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;		
		boolean isRowMoveValid = false;
		boolean isColMoveValid = false;
		if((moveRowCoeficient <= 1) && (moveColCoeficient == 0)) {
			isColMoveValid = true;
			isRowMoveValid = true;
		}else {
			if((moveRowCoeficient == 0)&& (moveColCoeficient <= 1)) {
				isColMoveValid = true;
				isRowMoveValid = true;
			}
		}
		return isRowMoveValid && isColMoveValid;
	}
	public boolean isMoveDiagonalForKing(int moveRow, int moveCol) {
		int StartPosition = this.row + this.col;
		int NextPosition = moveRow + moveCol;
		boolean isDiagonalValid = false;
		if(StartPosition == NextPosition) {
			isDiagonalValid = true;
		}else {
			if(StartPosition == (NextPosition + 2)) {
				isDiagonalValid = true;
			}else {
				if(StartPosition == (NextPosition - 2)) {
					isDiagonalValid = true;
				}
			}
		}
		return isDiagonalValid;
	}	
	public void move(int row, int col) {
		if((isMoveActionValidForKing(row, col)) && (isMoveDiagonalForKing(row, col))) {
			this.row = row;
			this.col = col;
		}
	}
	public void renderKing() {
		
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

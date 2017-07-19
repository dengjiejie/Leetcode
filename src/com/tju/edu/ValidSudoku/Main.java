package com.tju.edu.ValidSudoku;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] height = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		//System.out.println(isValidSudoku(height));
	}
	
	public static boolean isValidSudoku(char[][] board) {
		if(board == null || board.length!=9 || board[0].length !=9){
			return false;
	    }
		for(int i = 0; i < 9; i++){
			boolean[] check = new boolean[9];
			boolean[] check1 = new boolean[9];
			boolean[] check2 = new boolean[9];

			for(int j = 0; j < 9; j++){
				if(board[i][j] == '.')continue;
				if(check[Character.getNumericValue(board[i][j])-1]){
					return false;
				}else {
					check[Character.getNumericValue(board[i][j])-1] = true;
				}
			}
			for(int j = 0; j < 9; j++){
				if(board[j][i] == '.')continue;
				if(check1[Character.getNumericValue(board[j][i])-1]){
					return false;
				}else {
					check1[Character.getNumericValue(board[j][i])-1] = true;
				}
			}
			int x = i * 3;
			int y = x / 9;
			x %= 9;
			y *= 3;
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					if(board[x+j][y+k] == '.')continue;
					if(check2[Character.getNumericValue(board[x+j][y+k])-1]){
						return false;
					}else {
						check2[Character.getNumericValue(board[x+j][y+k])-1] = true;
					}
				}
			}
		}
		return true;
    }
	
	
	
//	public static boolean isValidSudoku(char[][] board) {
//		if(board == null || board.length!=9 || board[0].length !=9){
//			return false;
//	    }
//		Map<Character, Integer> xMap = new HashMap<Character, Integer>();
//		Map<Character, Integer> yMap = new HashMap<Character, Integer>();
//		for(int i = 0; i < 9; i++){
//			xMap.clear();
//			yMap.clear();
//			for(int j = 0; j < 9; j++){
//				if(xMap.containsKey(board[i][j])){
//					return false;
//				}else if(board[i][j] != '.'){
//					xMap.put(board[i][j], i);
//				}
//				if(yMap.containsKey(board[j][i])){
//					return false;
//				}else if(board[j][i] != '.'){
//					yMap.put(board[j][i], j);
//				}
//			}
//			xMap.clear();
//			int x = i * 3;
//			int y = x / 9;
//			x %= 9;
//			y *= 3;
//			for(int j = 0; j < 3; j++){
//				for(int k = 0; k < 3; k++){
//					if(xMap.containsKey(board[x+j][y+k])){
//						return false;
//					}else if(board[x+j][y+k] != '.'){
//						xMap.put(board[x+j][y+k], i);
//					}
//				}
//			}
//		}
//		return true;
//    }
	
	
}

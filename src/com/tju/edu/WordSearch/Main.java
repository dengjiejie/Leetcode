package com.tju.edu.WordSearch;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] height = {
		                  {'A','B','C','E'},
		                  {'S','F','C','S'},
		                  {'A','D','E','E'}
		};
		System.out.println(exist(height,"SEE"));
	}
	
    static boolean[][] visited;
	public static boolean exist(char[][] board, String word) {
		int lenX = board.length;
		int lenY = board[0].length;
        visited = new boolean[lenX][lenY];
		for(int i = 0; i < lenX; i++){
			for (int j = 0; j < lenY; j++) {
				if(board[i][j] == word.charAt(0)){
					if(helper(board, word, i, j, 0)){
						return true;
					}
				}
			}
		}
		return false;   
	}
	
	public static boolean helper (char[][] board, String word,int x, int y,int num) {
		if(num == word.length())return true;
		
		 if(x >= board.length || x < 0 || y >= board[0].length || y < 0 || board[x][y] != word.charAt(num) || visited[x][y]){
	            return false;
	     }
		 visited[x][y] = true;
		 if(helper(board, word, x-1, y, num+1) || helper(board, word, x+1, y, num+1) ||
				 helper(board, word, x, y-1, num+1) || 
				 helper(board, word, x, y+1, num+1)){
		            return true;
		 }
	     visited[x][y] = false;
		return false;
	}
	
}

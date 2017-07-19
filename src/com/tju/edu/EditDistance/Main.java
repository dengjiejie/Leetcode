package com.tju.edu.EditDistance;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minDistance("olog","og"));
		
		
	}
	public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
       return minDistance(word1, word2, word1.length() - 1, word2.length() - 1, dp);
    }
    
    public static int minDistance(String word1, String word2, int i, int j, int[][] dp) {
        if (i < 0 )
            return j + 1;
        if (j < 0)
            return i + 1;
        if (dp[i][j] != 0)
            return dp[i][j];
        int minElement = 0;    
        if (word1.charAt(i) == word2.charAt(j)) {
            minElement = minDistance(word1, word2, i - 1, j - 1, dp);
        } else {
            int min = Math.min(minDistance(word1, word2, i, j - 1, dp), minDistance(word1, word2, i - 1, j, dp));
            minElement = 1 + Math.min(minDistance(word1, word2, i - 1, j - 1, dp), min);
            
        }
        dp[i][j] = minElement;
        return minElement;
    }
    
//	public static int minDistance(String word1, String word2) {
//		if(word1.isEmpty() || word2.isEmpty())return word1.length() > word2.length()?word1.length():word2.length();
//		int lenX = word1.length()+1;
//		int lenY = word2.length()+1;
//		int[][] num = new int[lenX][lenY];
//		int min;
//		int upmun, leftnum, upleftnum; 
//		for(int i = 0; i < lenX; i++){
//			num[i][0] = i;
//		}
//		for(int j = 0; j < lenY; j++){
//			num[0][j] = j;
//		}
//		
//		for(int i = 1; i < lenX; i++){
//			for (int j = 1; j < lenY; j++) {
//				leftnum = num[i-1][j];
//				upmun = num[i][j-1];
//				upleftnum = num[i-1][j-1];
//				min = Math.min(upleftnum,Math.min(leftnum, upmun));
//				if(min == Integer.MAX_VALUE)min = 0;
//				num[i][j] = (word1.charAt(i-1) == word2.charAt(j-1)) ? num[i-1][j-1]:min+1;
//			}
//		}
//		return num[lenX-1][lenY-1];
//    }
	
	
	
	
	
//	public static int minDistance(String word1, String word2) {
//		return fingPath(word1, word2, 0, 0);
//    }
//	
//	public static int fingPath(String word1, String word2, int i, int j) {
//		
//		if(i == word1.length() || j == word2.length()){
//			return Math.max(word1.length() - i, word2.length() - j );
//		}
//		if(word1.charAt(i) == word2.charAt(j)){
//			return fingPath(word1, word2, i+1, j+1);
//		}
//		int x1 = fingPath(word1, word2, i, j+1);//tianjia 
//		int x2 = fingPath(word1, word2, i+1, j);//shanchu  
//		int x3 = fingPath(word1, word2, i+1, j+1);//tihuan 
//		int x4 = Math.min(x1, Math.min(x2, x3)) + 1;
//		
//		return x4;
//	}
	
}

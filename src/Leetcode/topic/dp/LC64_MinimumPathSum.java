package Leetcode.topic.dp;

import java.util.Arrays;

public class LC64_MinimumPathSum {
    public static void main(String[] args) {
//        System.out.println(new LC64_MinimumPathSum().minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
        System.out.println(new LC64_MinimumPathSum().minPathSum(new int[][]{{1,2,5},{3,2,1}}));
    }
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] += grid[i][j];

                if(i>0 && j>0){
                    dp[i][j] += Math.min(dp[i-1][j],dp[i][j-1]);
                }
                else if(i>0){
                    dp[i][j] +=dp[i-1][j];
                }
                else if(j >0){
                    dp[i][j] +=dp[i][j-1];
                }

            }
        }

        System.out.println(Arrays.deepToString(dp));

        return dp[dp.length-1][dp[0].length-1];
    }
}

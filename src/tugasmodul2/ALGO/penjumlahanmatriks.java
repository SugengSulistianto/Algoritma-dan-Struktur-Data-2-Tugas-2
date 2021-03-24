/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul2.ALGO;

/**
 *
 * @author ACER
 */
public class penjumlahanmatriks {
    public static void main (String[] args){
        int[][]R = {
            {3, 7, 1},
            {2, 4, 6},
            {5, 8, 9},
        };
        
        int[][]S = {
            {6, 2, 4},
            {3, 5, 1},
            {8, 7, 9},
        };
        
        if((R.length == S.length) && (R[0].length == S[0].length)) {
            int[][] T = new int[R.length][R[0].length];
            for(int i=0; i<R[0].length; i++) {
                for(int j=0; j<R[0].length;j++) {
                    T[i][j] = R[i][j] + S[i][j];
                }
            }
            
            
                for(int[] t: T) {
                  for(int q: t) {
                      System.out.print(q+" ");
                  }
                  System.out.println();
                }
                System.out.println(T[1][2]);
        }
        else {
            System.out.println("Ukuran matrix tidak sama");
        }
    }
}

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
public class penguranganmetriks {
    
   public static void main(String[] args) {
       
        int[][] A = {
            {10, 20},
            {30, 40},
            {12, 40},
        };
        
        int[][] B = {
            {5, 10},
            {20, 20},
            {10, 30},
        };
        
   
        
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int[A.length][A[0].length];
            for(int i = 0; i < A.length; i++) {
                for(int j = 0; j < A[0].length;j++) {
                    C[i][j] = A[i][j] - B[i][j];
            }
            
        }
                
            for(int[] c : C) {
              for(int q : c) {
                  System.out.print(q+" ");
              }
              System.out.println();
            }
    }
      
    }
}


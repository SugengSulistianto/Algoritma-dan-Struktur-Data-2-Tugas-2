/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul2.ALGO;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Transposematriks {
    public static void main(String[] args) {
      int i, j, m, n;
      int matriks[][] = new int[10][10];
      int tranpose[][] = new int[10][10];
      Scanner scan = new Scanner(System.in);
      System.out.print("Masukan Jumlah Baris Matriks: ");
      m = scan.nextInt();
      System.out.print("Masukan Jumlah Kolom Matriks: ");
      n = scan.nextInt();
      System.out.print("Masukan Elemen Matriks: ");
      for(i = 0; i < m; i++){
          for(j = 0; j < n; j++){
              matriks[i][j] = scan.nextInt();
          }
      }
      
      System.out.println("Hasil Matriks: ");
      for(i = 0; i < m; i++){
          for(j = 0; j < n; j++){
              System.out.print(matriks[i][j] + "\t");
          }
          System.out.println();
      }
      for(i = 0; i < m; i++){
          for(j = 0; j < n; j++){
              tranpose[j][i] = matriks[i][j];
          }
      }
      
      System.out.println("Hasil Tranpose Matriks: ");
      for(i = 0; i < n; i++){
          for(j = 0; j < m; j++){
              System.out.print(tranpose[i][j] + "\t");
          }
          System.out.println();
      }
      System.out.print("Sugeng Sulistianto");
    }
}

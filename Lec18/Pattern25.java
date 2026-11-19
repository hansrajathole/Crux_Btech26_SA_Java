

package Lec18;

public  class Pattern25 {

     public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star = 1;
        
        int row = 1;
        while (row<=n) {
            // Space
            int sCol = 1;
            while (sCol<=space) {
                System.out.print("\t");
                sCol++;
            }

            // Number
            int nCol= 1;
            int num = 1;  
            while (nCol<= star ) {
                System.out.print(num +"\t");
                num++;
                nCol++;
            }

            // next line
            System.out.println();
            space--;
            star+=2;
            row++;

        }
     }
}
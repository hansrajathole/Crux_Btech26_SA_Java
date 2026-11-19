

package Lec18;

public  class Pattern29 {

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
           
            while (nCol<= star ) {
                 if(nCol == 1 || nCol == star){
                    System.out.print(row +"\t");
                 }else{
                    System.out.print("0\t");
                 }
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
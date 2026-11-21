package Lec19;

public class Pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int space = n-1;
        int star = 1;
        int num = n;
        int row = 1;

        while (row<=n) {
            //Space Print
            int sCol = 1;
            while (sCol<=space) {
                System.out.print("  ");
                sCol++;
            }

            // Number 
            int nCol = 1;
            while (nCol<=star) {
                if (num == n) {
                    System.out.print("0 ");
                }else{
                    System.out.print(num+" ");
                }

                if(nCol < star/2+1){
                    num++;
                }else{
                    num--;
                }
                nCol++;
            }

            // Next line prep
            System.out.println();
            space--;
            star+=2;
            row++;
        }
    }
}

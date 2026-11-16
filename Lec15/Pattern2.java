package Lec15;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;

        while (row<=n) {
            
            // Star print krna
            int col = 1;
            while (col<=star) {
                System.out.print("* ");
                col++;
            }

            // Next line prep 
            System.out.println();
            row++;
            star++;

        }
    }
}

package Lec14;

public class Pattern1 {
    public static void main(String[] args) {
      int n = 10;
      int star = n;
      int row = 0;

      while (row<n) {


        // star print
            int col =0;
            while (col<star) {
                System.out.print("* ");
                col++;
            }

            // next line prep
            System.out.println();
            row++;


      }

    }
}

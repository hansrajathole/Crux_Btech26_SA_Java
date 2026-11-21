package Lec19;

public class Pattern30 {
    public static void main(String[] args) {
      int n = 5;
      int star = n;
      int row = 0;

      while (row<n) {


        // star print
            int col =0;
            int num = n;
            while (col<star) {
                System.out.print(num+"\t");
                num--;
                col++;
            }

            // next line prep
            System.out.println();
            row++;


      }

    }
}

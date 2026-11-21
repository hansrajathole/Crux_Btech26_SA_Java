package Lec19;

public class Pattern31 {
    public static void main(String[] args) {
      int n = 5;
      int star = n;
      int row = 1;

      while (row<=n) {


        // star print
            int col =1;
            int num = n;
            while (col<=star) {
                if(col+row-1 == n){
                    System.out.print("*\t");
                }else{
                    System.out.print(num+"\t");
                }
                num--;
                col++;
            }

            // next line prep
            System.out.println();
            row++;


      }

    }
}

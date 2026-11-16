package Lec15;

public class Pattern7 {
   public static void main(String[] args) {

    int n = 5;
    int star = n;
    int row = 1;

    while(row<= n){
        // Star Print 
        int col = 1;
        while (col<=star) {
            if(col == 1 || row == 1 || col == n || row == n ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }

            col++;
        }

        // Next line prep
        System.out.println();
        row++;

    }
   }
}

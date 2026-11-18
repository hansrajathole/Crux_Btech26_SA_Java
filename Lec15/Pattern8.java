package Lec15;

public class Pattern8 {
   public static void main(String[] args) {

    int n = 7;
    int star = n;
    int row = 1;

    while(row<= n){
        // Star Print 
        int col = 1;
        while (col<=star) {
            if(col == row  ||( row + col - 1) == n ||
            (( row ==1  || row == n) && (col%2 == 1))){
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

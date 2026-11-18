package Lec15;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;

        while (row<=n*2-1) {
            
            // Star print krna
            int col = 1;
            while (col<=star) {
                System.out.print("*\t");
                col++;
            }

            // Next line prep 
            System.out.println();
            if(row<n){
                star++;
            }else{
                star--;
            }
            row++;
          

        }
    }
}

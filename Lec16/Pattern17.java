package Lec16;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 7;
        int star = n/2;
        int space = 1;
        int row = 1;

        while (row <= n) {
            
            // Star
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }

            // Space
            int j = 1;
            while (j<= space) {
                System.out.print("  ");
                j++;
            }

            // Star
             i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }


            // Next line prep
            System.out.println();
             if(row<=n/2){
                star--;
                space += 2;

             }else{
                star++;
                space-=2;
             }

             row++;


        }
    }
}

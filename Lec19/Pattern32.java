package Lec19;

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;
        int num = 1;
        while (row<= n*2-1) {
            // Number print
            int col = 1;
            while (col <= star) {
                if(col%2 == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(num+" ");
                }
                col++;
            }

            // Next line prep
            System.out.println();
            if(row<n){
                num++;
                 star+=2;
            }else{
                num--;
                star-=2;
            }

           
            row++;
        }
    }
}

import java.util.Scanner;

public class ForloopDemo{
    public static void main(String[] args) {
        
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // for(int i = 1; i<= n ; i+=1){
        //     System.out.println(i);
        // }


         for(int i = 1; i<=10 ; i+=1){
            System.out.println(n*i);
        }
    }
}
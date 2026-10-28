import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        int a ;
        int b ;
        char operator;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        operator = sc.next().charAt(0);

        switch (operator) {
            case '-':
                System.out.println("After Substraction your value is : "+(a-b));
                break;
            case '+':
                System.out.println("After Addition your value is : "+(a+b));
                break;
        
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}

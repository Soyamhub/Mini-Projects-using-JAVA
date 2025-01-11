
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Use type X to end the program
        while (true) {
            System.out.println("Enter the operator ");
            char op = sc.next().charAt(0);
            int ans = 0;
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two numbers ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                switch (op) {
                    case '+':
                        ans = num1 + num2; 
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 - num2;
                        break;
                    case '/':
                        ans = num1 - num2;
                        break;
                    case '%':
                        ans = num1 - num2;
                        break;              
                    default:
                        break;
                }
                System.out.println(ans);
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operation! Try again.");
            }
            
        }
    }
}

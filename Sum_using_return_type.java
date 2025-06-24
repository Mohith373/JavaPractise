import java.util.Scanner;

public class Sum_using_return_type {
    public static void main(String[] args) {
        int result = sum2();  //the method return type is int so store it in int data type value
        System.out.println("The sum is: " + result);
    }

    static int sum2() {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        return sum;
    }
}


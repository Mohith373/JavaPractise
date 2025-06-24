import java.util.Scanner;

public class Sum_using_no_return_type {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        int num1,num2,sum;
        System.out.println("enter number 1");
        Scanner in=new Scanner(System.in);
        num1= in.nextInt();
        System.out.println("enter 2nd number");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println(sum);

    }
}

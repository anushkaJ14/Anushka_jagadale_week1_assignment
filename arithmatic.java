import java.util.*;
import java.util.Scanner;
class arithmatic{
    public static void main(String[] args){
        int num1,num2,add,sub,mul;
        float divide;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first num:");
        num1=scanner.nextInt();
        System.out.println("Enter second num:");
        num2=scanner.nextInt();

        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        divide= (float) num1/num2;

        System.out.println("Addition="+add);
        System.out.println("Subtraction ="+sub);
        System.out.println("Multiplication="+mul);
        System.out.println("Division="+divide);
    }
}
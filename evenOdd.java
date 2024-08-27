import java.util.*;
class evenOdd{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num;
        num=reader.nextInt();
        if (num % 2==0)
            System.out.println(num + " "+"is even");
        else
            System.out.println(num + " "+"is odd");
    }
}
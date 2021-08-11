import java.util.Scanner;
public class FactorialOfNum {
    public static void main(String args[]){
        int i,fact=1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to return it's factorial:");
        int number = Integer.parseInt(reader.nextLine());
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}


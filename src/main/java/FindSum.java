import java.util.Scanner;
class FindSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first integer num:");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second Double num:");
        Double b = Double.parseDouble(reader.nextLine());
        Double sum = (Double) (a+b);
        System.out.println(sum);
    }
}

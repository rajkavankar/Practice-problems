import java.util.Scanner;

class Tables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the numter to get tables");
        n = sc.nextInt();
        for (i = 1; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
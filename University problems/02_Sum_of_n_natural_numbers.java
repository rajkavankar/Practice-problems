import java.util.Scanner;

class Natural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of natural numbers");
        int n = sc.nextInt();
       /* int sum = 0;

        for (int i = 1; i <= n; i++) {
             sum = sum + i; 
            sum += i; <- Short hand version
        }*/

        int sum = n*(n+1)/2;

        System.out.println("Sum of n integers is: " + sum);
    }
}
/*
With
n = 5
n = 1 + 2 + 3 + 4 + 5
n = 15

Initial value
sum = 0

First Pass
sum = 0 + 1 
sum = 1

Second Pass
sum = 1 + 2
sum = 3

Third Pass
sum = 3 + 3
sum = 6

Forth Pass
sum = 6 + 4
sum = 10

Fifth pass
sum = 10 + 5
sum = 15
*/
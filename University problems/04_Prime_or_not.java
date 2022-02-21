class Prime{
    public static void main(String[] args) {
        
        int n = 7;
        for (int i = 2;  i < n/2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is a not prime number"); 
                break;      
            } else {
                System.out.println(n + " is a prime number");
               break;
            }
        }
    }
}

/*
x * y = n
x < root(n)
y > root(n)

FOR 12
possible outcomes
2 * 6
3 * 4
4 * 3
6 * 2

sqrt of 12 in Integer = 3
if n is not divisble till root(n) then it wont be divisble
Then it becomes a Prime number

*/
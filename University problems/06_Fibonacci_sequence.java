class Fibonacci{

    static void printFib(int n){
        int n1=0, n2=1, n3=0 ;
        System.out.print(n1+" "+n2);
        for (int i = 0; i < n-2; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }

    static void nthFib(int n){
        int n1=0, n2=1, n3=0 ;
        
        for (int i = 0; i < n -2; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
    }

    static void sumFib(int n){
        int n1=0, n2=1, n3=0, sum=0;

        for (int i = 0; i < n-2; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            sum += n3;
        }

        System.out.println(sum+1);
    }

    public static void main(String[] args) {
        printFib(7);
        System.out.println("");
        nthFib(7);
        sumFib(7);
    }
}
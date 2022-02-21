import java.lang.reflect.Array;

class Binary{
  
    public static void main(String[] args) {
        int n = 10, rem, i = 0;
        int a[]= new int[10];
        while (n!=0) {
            rem = n%2;
            n = n/2;
            a[i] = rem;
            i++; 
        }

        

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }

    }
}

/*
PASSES

FOR 10

PASS 1
n = 10
rem = n % 2
rem = 10 % 2
rem = 0

n = n / 2
n = 10 / 2
n = 5

a[0] = 0

current array a[] = {0}

PASS 2
n = 5
rem = 5 % 2
rem = 1

n = 5 / 2 -> Floatin points will be ignored due to int data type
n = 2

a[1] = 1

current array a[] = {0, 1}

PASS 3
n = 2
rem = 2 % 2
rem = 0

n = 2 / 2
n = 1

a[2] = 0

current array a[] = {0, 1, 0}

PASS 4
n = 1

rem = 1 % 2
rem = 1

n = 1 / 2
n = 0

a[3] = 1

current array a[] = {0, 1, 0, 1}

NOW (n == 0) SO NOW LOOP WON'T ITERATE

NOW REVERSE THE ARRAY 

current array a[] = {0, 1, 0, 1}
after reversing a[] = {1, 0, 1, 0}

after printing it we get binary for 10 that is 1010

*/
public class FibonacciSequence {
    
    // Recursive
    int fib_rec(int n){
        // Base case
        if(n<=1){
            return n;
        }
        return fib_rec(n-1) + fib_rec(n-2); 
    }

    // Non Recursive
    void fib_nonrec(int n){
        int a = 1;
        int b = 1;

        while(n>0){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
            n--;
        }
    }

    public static void main(String args[]){
        FibonacciSequence obj = new FibonacciSequence();
        int n = 6;
        System.out.println(obj.fib_rec(n));
        obj.fib_nonrec(n);
    }

}

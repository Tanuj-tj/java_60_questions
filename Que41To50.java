import java.util.*;

class Que41To50{

    // Q41.
    void two_integers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();

        if(a==b)
            System.out.println(a+" and "+b+" are equal");
        else    
            System.out.println(a+" and "+b+" are not equal");
    }

    // Q42.
    void simple_intrest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount :");
        float p = sc.nextFloat();
        System.out.print("Enter Rate :");
        float r = sc.nextFloat();
        System.out.print("Enter Time :");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.print("Simple Intrest(SI) : "+si);

    }

    // Q43.
    void table(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer to get the table : ");
        long n = sc.nextLong();

        for(int i=1;i<=10;i++){
            long mul = n * i; 
            System.out.println(n+" x "+i+" = "+mul);
        }
    } 

    // Q44.
    void pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        long n = sc.nextLong();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Q45.
    void  Concatenate(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string A : ");
        String A = sc.nextLine();

        System.out.print("Enter string B : ");
        String B = sc.nextLine();

        String C = A + B;

        System.out.print("Concatenating string A and B : "+C);

    }

    // Q46.
    void toggle(){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string to Toggle : ");
        // String str[] = sc.nextLine();

        // for(int i=0;i<str.length;i++){
        //     if(str.charAt(i)>=65 && str.charAt(i)<=90)
        //         charAt(i) += 32;
        //     else if(str.charAt(i)>=97 && str.charAt(i)<=122)
        //         charAt(i) -= 32;
        //     // System.out.print("Toggled string : "+str[i]);
        // }
        // System.out.print("Toggled string : "+str);
    }

    // Q47.
    public static int power(int num,int pow){
        if(pow != 0)
            return num*(power( num,pow - 1));
        else  
            return 1;
    }

    // Q48.
    void adding_digits(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to get the sum of its digits : ");
        long num = sc.nextInt();
        long temp = num;
        int sum = 0;
        
        while(num!=0){
            long last = num % 10;
            sum  += last;
            num /= 10;
        }
        System.out.print("Sum of digits of "+temp+" is : "+sum);

    }

    // Q49.

    // Q50.
    void binary_search(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in an array : ");
        int n = sc.nextInt();
        System.out.print("Insert elements in an array : ");
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }

        System.out.print("Enter key to search in the given array : ");
        int key = sc.nextInt();

        int start = 0;
        int end = n-1;
        int mid = ( start + end ) / 2;
        boolean check = true;

        while(start<end){
            
            if(mid==key){
                check = false;
            }

            else if(mid>key){
                end = mid - 1;
            }
            else{    
                start = mid + 1;
            }
        }
        if(check==false){
             System.out.print("Element found at index value : "+mid);
        }
        else{
            System.out.print("Not found ");
        }     
   
    }

    // Main method
    public static void main(String args[]){
        Que41To50 obj = new Que41To50();
        //obj.two_integers();
        //obj.simple_intrest();
        //obj.table();  
        //obj.pattern();
        //obj.Concatenate();
        //obj.toggle();

        // int num = 3 , pow = 2;
        // System.out.print(num+"^"+pow+" = "+power(num,pow));  

        //obj.adding_digits();

        obj.binary_search();

    }
}
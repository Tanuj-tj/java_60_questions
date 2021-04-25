import java.util.*;

class Que31To40
{
   // Q31. 
   void greater(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st no. ");
       int num1 = sc.nextInt();
       System.out.print("Enter 2nd no. ");
       int num2 = sc.nextInt();
       System.out.print("Enter 3rd no. ");
       int num3 = sc.nextInt();

       if(num1 > num2){
           if(num1 > num3){
               System.out.println("Num 1 is greater");
           }
       }
       else if(num2 > num3){
           if(num2 > num1){
               System.out.println("Num 2 is greater");
           }
       }
       else{
           System.out.println("Num 3 is greater");
       }
   }
   
   // Q32.
   void sum_of_even_odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int even = 0;
        int odd = 0;

        System.out.print("Enter elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2==0){
                even += arr[i];
            }
            else{
                odd += arr[i];
            }
        }

        System.out.print("Sum of even elements : "+even);
        System.out.println();
        System.out.print("Sum of odd elements : "+odd);

   } 

   // Q33. 
   void check_even_odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to check for even/odd : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print(n+" is even");
        }
        else{
            System.out.print(n+" is odd");
        }
   }

   // Q34.
   void check_prime(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to check for prime : ");
        int n = sc.nextInt();

        if(n<2){
            System.out.print("Not prime");
        }
        int flag = 1; 
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.print("Prime");
        else    
            System.out.print("Not prime");
   }

   // Q35.
   void print_prime(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting and ending numbers : ");
        int l = sc.nextInt();
        int u = sc.nextInt();

        int flag;
        for(int i=l;i<=u;i++){
            flag=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    flag+=1;
            }
            if(flag==2)
                System.out.print(i+" ");
        }
   }

   // Q36.
   void sum_of_natural_no(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("Sum of "+n+" natural numbers is : "+sum);

   }

   // Q37. 
   void area_eq_triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of equilateral triangle : ");
        int a = sc.nextInt();
        double area = ( 1.73 * a* a) / 4 ;  
        System.out.println("Area of Equilateral Triangle is : "+area); 
   }

   // Q38.
   void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1 : ");
        double a = sc.nextDouble();
        System.out.print("Enter operand 2 : ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+,-,/,*) : ");
        char op = sc.next().charAt(0);
     
        double c;
        switch(op){
            case '+':
            c = a + b;
            System.out.print("Addition of "+a+" and "+b+" is : "+c);
            break;

            case '-':
            c = a - b;
            System.out.print("Subtraction of "+a+" and "+b+" is : "+c);
            break;

            case '/':
            c = a / b;
            System.out.print("Division of "+a+" and "+b+" is : "+c);
            break;

            case '*':
            c = a + b;
            System.out.print("Multiplication of "+a+" and "+b+" is : "+c);
            break;

            default:
            System.out.print("Enter valid operator");
        }
   }

   // Q39.
   void factors(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int n = sc.nextInt();
       System.out.print("Factors of " + n + " are: ");

        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
   }

   // Q40.
   void perimeter_of_rectangle(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Lenght(L) : ");
       int lenght = sc.nextInt();
       System.out.print("Enter Bredth(B) : ");
       int bredth = sc.nextInt();

       int perimeter = 2 * (lenght + bredth);
        
       System.out.print("Perimeter of Rectangle : "+perimeter);

   }
   public static void main(String args[]){
        Que31To40 obj = new Que31To40();
        //obj.greater();
        //obj.sum_of_even_odd();     
        //obj.check_even_odd();
        //obj.check_prime();
        //obj.print_prime();
        //obj.sum_of_natural_no();
        //obj.area_eq_triangle();
        //obj.calculator();  
        //obj.factors();
        //obj.perimeter_of_rectangle();

   }
}
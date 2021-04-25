import java.util.*;

class Que11To20
{
    // Q11.
    void ascii_values(){
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
		int asciivalue = ch;

		System.out.println("Ascii Value of "+ch+" is "+asciivalue);
    }
    // Q12.
    void celsius_to_ferenhiet(){
        System.out.print("Enter temperature in Celsius(C) : ");
        Scanner sc = new Scanner(System.in);
        double cel = sc.nextDouble();   // 98
		double fer = cel * 1.8 * 32;

		System.out.println(cel+" Deg celcius = "+fer+" Deg Fahrenheit");
    }
   
    // Q13. 
    void factorial(){
        System.out.print("Enter a no. to get the factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 98

        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }

        System.out.println("Factorial is : "+fact);

    }

    // Q14.
    void vowel_or_consonant(){

        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

    // Q15.
    void leapyear(){
        System.out.print("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

    // Q16.
    void lower_or_upper(){
        System.out.print("Enter a character to check lower or upper : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>=97 && ch<=122){
            System.out.println("Character is in Lower case");
        }
        else if(ch>=65 && ch<=90){
            System.out.println("Character is in Upper case");
        }
        else{
            System.out.println("Invalid character");
        }
    }

    // Q17.
    void sqrt(){
        System.out.print("Enter a no. to get a square root : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double sq = Math.pow(n,0.5);
        System.out.print("square root of "+n+"is : "+sq);
    }

    // Q18. 
    void reverse(){
        System.out.print("Enter a no. to reverse : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 1234
        int temp = n;                  // temp = 1234 , 123
        int rev = 0;                   // rev = 0 , 4 , 43 

        while(temp!=0){
            int last = temp%10;            // last = 4 , 3
            rev = (rev * 10) + last;       // rev = (0 * 10) + 4 = (4 * 10) + 3 = 43 
            temp/=10;                      // temp = 123 , 12
        }

        System.out.println(rev);
    }

    // Q19.
    void count(){
        System.out.print("Enter a no. to the its digits : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        System.out.print("No. of digits in "+n+" are "+count);
    }

    // Q20.
    void fibbonacci(){
        // 1,1,2,3,5
        System.out.print("Enter a no. to end the fibbonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 5
    
        int a = 1;
        int b = 1;
    
        while(n!=0){

            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            n--;
        }
    }
    
    // main function
    public static void main(String args[]){
        Que11To20 obj = new Que11To20();
        obj.ascii_values();
        obj.celsius_to_ferenhiet();
        obj.factorial();
        obj.vowel_or_consonant();
        obj.leapyear();
        obj.lower_or_upper();
        obj.sqrt();
        obj.reverse();
        obj.count();
        obj.fibbonacci();
    }
}
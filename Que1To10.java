import java.util.*;

class Que1To10 // 
{
	// Q1.
    void printname(){
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for(int i=0;i<5;i++){
			System.out.println(name);
		}
	}
 
	// Q2. // Q3.
	void naturalnumbers(){
		System.out.println("Natural Numbers from 1 to 10 : ");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}

		System.out.println("Natural Numbers from 10 to 1 : ");
		for(int i=10;i>=1;i--){
			System.out.println(i);
		}
	}
 
	// Q4. // Q5.
    void even_odd(){
		System.out.println("Even Numbers from 1 to 10 : ");
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}

		System.out.println("Odd Numbers from 1 to 10 : ");
		for(int i=1;i<=10;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

	// Q6. 
	void armstrong(){

		System.out.print("Enter a no. to check for armstrong : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 153
    	int temp = n;                            // temp = 153 , 15 , 1
    	int sum = 0;
    	while(temp!=0){
        	int last = temp % 10;             // last = 3 ,5 ,1 
        	int cube = last * last * last;      // cube = 3 * 3 * 3 = 27  , 5 * 5 * 5 = 125
        	sum += cube;                        // sum = 27 + 125 
        	temp /= 10;                           // temp = 15 , 5
    	}
    
    	if(sum==n){
        	System.out.println("Armstrong");
    	}
    	else{
        	System.out.println("Not a Armstrong");
    	}
	}

	// Q7.
	void palindrome(){
		System.out.print("Enter a no. to check for palindrome : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 121  // n =  122 => Not , 121 => Yes 
    	int temp = n;
    	int rev = 0;
    
    	while(temp!=0){
        	int last = temp%10;       // 2 , 2 , 1
        	rev = (rev * 10) + last;  // (0 * 10) + 2 => 2 , (2 * 10) + 2 = 22 , (22 * 10) + 1 = 221        
        	temp/=10;
    	}
    
   		if(n==rev)
        	System.out.println("Palindrome Number\n");
    	else
        	System.out.println("Not a Palindrome Number\n");
	}

    // Q10.
	void area_and_circumference_of_circle(){

		System.out.print("Radius : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt(); //10
    
    	double pi = 3.1415;

    	double area = pi * radius * radius;

    	System.out.println("Area of circle with radius "+radius+" is "+area);
 
	    double circumference = 2 * pi * radius;

    	System.out.println("Circumference circle with radius "+radius+" is "+circumference);

	}
	
	// Main function
	public static void main(String args[]){
		Que1To10 obj = new Que1To10();
		obj.printname();
		obj.naturalnumbers();
		obj.even_odd();
		obj.armstrong();
		obj.palindrome();
		obj.area_and_circumference_of_circle();
	}
}
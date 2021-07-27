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

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

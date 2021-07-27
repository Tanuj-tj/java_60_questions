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

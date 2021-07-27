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

  void swap_using_third_val(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        System.out.println("Values of a = "+a+" and b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap Values of a = "+a+" and b = "+b);

    }

    // Q28.
    void swap_without_third_val(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        System.out.println("Values of a = "+a+" and b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap Values of a = "+a+" and b = "+b);

    }

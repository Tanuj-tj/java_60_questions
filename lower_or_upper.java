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

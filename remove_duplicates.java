 void remove_duplicates(){
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array with duplicated : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
       
        int[] temp = new int[size];  
        int j = 0;  
        for (int i=0; i<size-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[size-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  

        System.out.println();
        System.out.print("Array without duplicated : ");
        for(int i=0; i<j; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
         
    }

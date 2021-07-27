 void delete_in_array(){

        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before deletion : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the position to delete : ");
        int pos = sc.nextInt();
        for(int i=pos; i<size; i++)
        {
            arr[i] = arr[i+1];
        }
        --size;
        System.out.print("Array after deletion : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }

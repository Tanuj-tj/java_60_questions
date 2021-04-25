import java.util.*;

class Que21To30
{
    // Q21.
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

    // Q22.
    void sum_of_elements(){
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        int sum = 0;

        for(int i=0;i<size;i++){
            sum += arr[i];
        }
        
        System.out.println();
        System.out.println("Sum : "+sum);

    }

    // Q23. 
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

    // Q24. 
    void seperate_even_and_odd(){
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array : ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int[] even = new int[25];
        int[] odd = new int[25];
       
        int j=0,k=0;
        for(int i=0;i<size;i++){
            if(arr[i] % 2==0){
                even[j++] = arr[i];
            }
            else{
                odd[k++] = arr[i]; 
            }
        }
   
        System.out.println();
        System.out.print("Even Array : ");
        for(int i=0; i<j-1; i++)
        {
            System.out.print(even[i] + " ");
        }
    
        System.out.println();
        System.out.print("Odd Array : ");
        for(int i=0; i<k-1; i++)
        {
            System.out.print(odd[i] + " ");
        }

    }

    // Q25.
    void add_sub_matrices(){
        // int a[][] = {{1,2,3},
        //             {4,5,6},
        //             {7,8,9}};

            
        // for(int i=0;i<a.length;i++){
        //     for(j=0;j<a.length;j++){
        //         System.out.print(a[i][j]," ");
        //     }
        //     System.out.println();
        // }
    }

    // Q26.
    void transpose_a_matrix(){

    }

    // Q27.
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

    // Q29.
    void total_minutes(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hours : ");
        int hours = sc.nextInt();
        System.out.print("Minutes : ");
        int minutes = sc.nextInt();
        
        int total_minutes = (hours * 60) + minutes;
        System.out.print("Total Minutes : "+total_minutes);

    }

    // Q30.
    void sum_and_avg(){
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
      
        System.out.print("Enter elements : ");
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum : "+sum);
        System.out.println();
        avg = (float)sum / n;
        System.out.print("Average : "+avg);
        
    }

public static void main(String args[]){
        Que21To30 obj = new Que21To30();
        //obj.remove_duplicates();
       //obj.sum_of_elements();
       // obj.delete_in_array();
       //obj.seperate_even_and_odd();
       //obj.swap_using_third_val();
       //obj.swap_without_third_val();
       //obj.add_sub_matrices();
       //obj.sum_and_avg();
       obj.total_minutes();
    }
}
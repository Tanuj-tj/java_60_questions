import java.util.*;

class Algorithms{

    // Insertion Sort
    void insertion_sort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j=i-1; 
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    // Binary Search
    int binary_search(int arr[],int start,int end,int key){
        
        if(start<=end){

            int mid = ( start + end ) / 2;

            if(arr[mid] == key)
                return mid; 
            
            else if(arr[mid] > key)
                return binary_search(arr,start,mid-1,key);   
             
            else    
                return binary_search(arr,mid+1,end,key);
        }
        return -1;
    }

    // Linar Search
    int linear_search(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    // Printing the array
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Main Function
    public static void main(String args[]){
      
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Enter size of array : ");
       int n = sc.nextInt();
       System.out.print("Enter elements of array : ");
       int arr[] = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }

    //    new Algorithms().insertion_sort(arr,n);
    //    System.out.print("Sorted array : ");
    //    printArr(arr,n);
       
       System.out.println();
       System.out.print("Enter a key to search in array (Binary Search) : ");
       int key1 = sc.nextInt();
       System.out.print("Element found at location : "+new Algorithms().binary_search(arr,0,n-1,key1));

       System.out.println();
       System.out.print("Enter a key to search in array (Linear Search) : ");
       int key2 = sc.nextInt();
       System.out.print("Element found at location : "+new Algorithms().linear_search(arr,n,key2));
    }
}
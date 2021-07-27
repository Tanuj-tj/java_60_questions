class P2_MethodOverloading{  

    void sum(int a,long b){
        System.out.println(a+b);
    }  
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }  
    
    public static void main(String args[]){  
        P2_MethodOverloading obj=new P2_MethodOverloading();  
        obj.sum(10,40);
        obj.sum(40,60,30);  
    
    }  
  }  
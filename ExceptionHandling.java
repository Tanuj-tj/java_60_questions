class ExceptionHandling{  
    void m(){  
        int data=50/0;  
    }  
    void n(){  
        m();  
    }  
    void p(){  
        try{  
            n();  
        }
        catch(Exception e){
            System.out.println("exception handled");
        }  
        finally{
            System.out.println("finally block is always executed");
        }  
    }  
    public static void main(String args[]){  
        ExceptionHandling obj = new ExceptionHandling();  
        obj.p();  
        System.out.println("normal flow...");  
    }  
}  

    
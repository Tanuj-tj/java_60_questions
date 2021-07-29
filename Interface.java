interface Bank{  

    // Abstract Method
    float rateOfInterest();  

}  
class SBI implements Bank{

    public float rateOfInterest(){
        return 9.15f;
    }  
}

class PNB implements Bank{  

    public float rateOfInterest(){
        return 9.7f;
    }  
}  
class P5_Interface{

    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println(b.rateOfInterest());
    b=new PNB();  
    System.out.println(b.rateOfInterest());  
    }
}

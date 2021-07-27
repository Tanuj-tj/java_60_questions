class P1_ConstructorOverloading {
 
    int id;  
    String name; 
    String branch;
  
    P1_ConstructorOverloading(){
        System.out.println("This is a No Argument Constructor");
    }

    P1_ConstructorOverloading(int id,String name){
       this.id = id;
       this.name = name;
    }
    P1_ConstructorOverloading(int id, String name,String branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    void display1(){
        System.out.println(id+" "+name);
    }
    void display2(){
        System.out.println(id+" "+name+" "+branch);
    }
  
    public static void main(String[] args) {
       P1_ConstructorOverloading obj1 = new P1_ConstructorOverloading();
       P1_ConstructorOverloading obj2 = new P1_ConstructorOverloading(1,"Tanuj");
       P1_ConstructorOverloading obj3 = new P1_ConstructorOverloading(1,"Tanuj","MCA");
       
       obj2.display1();
       obj3.display2();
    }
 } 
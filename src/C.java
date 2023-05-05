interface A{
    int a=10;
    void sum();
}
interface B{
    int b= 5;
    void sub();
}

class C implements A,B{
    public void sum(){  
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
 
} 
class Main{
    public static void main(String[] args) {
        C c=new C();
        c.sum();
        c.sub();
     }
}
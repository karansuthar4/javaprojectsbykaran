interface A{
    int a=15;
    void add();

 }

class B implements A{
    int b=6;
    public void add(){

        System.out.println(a+b);  

    }
    public void sub(){
        System.out.println(a-b);
    }
}

class mb{
    public static void main(String[] args) {
    B b1=new B();
    b1.add();
    b1.sub();
    }

}
    
class Mythread extends Thread{
    String s;
    Mythread(String s1){
        s=s1;
        start();
    }
    public void run(){
        System.out.println(s);
    }

}
class mm{
    public static void main(String[] args) {
        Mythread m1=new Mythread("hellokaran");
    }
    
    }

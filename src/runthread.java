class Mythread implements Runnable{
    Thread t;
    String s;
    Mythread(String s1){
        s=s1;
        start();
    }
    private void start() {
    }

    public void run() {
        System.out.println(s);

  
    }
   
}
class mk{
    public static void main(String[] args) {
        Mythread m1=new Mythread("hello");
    }
}

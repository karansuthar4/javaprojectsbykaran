class table
{
    synchronized
    void printtable(int n)
    {
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}
class Mythread1 extends Thread{
    table t;
    Mythread1(table t)
    {
        this.t=t;

    }
    public void run(){
        t.printtable(5);

    }

}
class Mythread2 extends Thread{
    table t;
    Mythread2(table t){
        this.t=t;

    }
    public void run(){
        t.printtable(100);

    }
}
class mdemo{
    public static void main(String[] args) {
        table obj=new  table();
        Mythread1 t2=new Mythread1(obj);
        Mythread2 t3=new Mythread2(obj);
        t2.start();
        t3.start();

    }
}

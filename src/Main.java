interface a{
    double carea(double r);
}
interface b{
    double rarea(double l, double b);

}
class circle implements a{


    public double carea(double r){
        return(3.14*r*r);
    }

}
class rectangle implements b{

    public double rarea(double l,double b){
        return(l*b);
    }
}
class main{
    public static void main(String[] args) {
        double a1,a2;
        circle c= new circle();
        a1=c.carea(9);
        System.out.println(a1);
        rectangle r= new rectangle();
        a2=r.rarea(4,8) ;
        System.out.println(a2);
    }
}
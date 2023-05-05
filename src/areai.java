interface findcarea{
    double area(double r);
}
interface findrarea{
    double area(double l, double b);

}
class  circle implements findcarea{

    public  double area(double r){
        return(3.14*r*r);
    }
}
class  rectangle implements findrarea{
    public double area(double l, double b){
        return(l*b);
    
    }
}

class areai{
    public static void main(String []args) {
        double a1,a2;
        circle c=new circle();
        a1=c.area(5);
        rectangle r=new rectangle();
        a2=r.area(6,3);
        System.out.println(a1);
        System.out.println(a2);


    }
}
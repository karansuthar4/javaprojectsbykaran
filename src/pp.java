
class pp {
 
    public static void main(String[] args) {
        int a[]=new int[4];
    
    try {
        a[1]=2989800;
        System.out.println(a[1]);
        
    } 
    catch(ArithmeticException e) {
        System.out.println(e);

    }
    catch(ArrayIndexOutOfBoundsException e1){
        System.out.println(e1);
    }
    catch(Exception e2){
        System.out.println(e2);
    }
    finally{
        System.out.println("always executed");
        }
    
    }

}
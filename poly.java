public class poly {
    static int sub(int a,int b)
    {
        int c=a+b;
        return c;
    }
    static  int sub(int a,int b,int c)
    {
        int d=a+b+c;
        return d;
    }
    public static void main(String args[])
    {
        System.out.println(poly.sub(20, 40 ));
        System.out.println(poly.sub(40 ,70 ,76));
    }
}

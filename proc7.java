public class proc7 {

    public static void main(String args[]) {
        int n1=10,n2=1,n3,i;
        int count=10;
        System.out.println(n1+""+n2);
        for(i=2;i<=count;++i)
            System.out.print(n1+"");

            {
                n3=n1+n2;
                System.out.println(""+n3);
                n1=n2;
                n2=n3;
            }
    }
    }

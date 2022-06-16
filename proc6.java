public class proc6 {
    public static void main(String args[]) {
        int num=675;
        int ld;
        while(num>0)
        {
            ld=num%10;

            if(ld%2==0) {
                System.out.println(ld);
            }
            num=num/10;
            }
        }
    }


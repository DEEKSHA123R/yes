import com.sun.source.tree.WhileLoopTree;

public class proc8 {

    public static void main(String args[]) {
        int num=371;
        int num1=num;
        int ld;
        int sum=0;
        int count=countDigit(num);
        int f;
        while(num>0) {
            ld = num % 10;
            int p = power(ld, count);
            sum = sum + p;
            num = num / 10;
        }
        if(sum==num1) {
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not armstrong number");
        }
    }
    public  static int power(int x,int n)
    {
        int p=1;
        for(int i=1;i<=n;i++) {
            p = p * x;
        }
        return p;
        }

    public static int countDigit(int num) {
        int count = 0;
      while (num>0)
        {
            num = num / 10;
            count++;
        }
        return count;
    }

}

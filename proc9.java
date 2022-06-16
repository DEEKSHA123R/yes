public class proc9 {
    public static void main(String args[]) {
int num=153;
int num1=num;
int r,m,s=0;
while(num>0)
{
    r=num%10;
    s=s+r*r*r;
    num=num/10;
}
if(num1==s) {
    System.out.println("armstrong");
}
else
{
    System.out.println("not armstrong");
}
    }
}

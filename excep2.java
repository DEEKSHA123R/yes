package encapsulation;
import java.io.*;

public class excep2 {
    public static void main(String[] args)
    {
        char[] array=new char[50];
        try {
            FileInputStream obj1 = new FileInputStream("D:\\java1.txt");
            InputStreamReader obj2 = new InputStreamReader(obj1);
            obj2.read(array);
            System.out.println(array);
            obj1.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();



        }
    }
}

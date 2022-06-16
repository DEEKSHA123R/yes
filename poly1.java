public class poly1 {

        static String animal(String a,String b) {
String c=a+b;
            return c;
        }
        static String animal(String a,String b,String c)
        {
String d=a+b+c;
            return  d;
        }
        public static void main(String args[])
        {
            System.out.println(poly1.animal("rabbit" ,"cow" ));
            System.out.println(poly1.animal("cat" ,"xyz","ptc"));
        }
    }






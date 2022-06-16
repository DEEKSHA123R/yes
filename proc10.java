public class proc10 {
        int id=1;
        double salary=21000;
        String name="deeksha";
        int write()
        {
            System.out.println("Hello");
            return 0;
        }
        public static void  main(String[] args) {
            proc10 obj1=new proc10();
            proc10 obj2=new proc10();

            System.out.println(obj1.id);
            System.out.println(obj1.salary);
            System.out.println(obj1.name);
            obj1.write();
            obj2.write();



        }
    }



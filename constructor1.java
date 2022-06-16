public class constructor1 {
    constructor1(int a) {
        System.out.println("constroctor with parameter");
    }
    constructor1() {
        System.out.println("constroctor without parameter");
    }
    constructor1(int a,String name)
    {
        System.out.println("different in parameter");

    }
    constructor1(String name,int a)
    {
        System.out.println("constructor is differ in the  order of parameter");
    }
    public static void main(String args[]) {
        constructor1 obj1=new constructor1(9);
        constructor1 obj2=new constructor1();
        constructor1 obj3=new constructor1("java", 10);
        constructor1 obj4=new constructor1(10,"program");



    }
    }


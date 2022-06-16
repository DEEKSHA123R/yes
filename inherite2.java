class  teacher{
    void specialization()
    {
        System.out.println("maths and statistics");

    }
}
class student1 extends teacher{
    void maths()
    {
        System.out.println("to learn maths");
    }
}

class student2 extends teacher{
    void statistics()
    {
        System.out.println("to learn statistics");

    }
}

public class inherite2 {
public static void main(String[] args) {
    student2 s2 = new student2();
    s2.statistics();
    s2.specialization();;
    student1 s1=new student1();
    s1.maths();
    s1.specialization();
}

}

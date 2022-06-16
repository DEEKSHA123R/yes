class twowheeler
{
    void latest()
    {
        System.out.println("latest models");
    }
}
class bike  extends twowheeler{
    void ride()
    {
        System.out.println("exclusive bike");
    }
}
class honda extends bike
{
    void milage()
    {
        System.out.println("honda speed byk");
    }
}

public class inherite1 {
public static void main(String[] args)
{
    honda bike1=new honda();
    bike1.milage();
    bike1.ride();
    bike1.latest();

}
}

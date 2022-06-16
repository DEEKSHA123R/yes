
class bus
{
    void newone()
    {
        System.out.println("newone models");
    }
}
class cycle extends bus{
    void oldone()
    {
        System.out.println("oldone bike");
    }
}
class rwd extends cycle
{
    void middle()
    {
        System.out.println("rwd one");
    }
}

public class inhrt1 {
    public static void main(String[] args)
    {
        rwd cycle1=new rwd();
        cycle1.middle();
        cycle1.oldone();
        cycle1.newone();

    }
}

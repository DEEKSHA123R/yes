abstract class language
{
    abstract void display();
    public void java()
    {
        System.out.println("programing language");
    }
}
class python extends language{
    void display()
    {
        System.out.println("py is also programing language");
    }
}
class c extends language
{
    void display()
    {
        System.out.println("proframing language c");
    }
}
class abst {
public static void main(String[] args)
{
    python obj1=new python();
    obj1.display();
    obj1.java();
    c obj2=new c();
    obj2.display();
    obj2.java();
}



}


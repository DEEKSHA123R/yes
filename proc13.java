public class proc13 {
    int empid;
    String empname;
    double empsalary;
    static String company="ITC";

    proc13(int empid,String empname,double empsalary)
    {
        this.empid=empid;
        this.empname=empname;
        this.empsalary=empsalary;

    }
    void display() {
        System.out.println(empid + "" + empname+""+empsalary+company);
    }
    static  void abc()
    {
        company="tcs";
    }
    public static void main(String args[])
    {
proc13 obj1=new proc13(12,"deeksha",8000);
proc13 obj2=new proc13(13,"raja",9000);
proc13 obj3=new proc13(34,"ramya",8999);
/*proc13.company="hcl";*/
        proc13.abc();
obj1.display();
    }

}

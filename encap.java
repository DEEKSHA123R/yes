package encapsulation;
class employee {
  private String empname,empdept;
  private int id;
  public int getId()
  {
      return id;
  }
  public void setId(int id)
  {
      this.id=id;

  }
  public String getEmpname()
  {
      return empname;
  }
  public void setEmpname(String empname)
  {
      this.empname=empname;
  }
  public  String getEmpdept()
  {
      return empdept;

  }
  public void setEmpdept(String empdept)
  {
      this.empdept=empdept;
  }
}
public class encap {
    public static void main(String args[])
    {
        employee obj1=new employee();
        obj1.setEmpname("deeksha");
        obj1.setId(78);
        obj1.setEmpdept("testing");
        System.out.println(obj1.getEmpname());
        System.out.println(obj1.getId());
        System.out.println(obj1.getEmpdept());
    }
}

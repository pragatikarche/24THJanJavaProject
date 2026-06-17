package methodStudy;
public class StudntInfo
{
    public static void main(String[] args)
    {
        StudntInfo studntInfo=new StudntInfo(); studentinfo("Mrunalini",2,'B',89.89f,true);
        studntInfo.studentinfo();
        studentinfo("Mrunalini",2,'B',89.89f,true);
        studentinfo("Kajal",3,'C',99.89f,true);
    }
        public void studentinfo()
        {
            //student info string name,int rollno,char div,float mark,boolean result;
            String name = "Pragati";
            int rollNo = 1;
            char div = 'A';
            Float mark = 88.88f;
            boolean result = true;
            System.out.println("***************************");
            System.out.println("My  Name is =" + name);
            System.out.println("My rollno is=" + rollNo);
            System.out.println("My Division is =" + div);
            System.out.println("My Marks=" + mark);
            System.out.println("my Result is=" + result);
        }

        public static void studentinfo(String name,int rollNo,char div,Float mark,boolean result)
        {
            System.out.println("***************************");
            System.out.println("My  Name is =" + name);
            System.out.println("My rollno is=" + rollNo);
            System.out.println("My Division is =" + div);
            System.out.println("My Marks=" + mark);
            System.out.println("my Result is=" + result);

        }



}

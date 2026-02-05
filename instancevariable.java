public class instancevariable 
{
    public String name;
    public int rollNumber;
    public double gpa;
    public instancevariable(String name, int rollNumber, double gpa) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
    }
    public static void main(String[] args) 
    {
        instancevariable student1 = new instancevariable("Alice", 101, 3.8);
        instancevariable student2 = new instancevariable("Bob", 102, 3.5);
        System.out.println(student1.name + ", Roll: " + student1.rollNumber);
        System.out.println(student2.name + ", Roll: " + student2.rollNumber);
    }
}

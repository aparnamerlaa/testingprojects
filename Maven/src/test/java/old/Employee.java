package old;

public class Employee 
{
String Employeename;
int Employeeid;
Car car;
Employee(String Employeename,int Employeeid,Car car)
{
this.Employeename=Employeename;
this.Employeeid=Employeeid;
this.car=car;
}
void display()
{
	System.out.println(Employeename+""+Employeeid+""+car);
	System.out.println(Car.colour+""+Car.name+""+car.regno);
}
}

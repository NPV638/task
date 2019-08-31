import java.util.*;
class Employee
	{	
	int age;
	int salary;
	String name;
	}
public class EmployeeList
	{
	static final String alphabets = "AbcDefGhiJklMnoPqrStuVwxYz";
	public static void main(String[] args)
	{
	System.out.println("****** EMPLOYEE LIST ******");
	System.out.println();
	final int MAX = 100;
	Employee[] employeeArray=new Employee[MAX];
	for(int i=0;i<MAX;i++)
		{
		employeeArray[i]=new Employee();
		employeeArray[i].name = randomString(3);
		employeeArray[i].age= randomInt(21,60);
		employeeArray[i].salary= randomInt(1000,4000);
		}
	for(int i=0;i<MAX;i++)
		{
		System.out.println("Name:  "+employeeArray[i].name+"  Age:  "+employeeArray[i].age+"  salary:  "+employeeArray[i].salary);
		System.out.println();
		}
		System.out.println();
		System.out.println("****** SALARY GREATER THAN 3000 EMPLOYEES ******");
		System.out.println();
		int count=0;
		int tot=0;
		int mean;
	for(int i=0;i<MAX;i++)
		{
			if(employeeArray[i].salary>3000)
			{
			count=count+1;
			tot=tot+employeeArray[i].age;
			System.out.println("Name:  "+employeeArray[i].name+"  Age:  "+employeeArray[i].age+"  salary:  "+employeeArray[i].salary);
			System.out.println();
			}
		}
		mean=tot/count;
		System.out.println();
		System.out.println("********AVERAGE OF EMPLOYEE AGE:"+mean+" ******");
		}
public static int randomInt(int min,int max) 
	{
	Random rand = new Random();
	int randomNum = rand.nextInt((max - min) + 1) + min;
	return randomNum;
	}
public static String randomString(int len)
	{
	Random rand = new Random();
	StringBuilder word = new StringBuilder(len);
	for(int i= 0;i<len;i++)
	{
	word.append(alphabets.charAt(rand.nextInt(alphabets.length())));
	}
	return word.toString();
}
}

package HackerBlocks.OOPS;

public class Student {

	//data members
	String name ="ABC";
	int age =10;
	
	//default constructor
	public Student(){
		
	}
	
	//parameterized constructor
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Student(String name,int age,int rollno) {
		this.age=age;
		this.name=name;
	}
	
	public void introduceYourself() {
		System.out.println(name+" is "+age+" years old.");
	}
	
	public void sayHi(String name) {
		System.out.println(this.name+" says hi to "+name);
	}
	
}

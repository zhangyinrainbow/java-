class RenMin{
	private int age;
	private String name;
	protected String a="jiuburangnikan";
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
}

class Student extends RenMin{
	private int score;
	public void Number(){
		System.out.println("Number");
	}
	public void setScore(int score){
		this.score=score;
	}
	public int getScore(){
		return this.score;
	}
	public void setA(){
		System.out.println("hello"+a);
	}
	public void setB(){
		System.out.println("hello"+super.a);
	}
	public void setC(){
		System.out.println("hello"+this.a);
	}
}

public class JiCheng{
	public static void main(String[] args){
		RenMin remmin=new RenMin();
		remmin.setAge(18);
		remmin.setName("jiajia");
		System.out.println(remmin.getAge());
		System.out.println(remmin.getName());
		Student student=new Student();
		student.Number();
		student.setScore(99);
		System.out.println(student.getScore());
		student.setAge(77);
		student.setName("xuesheng");
		System.out.println(student.getAge());
		System.out.println(student.getName());
		student.setA();
		student.setB();
		student.setC();
	}
}
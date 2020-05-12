public class Lei{
	public static void main(String[] args){
		Person xiaomi=new Person();
		xiaomi.setName("xiaomi");
		xiaomi.setAge(18);
		System.out.println(xiaomi.getAge());
		System.out.println(xiaomi.getName());
	}
}

class Person{
	private int age;
	private String name;
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
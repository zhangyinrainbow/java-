public class GouZaoFangFaOne{
	public static void main(String[] args){
		PersonOne one=new PersonOne("one",18);
		System.out.println(one.getAge());
		System.out.println(one.getName());
	}
}

class PersonOne{
	private String name;
	private int age;
	
	public PersonOne(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}
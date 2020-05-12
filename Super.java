public class Super{
	public static void main(String[] args){
		A a=new A("zhangyin",18);
		B b=new B("wangwei",40,0);
		A c=new B("fengzy",30,7);
		B d=new A("sunge",40);
	}
}

class A{
	protected String name;
	protected int age;
	public A(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class B extends A{
	protected int score;
	public B(String name,int age,int score){
		super(name,age);
		this.score=score;
	}
}
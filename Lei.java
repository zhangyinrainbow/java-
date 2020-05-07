public class Lei{
	public static void main(String[] args){
		Person xiaoming=new Person();
		xiaoming.SetAge(18);
		xiaoming.SetName("xiaoming");
		String name1=xiaoming.GetName();
		int age1=xiaoming.GetAge();
		System.out.println(name1+"hello"+age1);
	}
}
class Person{
		private String name;
		private int age;
		public void SetAge(int age){
			this.age=age;
		}
		public void SetName(String name){
			this.name=name;
		}
		public int GetAge(){
			return this.age;
		}
		public String GetName(){
			return this.name;
		}
	}


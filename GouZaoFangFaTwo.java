public class GouZaoFangFaTwo {
    public static void main(String[] args) {
        PersonTwo p = new PersonTwo("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
		PersonTwo s=new PersonTwo();		
    }
}

class PersonTwo {
    private String name;
    private int age;

    public PersonTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }
	public PersonTwo(){
		
	}
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

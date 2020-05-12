public class GouZaoFangFaThree {
    public static void main(String[] args) {
        PersonThree three = new PersonThree("lisi",20);
        System.out.println(three.getName());
        System.out.println(three.getAge());
    }
}

class PersonThree {
    private String name="zhangsan";
    private int age=19;

    public PersonThree(String name,int age) {
		this.name=name;
		this.age=age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

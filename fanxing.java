import java.util.Arrays;
public class fanxing{
	public static void main(String[] args){
/* 		ArrayList<String> x=new ArrayList<String>();
		ArrayList<String> y=new ArrayList<>(); */
		String[] ss=new String[] {"e","b","c"};
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
	}
}


/* class Person implements Comparable<Person> {
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return this.name + "," + this.score;
    }
}
 */
public class MeiJu{
	public static void main(String[] args){
		Weekday day=Weekday.one;
		if(day==Weekday.eight||day==Weekday.six){
			System.out.println("jiner zhoumo");
		}else{
			System.out.println("jiner dei shangban");
		}
		if(day==Weekday.one){
			System.out.println("==dui bi shi ok de ");
		}
		if(day.equals(Weekday.one)){
			System.out.println("equals ye shi ke yi de ");
		}
	}
}

enum Weekday {
	one,two,three,four,five,six,eight
}


//没有学完，但是差不多也够了

// 使用enum定义的枚举类是一种引用类型。前面我们讲到，引用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象。因此，引用类型比较，要始终使用equals()方法，但enum类型可以例外。

// 这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较

// 通过enum定义的枚举类，和其他的class有什么区别？

// 答案是没有任何区别。enum定义的类型就是class，只不过它有以下几个特点：

// 定义的enum类型总是继承自java.lang.Enum，且无法被继承；
// 只能定义出enum的实例，而无法通过new操作符创建enum的实例；
// 定义的每个实例都是引用类型的唯一实例；
// 可以将enum类型用于switch语句。
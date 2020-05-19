public class ZiFuChuan{
	public static void main(String[] args){
		String a="zhangyin";
		String b="zhangyin";
		if(a==b){
			System.out.println("==xiangdeng");
		}else{
			System.out.println("==buxiangdeng");
		}
		if(a.equals(b)){
			System.out.println("equalsxiangdeng");
		}else{
			System.out.println("equalsbuxiangdeng");
		}
		String c="wangweei";
		String d="WANGWEEI";
		System.out.println(c.equals(d));
		System.out.println(c.equalsIgnoreCase(d));
		System.out.println(c.contains("wangwe"));
		System.out.println(c.startsWith("wangwe"));
		System.out.println(c.endsWith("eei"));
		System.out.println(c.indexOf("e"));
		System.out.println(c.lastIndexOf("e"));
		System.out.println(c.substring(2,4));
		String e="  \tHello\r\n ";
		System.out.println(e.trim());
/* 		String f="A,B,C,D";
		System.out.println(f.split("\\,")); */
		String [] arr={"A","B","C"};
		System.out.println(String.join("$$$$",arr));
/* 		String h="Hi %s ,your age is %d!";
		System.out.println(h.formatted("zhangyin",18)); */
		String mm="Hi %s ,your age is %d!";
		System.out.println(String.format(mm,"fengzy",44));
		String z="";
		String zz=" ";
		String zzz=" \n";
		System.out.println(z.isEmpty());
		System.out.println(zz.isEmpty());
/* 		System.out.println(z.isBlank());
		System.out.println(zz.isBlank());
		System.out.println(zzz.isBlank()); */
	}
}

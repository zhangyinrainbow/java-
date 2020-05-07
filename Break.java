public class Break{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			System.out.println("zheshi"+i);
			for(int j=1;j<=10;j++){
				if(j==5){
					System.out.println("continue");
					continue;
				}
				System.out.println(j);
			}

		}
	}
}
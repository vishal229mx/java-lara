@FunctionalInterface  //explicitely we are providing this annotation for only for the interface which are one method interface
interface A
{
	int test(int i, int j);
} 
class M10
{
	public static void main(String[] args) 
	{
		A a2 = (x,y) -> {
			              System.out.println("from test"); 
			              return x + y;
		                 };
		int i = a2.test(10,20);
		System.out.println(i);
	}
}
//this is build in annotation for the single method interfaces
//by annotation we can provide a description 
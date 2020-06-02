package pack1;
class  A
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
	}
}
//by default every assert stmts is disable--even thought assert got false
//by default assert stmt is not executing

//in order to enable we req -en stmt ex.---((((E:\lara\assertions\src>java -cp ../classes -ea pack1.A))))

//we can also handle this exception bcoz assertion error is also a type of throwable
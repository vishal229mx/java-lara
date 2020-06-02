interface A
{
	int i;//every attibute interface attribute should be initialized 
	      //we can initialize value in SIB in other classes bt interface dont allows SIBs
}
class Z5 
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}


/*

Z5.java:3: error: = expected
        int i;
             ^
1 error
*/
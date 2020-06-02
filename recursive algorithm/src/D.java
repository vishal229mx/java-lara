class D 
{
	static void test(int i)
	{
		System.out.println("test begin:" + i);
		if (i == 4)
		{
		    return;	
		}
		i++;
		test(i);
		System.out.println("test end:" + i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(1);
		System.out.println("main end");
	}
}
//same method invocation/ execution is recursion
//we cannot execution without a return stmt into a pre ... without that infinite execution and stack overflow error 
/* pre execution of recursion--->> (while going forward)we can have any no. of content 
       System.out.println("test begin:" + i);
		if (i == 4)
		{
		    return;	
		}
		i++;
*/

/*post execution of recursion ---> (while coming backward)we can have any no. of content
   System.out.println("test end:" + i);
*/


//loops means reusability limited to one method
//recursion means reusability for all one method
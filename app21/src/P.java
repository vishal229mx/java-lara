class  P
{
	P(int i)
	{
		System.out.println("P(int)");
	}
	P()
	{
		this(90);                   //this() = calling stmt
		System.out.println("P()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P obj1 = new P();
        System.out.println("---------");
        P obj2 = new P(10);
        System.out.println("main end");
    }
}
//this. = reference stmt

 
 //we can use one obj for one constructor if we want multiple we use "this" stmt 
 //"this" stmt should be first stmt in the class its mandatory
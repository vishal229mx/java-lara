class A 
{
	final A()//constructor cannot be final,static,abstract 
	{
	}
}
class M6
{
	public static void main(String[] args) 
	{
      System.out.println("done");
	}
}
//here constructors are not inheriting to sub class so no need to declare constructor as a final


/*


M6.java:3: error: modifier final not allowed here
        final A()
              ^
1 error
*/
class A
{
	int i;
	public String toString()
	{
		return "i = " + i;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1);
	}
}
//overrided toString method 
//inside the string incorporating i value
//while printing a1 always looking for toString mehtod bt we overrided 
//in any entity class override toString method to print state of object rather memory add.


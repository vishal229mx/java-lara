class A
{
}
class  M1                                                                                                                                                                                                                                                                                                                                                                                                                                      
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		Class c1 = a1.getClass();
		Class c2 = a2.getClass();
		Class c3 = a3.getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}
//by calling getClass() method returns class object
//getClass() avalilable in java.lang package
//getClass() returns referance of class object
//there is a class "Class" is also a class in java.lang package ..  

//when A loading to the memory one Class object is created
//for every class .. one Class object

//c1,c2,c3 pointing to same object







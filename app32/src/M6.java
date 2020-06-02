class  A
{
	public static void test()
	{
		System.out.println("from A.test()");
	}
}
class B extends A
{
	public static void test()//static is not object oriented and polymorphism is a feature of oops..we cannot use static with polymorphism
	{
		System.out.println("from B.test()");//eventhough A is acting as B bt A is not acting as A 
	}
}
class M6
{
   public static void main(String[] args) 
	{
	   A a1 = new A();
	   A a2 = new B();
	   A[] elements = {a1, a2};
	   for(A element : elements)//this element becoming A.test bcoz of static method
	   {
	        element.test();  // A.test(); //we are not getting polymorphism here bcoz of static mehtod
       }
	 }
}
//static---->> no polymorphism
   //we are not able to achieve polymorphism through a static members
   //static members are not involving in the polymorphism

   //static members are class members --->> test mehthod of class A is always local to class A
                                            //they only belonging to one class only.
	//even though it is inheriting to B acting as a class A member only
	//bcoz of not inheriting ... over riding is not happening here
	//static membres cannot be over rided .. only we can incorporate new members in class B

//static means one time development.. not going to change further
//we cannot modify static method once developed

class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A()//A is act as super class name with no arg..this is knows as anonymous class //here we are designing a new class without a name
	    //this new class is specified as sub class to super class as A..for that sub clss test method is oveer riding
		//act as obj of sub class of A
		{
			void test1()
			{
                  System.out.println("AIC.test1()");
			}
		};
		a1.test1();
		a1.test2();
	}
}
//Anonymous-->> something without a name

//Anonymous inner class should be represent through super class name

/*      
this is act as anonymous sub class in the program

///this is completely new class as sub class to A that sub class has no name thats why it is considered as anonymouse local inner class
          A()
		{
			void test1()
			{
                  System.out.println("AIC.test1()");
			}
		}
*/
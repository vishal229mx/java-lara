class Test 
{
	public static void method1(Object obj) 
	{
		C c1 = (C) obj;//we cann supply any object is supply to mehtod 1 
		//this type of down casting is not advisable bcoz it may lead to clalss cast exception
		//mehtod1 arg is a obj type
		System.out.println("done");
	}
    public static void method2(Object obj) 
	{
		if(obj instanceof A)
		{
			A a1 = (A) obj;
			System.out.println("able to cast into A type");
		}
	    if(obj instanceof B)
		{
			B b1 = (B) obj;
			System.out.println("able to cast into B type");
		}
	    if(obj instanceof C)
		{
			C c1 = (C) obj;
			System.out.println("able to cast into C type");
		}
	    if(obj instanceof D)
		{
			D d1 = (D) obj;
			System.out.println("able to cast into D type");
		}
	    if(obj instanceof E)
		{
			E e1 = (E) obj;
			System.out.println("able to cast into E type");
		}
	}
}

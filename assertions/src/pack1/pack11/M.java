package pack1.pack11;
public class M 
{
	public static void test2() 
	{
		System.out.println("pack1.pack11.M.test2 begin");
		assert false;
		System.out.println("pack1.pack11.M.test2 end");
	}
}
//if we want to enable or disable any package on execution then we can supply diffent combinations show below
// in which -ea:___ shown which package have to be enable and -da:___ shown which class or package is disable
//we can enable particular class with -ea:packname.classname /...disable is same as this

/*
    1.E:\lara\assertions\src>java -cp ../classes -ea pack1.L 
	  //this is also enable only in class N
	  *******************************************************
      1
      Exception in thread "main" java.lang.AssertionError
           at pack1.L.main(L.java:10)
      *******************************************************
-----------------------------------------------------------------------------------------------------------------------------------------
	2.E:\lara\assertions\src>java -cp ../classes -ea:pack2... pack1.L 
	    //enable in pack2 and sub packages of pack2 (pack2.pack22) members
	  *******************************************************
		1
		2
		pack1.pack11.M.test2 begin
		pack1.pack11.M.test2 end
		3
		pack2.pack22.O.test4 begin
		Exception in thread "main" java.lang.AssertionError
				at pack2.pack22.O.test4(O.java:7)
  				at pack1.L.main(L.java:14)
       ******************************************************
------------------------------------------------------------------------------------------------------------------------------------------
	 3.E:\lara\assertions\src>java -cp ../classes -ea:pack2.N pack1.L  
	 //enable only in the N class
	 ********************************************************
		1
		2
		pack1.pack11.M.test2 begin
		pack1.pack11.M.test2 end
		3
		pack2.pack22.O.test4 begin
		pack2.pack22.O.test4 end
		4
		pack2.N.test3 begin
		Exception in thread "main" java.lang.AssertionError
				at pack2.N.test3(N.java:7)
				at pack1.L.main(L.java:16)
       ******************************************************
-------------------------------------------------------------------------------------------------------------------------------------------------
      4.E:\lara\assertions\src>java -cp ../classes -ea:pack1... pack1.L 
	   //enable in pack2 and subpackages of pack2 (pack2.pack22) members
	   ******************************************************
		1
		Exception in thread "main" java.lang.AssertionError
				at pack1.L.main(L.java:10)
      *******************************************************
------------------------------------------------------------------------------------------------------------------------------------------------------
	 5.E:\lara\assertions\src>java -cp ../classes -ea:pack1... -da:pack2.pack22.O pack1.L
	   //enable only in the N class
      *******************************************************
		1
		Exception in thread "main" java.lang.AssertionError
				at pack1.L.main(L.java:10)
      *******************************************************
--------------------------------------------------------------------------------------------------------------------------------------------------
*/
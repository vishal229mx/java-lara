class C3
{
   int test ()
  {
	   try
	   {
		  //several statements
		return 20; 
		}
		catch(ArithmeticException ex)
	  { 
			return 10;
	  }
	  finally
	  {
	  }
	  return 40;//never execute return 40;
	  }
}

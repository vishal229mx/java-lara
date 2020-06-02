class C4
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
		  return 40;
	  }
	  }
}

//try executes then return 20 bt at last finally executes and return 40
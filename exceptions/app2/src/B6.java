class B6
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
        return 30; 
	  }
	  return 40;//this is not executable
	  }
}

class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try                                //in try block any no or type of stmt like if block 
  		{                                  // in try block we can devp any type of abnormal condn stmt   
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch (ArithmeticException ex) //Throwable        //after try-catch block have one arg(datatype ref) 
		{                                                  //arg should be a throwable or sub clss of throwable 
			System.out.println(3);                        //catch body have any type and kind of stmt bt have only one  arg 
		}
        System.out.println("main end");
	}
}

//every exection and errors are the sub class of throwable class
//throwable is a super class of all errors and exceptions and its a pre defined class


//whenever execption is occured in the try block it directly executes the respected catch block
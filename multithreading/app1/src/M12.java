class M12
{
  public static void main(String[] args)
	{
	  Runnable r1 = () -> {
		                     for (int i = 0;i< 200 ;i++ )
							 {
								System.out.println(i);
							 }
	                      };
		Thread t1 = new Thread(r1);
		 t1.start();
         for (int i = 0; i < 200 ; i++)
		 {
			 System.out.println("main" + i);
		 }
	}
}
//runnable interface is a functional interface
//lambda expression is used for taking functional interface

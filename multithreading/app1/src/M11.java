class M11 //simpler than last
{
  public static void main(String[] args)
	{
		new Thread()
		{
			public void run()
			{
				for (int i=0; i < 200 ; i++ )
				{
					System.out.println("A:" + i);
				}
			}
		}.start();
		Thread t2 = new Thread(new Runnable()  //we can consider this as inline development
		{
			public void run()
			{
				for (int i = 0;i< 200 ;i++ )
				{
					System.out.println("B:" + i);
				}
			}
		});
		 t2.start();

         for (int i = 0; i < 200 ; i++)
		 {
			 System.out.println("main: " + i);
		 }
	}
}
			
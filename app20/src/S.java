class S
{
	int i;
	public static S test()    //S is a derieved data types... which returns s1 which is reference of S 
	{ 
		S s1 = new S();
		s1.i=10;
		System.out.println("test:" + s1.i);
		return s1;
		}

     public static void main(String[] args) 
	{ 
		 S obj = test();
        System.out.println("main:" + obj.i);
		}
}


class I
{
	static int i = test();//15
	static int j = test();//215
	static int k = test();//2975
	static
	{
	  System.out.println("SIB1:" + i +"," + j + "," + k);//412,958,2975
       i += i + j + k + 1;//4758
       j += i + j + k + 2;//9651
       k += i + j + k + 3;//20362
	}
	
	public static int test() 
	{
		System.out.println("test"+ i +"," + j + "," + k);//0,0,0 //15,3,7 //41,215,114
		i += i + j + k + 1;//1 //41 //412
        j += i + j + k + 2;//3 //56 //958
        k += i + j + k + 3;//7 //114 //1601
       return i+j+k+4;//15 //215 //2975
	}

    public static void main(String[] args) 
	{
		System.out.println("main" + i +"," + j + "," + k);
	}

	static
	{
	  System.out.println("SIB2"  + i +"," + j + "," + k); //4758,9651,20362
       i += i + j + k + 1;//
       j += i + j + k + 2;//
       k += i + j + k + 3;//
	}
}

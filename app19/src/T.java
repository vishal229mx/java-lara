class  T
{
     
     static int i=test1();  //6 
     static int j=test1();  //17
     static int k=test1();
	 
	 public static int test1() 
	{
		System.out.println("main:" +i + "," + j+ "," + k);//0,0,0 //6,2,3 //7,17,6
		i += 1;//1 //7 //8
		j += 2;//2 //4 //19
		k += 3;//3 //6 //9
		return i + j + k;//6 //17
	}

    public static void main(String[] args) 
	{
		System.out.println("main:" +i + "," + j+ "," + k);
	}
}
 


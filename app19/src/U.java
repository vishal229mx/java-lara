class  U
{
     
     static int i=test1();  //6 
     static int j= i + test1();  //23
     static int k= i + j + test1(); //72
	 
	 public static int test1() 
	{
		System.out.println("main:" +i + "," + j+ "," + k);//0,0,0 //6,2,3 //7,23,6 //8,25,72
		i += 1;//1 //7 //8
		j += 2;//2 //4 //25
		k += 3;//3 //6 //9
		return i + j + k;//6 //17 //44
	}

    public static void main(String[] args) 
	{
		System.out.println("main:" +i + "," + j+ "," + k);
	}
}
 


class C 
{    
	static int i = test1();//7
	static int j = test2();//104

	public static int test1() 
   	{    
		System.out.println("from test1:" + i + "," + j);//0,0//12,16//29,104//134,240//995,1613
		i+= j + 1;//1//29//134//375//2609
		j+= i + 2;//3//47//240//617//
		return i +j + 3;//7//76//377//995
	}
public static int test2() 
   	{    
		System.out.println("from test2:" + i + "," + j);//7,3//375,617
		i+= j + 2;//12//995
		j+= i + 1;//16//1613
		return i +j - 3 + test1();//104//
	}
public static void main(String[] args) 
   	{    
		System.out.println("from main:" + i + "," + j);//29,104
		System.out.println("-------------------------");
		System.out.println(test1());//377
		System.out.println("-------------------------");
		System.out.println(test1() + test2());995+
	     
	}
}

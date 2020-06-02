class A  //if A is public then file name should be A.java
{
	static int i;
}
 
 class B  //if B is public then file name should be B.java
 {
	public static void main(String[] args) 
	{
		System.out.println("main" + i);
	}
}
//if none is public then class name can be any class in both of them

//in 1 java file any no. of classes can be devp. maximum 1 class can be public and if no public we can save with any name 
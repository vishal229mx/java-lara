class Z13 
{
	public static void main(String[] args) 
	{
		String ja = "ja";
		String va = "va";
		String s1 ="java";
		String s2 =new String("java");
		String s3 =new String("java");
		String s4 = ja + va;
		//System.out.println(s4);
		String s5 = ja + "va";
		String s6 = "ja" + va;
		String s7 = "ja" + "va";  //here no refrence variable avilable
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s3);//false
		System.out.println(s1==s4);//false
		System.out.println(s1==s5);//false
		System.out.println(s1==s6);//false
		System.out.println(s1==s7);//true
        System.out.println("================");
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);//false
		System.out.println(s2==s5);//false
		System.out.println(s2==s6);//false
		System.out.println(s2==s7);//false
		System.out.println("================");
        System.out.println(s3==s4);//false
		System.out.println(s3==s5);//false
		System.out.println(s3==s6);//false
		System.out.println(s3==s7);//false
        System.out.println("================");
		System.out.println(s4==s5);//false
		System.out.println(s4==s6);//false
		System.out.println(s4==s7);//false
        System.out.println("================");
		System.out.println(s5==s6);//false
		System.out.println(s5==s7);//false
		System.out.println("================");
		System.out.println(s6==s7);//false
	}
}
/*
 s1 and s7 is pointing to same object all are pointing diffrent object.


 + operator using a new operator by using a string object created

+ operator using refrence either left operand and right operator using a new operator
*/
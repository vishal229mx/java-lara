class M14
{
	public static void main(String[] args) 
	{
		Integer obj = new Integer(90);   
		int i = obj;        // int i = obj.intValue(); //compiler unboxing and generating bytecode of this type of stmt
		System.out.println("done");
	}
}
//left side int and right side ref...this type of assignment not allowed before jdk1.4..
//it is allowed only 1.5 onward
//in jdk 1.5 a new concept introduced autoboxing and autounboxing

//here autouboxing is happening

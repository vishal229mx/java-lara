class F 
{
	public static void main(String[] args) //class not found exception
	{
		System.out.println(1);
		Class.forName("");  //mandatory to provide name under double quotes...thats why error occured 
		System.out.println(1);
	}
}

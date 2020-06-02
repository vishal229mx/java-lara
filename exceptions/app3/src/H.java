class H 
{
	public static void main(String[] args) throws ClassNotFoundException //throws only for the check to deligate/propogate the exception
	{
		System.out.println(1);//checked req trycatch and throws unchecked doesnt req
		Class.forName("");  
		System.out.println(1);
	}
}

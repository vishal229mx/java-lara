class M36 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		System.out.println(a1.i);
	}
}
//cmpiler will be checking what is a1...is checking test1 and i is there in A or not if it is there then compile succesful and both of them is loading in the obj
//runtime environment will be checking to where a1 is pointing


/*


from A.test1()
0
*/
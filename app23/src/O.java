class O 
{
	O()
	{
	    System.out.println("O()");
	}
     {
	    System.out.println("O-IIB");
	}
	public static void main(String[] args) 
	{   O o1 =new O();
		System.out.println("---------");
	    O o2 =new O();
	    System.out.println("---------");
	}
}
//if constructor body, there any kind of super,, then  IIB is incorporated with that block
/*...
1st super block
2nd IIB
3rd sop
*/
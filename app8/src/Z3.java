class Z3
{    
	enum Test {CON1,CON2, CON3,CON4};
	public static void main(String[] args) 
	{ 
		Test t1 =Test.CON1;
            switch(t1)
		{
			case CON5:
		     System.out.println("from CON5");
			break;
			case CON2:
		     System.out.println("from CON2");
			break;
			case CON4:
		     System.out.println("from CON1");
			break;
			}

	}
}

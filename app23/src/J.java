class I extends Object // this will be added by compiler when there is a class whitoud extends
{
	I()
	{
	   super();//---> this super calling object class is a super class to all classes
	   System.out.println("I()");
    }
}
class J extends I
{
	J()
	{
		//super();  --->is default constructor calling in J constructor body thats why J is able to inherit I
       System.out.println("J()");
    }

	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("----------");
		J j2 = new J();
	}
}

/*                                  //1.every constructor body, 1st should be either this(); calling stmt or super(); calling stmt..
   this();
   this(10);
   this(10,4.5);
   this(10,4.5,true);
   
   super();                         //2.super() is default stmt when calling to constructor...
   super(10);                       //bcoz when we dont provide this() or super() it provide super with no arg constructor-super();..  
   super(10,4.5);
   super(10,4.5,true);

                                     //3.every class should become a sub class to object class by compiler
									 //if there is an class without extends compiler will be incorporating to 'extends Object'see in line 1...
*/
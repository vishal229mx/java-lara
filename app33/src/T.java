class T 
{
	final int i;
	T()
	{
		i = 10;
	}
    T(int x)
	{
		this();
		i = 20;
	}
}

//if we are calling this() method we are calling both the constructor thats why cmpile time errror
/*



T.java:11: error: variable i might already have been assigned
                i = 20;
                ^
1 error

*/
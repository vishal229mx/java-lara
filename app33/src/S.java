class S 
{
	final int i;
	S()
	{
		i = 10;
	}
    S(int x)
	{
		i = 20;
	}
}

//here compilation is succes eventhough we are re initializing i value bcoz of 
//we can call only one constructor by one object 

//it is constant for a particular object bt not for entire exection 
//so if we are crating obects with 1st constructor then value is 10 and if we are creating obj with 2nd constructor then value is 20
//so the objects are  not consider as perfect constant object
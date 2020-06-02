class A 
{
	void test1()
	{
	}
	void test2() throws ClassNotFoundException// checked //we can override test2 by chosing only checked ex.i.e.->ClassNotFoundException or sub class to this checked only or by any unchecked this rule for all checked 
	{
	}
	void test3() throws NullPointerException //unckecked //we cant override test3 by chosing any checked ex..   
	{
	}
	void test4() throws CloneNotSupportedException //checked
	{
	}
	void test5() throws java.io.IOException //checked
	{
	}
	void test6() throws Exception //checked
	{
	}
}
//1.any method can over ride without a throws in sub class
//2.any method we can override in the sub class by choosing a throws-->unchecked
//for unchecked compiler is not worring about checking it

//3.throws keyword only for the checked still we want we can use with unchecked

//only checked--i.e.-->classnotfoundexception allows in sub clss or subclass of classnotfoundexceptinon only allows other than that no checked exc are allowed


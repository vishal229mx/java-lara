class V 
{
     void test()
	{
        System.out.println("V.test()");
	}
}
class W extends V//inside W class test mehtod got overloaded
{
    void test(int i)
	{
        System.out.println("W.test(int)");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		w1.test();
		w1.test(20);
	}
}
//inherited method can be overloaded to the incorporated method
//all overloaded mehtod can be one of the inherited mehod also
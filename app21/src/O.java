class  O
{
	O(int i)
	{
		System.out.println("O(int)");
	}
	O()
	{
		System.out.println("O()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O obj1 = new O();
        System.out.println("---------");
        O obj2 = new O(10);
        System.out.println("main end");
    }
}
//while object is creating only specified constuctor is executing
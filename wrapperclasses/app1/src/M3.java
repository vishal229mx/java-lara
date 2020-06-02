class M3
{
	public static void main(String[] args) 
	{
		Character obj1 = new Character('a');   
		Character obj2 = Character.valueOf('a'); 
		char c1 = obj1.charValue();   
		char c2 = obj2.charValue();   
		System.out.println("done");
	}
}
//for every primitive there is corresponding wrapper class
//in the collection api we cannot store primitive straight away ..... 
//for that first store primitive in the obj and then use it in the collection api

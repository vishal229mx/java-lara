interface F//interface is not by defalult public we have to explicitely specify interface as a public bt all members in interface is public
{
	int i = 10;//by default-->public,static and final  -----attibute of interface should be initilized bcoz every static and final member should be initilized

	void test1();//by default-->public,abstract //we dont define it private or protected in inrterface
}
//in the body of inrterface only declared/abstract mehtods are allowed
//every declared method or variable inside the interface is default abstract
//every member of the interface is public

//every member of interface should be public we dont require to specify public bcoz its default public...we cant explectly specify private and protected

//**but interface is not public itself**


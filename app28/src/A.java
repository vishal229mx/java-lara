class A 
{
	abstract  void test1();
	abstract  void test2();
	abstract  void test3();
	abstract  void test4();
}
//it is mandatory to have atleast one constructor in a class 
//if developer donot make then compiler by default make a no arg constructor as default constructor.

//constructor is always concrete
//you cannot make a constructor as a abstract.
//as a constructor cannot be inheriting to sub class.
//so a abstract constructor can never be called.

//even though class A have 4 abstract class but clss A is not 100% abstract bexause of the default concrete constructor
//because of the default concrete constructor.

//to achieve 100% abstract class we need to use interface
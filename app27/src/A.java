abstract class A 
{
    void test1()     //defined method or implementing method also treat as concrete mehtod__body may or maynot containing any stmt
	{

    }
	abstract void test2(); //unimplemented method or undefined method or declared methods--> dont have body,coz semi colon in end..
}
//unimplemented method or undefined method or declared methods---->> this method starts with abstract...
//if any mehtod ending with semicolon have no body it should be declared as abstract method..

//mehtod should have either body or abstract keyword... both not be possible
//if class containing minimum 1 abstract mehtod then it should be declared as abstract class

//for abstract class we cannot create an object...
//bt for abstract class we can create a reference variable
//we can use the abstract class whereever data type is required... for datatype purpose we can use abstract class

//we can develop abstract class as a member of java file...
//for every java file .class file is developed...
//for abstract class it also generate a .class file...
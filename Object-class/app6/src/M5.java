import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class A
{
	int i;
	double j;
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	void test1()
	{
		System.out.println("test1");
	}
    void test2()
	{
		System.out.println("test2");
	}
}
class  M5                                                                                                                                                                                                                                                                                                                                                        
{
	public static void main(String[] args) throws Exception 
	{
		Class c1 = Class.forName("A");
		Field[] fields = c1.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println( field + ":");
			System.out.println( field.getType());
		}
		System.out.println("----------");
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println( method + ":");
			System.out.println( method.getReturnType());
		}
		System.out.println("----------");
		Constructor[] constructors = c1.getDeclaredConstructors();
		for(Constructor constructor : constructors)
		{
			System.out.println( constructor);
		}
		System.out.println("----------");	
	}
}
//we are find out total fields methods and constructors through Class object
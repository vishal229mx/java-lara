class B 
{
	static byte i;
	static short j;
	static int k;
	static long l;
	static float m;
	static double n;
	static boolean o;
	static char p;
	static String q;

	public static void main(String[] args) 
	{
		System.out.println("byte:" + i);
		System.out.println("short:" + j);
		System.out.println("int:" + k);
		System.out.println("long:" + l);
		System.out.println("float:" + m);
		System.out.println("long:" + n);
		System.out.println("boolean:" + o);
		System.out.println("char:" + p);     //default value of char is one of unicode value '\u0000'
		System.out.println("String:" + q);   //for every derieved data type default value is null
	}
}
/*
byte:0
short:0
int:0
long:0
float:0.0
long:0.0
boolean:false
char:
String:null
*/
class A
{
	int i;
	int j;
	int k;
	A(int i,int j,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		int x = s1.hashCode();
		int y = s2.hashCode();
		int z = s3.hashCode();
		int hash = x + y + z;
		return hash;
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A(90,80,70);
		A a2 = new A(90,80,70);
		A a3 = a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}
//convert every attribute into string object then call the hashcode() then return...
//
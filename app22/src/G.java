class G
{
	static int counter;

	G()
	{
	 counter++;
	}

	G(int i)
	{
	 counter++;
	}
	G(int i, int j)
	{
	 counter++;
	}

	public static void main(String[] args) 
	{ 
	    G g1 = new G();
	    G g2 = new G(10);
	    G g3 = new G();
	    G g4 = new G(1,2);
	    G g5 = new G();
	    G g6 = new G(5);
	    System.out.println(G.counter);
	  }
}
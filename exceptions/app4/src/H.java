import java.io.Closeable;
class H implements Closeable//closable comes under functional interface
{
	public void close()
	{
		System.out.println("from close");
	}
}


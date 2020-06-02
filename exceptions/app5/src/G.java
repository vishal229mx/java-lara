class G 
{
	public static void main(String[] args) 
	{
		try
		{
		    //several stmts
		}
		catch (Throwable ex)
		{
		}
		catch (Exception ex)
		{
		}
	    catch (RuntimeException ex)
		{
		}
	    catch (ArithmeticException ex)
		{
		}
	}
}
//this is not the correct order to put exceptions from super to sub
//correct order is sub to super for cathing ex
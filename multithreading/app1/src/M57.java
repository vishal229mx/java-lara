class M57 
{
	public static void main(String[] args) 
	{
		Thread.State[] states = Thread.State.values();
		for (Thread.State state: states)
		{
			System.out.println(state);
		}
	}
}


/*
different states of thread life states

NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
*/
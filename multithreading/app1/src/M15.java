class M15
{
  public static void main(String[] args)
	{
	  Thread t1 = Thread.currentThread();
	  System.out.println("id" + t1.getId());
	  System.out.println("Name" + t1.getName());
	  System.out.println("daemon" + t1.isDaemon());
	  System.out.println("priority" + t1.getPriority());
	}
}

/*
Id-->>
  its a long type no.
  every thread having a unique id
  we cannot change id of a thread
*/


/*
Name-->>
for parent/main thread ..... its name is main
child threads -- >>   thread_0
                      thread_1
					  thread_2 etc.
     we can read name of the thread ... here return type of name of thread is string type
 There are two ways to modify name of a thread--
    1.through setName()
	2.through constructor
*/

/*
Daemon-->>
Every child thread in java by default a user thread thats why daemon is false
 but isDaemon() return type is boolean
 when we convert user thread into daemon thread then its value will be true
 => there is a way to convert user thread to daemon thrread is "through setDaemon()"
*/

/*
Priority-->
priority is a integer number between 1 to 10
min priority-1 and max priority-10,, 5- normal priority
we can modify the priority through "setPriority()"
default value of priority is 5 i.e. normal priority

*/


/*
OUTPUT

E:\lara\multithreading\app1\src>java -cp ../classes M15
id1
Namemain
daemonfalse
priority5
*/
class Job 
{
	String title;
	double salary;
	Job(String title, double salary)
	{
		this.title = title;
		this.salary = salary;
	}
}	
class Employee //through innerclasses we are achieving 100% encapsulation and code is fully organised
{
		String name;
		Job[] jobs;
		Employee(String name, Job[] jobs)
		{
			this.name = name;
			this.jobs = jobs;
		}
		Iterator getIterator()
	    {
			Iterator it = new Iterator(jobs);
			return it;
		}
	class Iterator //this inner class is the member of the employee
    {
		private Job[] jobs;
		private int index;
		Iterator(Job[] jobs)
		{
			this.jobs = jobs;
		}
		boolean hasNext()
		{
			return index < jobs.length;
		}
		Job nextJob()
		{
			return jobs[index++];
		}
     }//end of the iterator

}//end employee
class M5
{
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 25000);
		Job j3 = new Job("hr", 15000);
		Job[] jobs = {j1,j2,j3};
		Employee e1 = new Employee("Vijay", jobs);
		Job job;
		Employee.Iterator obj = e1.getIterator();
		while(obj.hasNext())
		{
			job = obj.nextJob();
		    System.out.println(job.title + ":" + job.salary);
		}
		System.out.println("------------");
		obj = e1.getIterator();
		while(obj.hasNext())
		{
			job = obj.nextJob();
			System.out.println(job.title + ":" + job.salary);
		}
         System.out.println("------------");
	}
}
//using multiple classes to achieve simple task
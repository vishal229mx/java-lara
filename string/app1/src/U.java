class U 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);//hello
		char[] chars = s1.toCharArray();
		for (int i=0 ;i<chars.length / 2 ;i++)
		{
			char temp = chars[i];
			chars[i] = chars[chars.length -1 - i];
			chars[chars.length -1 - i] = temp;
		}
		    s1 = new String(chars);
			System.out.println(s1); //olleh
		}
	}
//reversing string content first charecter swapining with the last char

//reversing string content
package com.lara;

import java.io.Serializable;

public class D extends C implements Serializable
{
   int l;
   D()
   {
	   System.out.println("D()");
   }
}
//deserilization it is checking what is the serilizable
package com.lara;

import java.io.Serializable;
class Address implements Serializable
{
	String streetName;
}

public class Person implements Serializable
{

	 int age;  //transient int age;
	 double weight;  
	Address address;
}
//static double weight;   static memeber are not a part of object this type of member not serilizable
//serilizable and clonable both are marker interface
//we are serilazable in person object 
//every warper class also serilazible implements
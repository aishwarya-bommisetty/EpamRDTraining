package com.foo;
import java.util.*;
public class Set <T extends Comparable<T>> 
{
    MyLinkedList<T> collection;
   
   public Set()
   {
      collection=new MyLinkedList<T>();
   }
   public Set(Collection<? extends T> input)
   {
     collection=new MyLinkedList<T>();
     for(T element:input)
     {
        collection.add(element);
     }
   }
	void Add(T element)
	{

      collection.add(element);
	}
	void RemoveAt(int i)
	{
      collection.removeAt(i);
	}
	public void PrintSet()
	{
		for(T element:collection)
		{System.out.println(element);}
	}
	String Find(T element)
	{
		for(T item:collection)
		{
			if(item.equals(element))
			{
				return "found";
			}
		}
		return "not found";
	}
	
	
	boolean Find(Finder<T> find)
	{
		for(T obj:collection)
		{
		if(find.check(obj)==true)
		{
			return true;
		}
		}
		return false;
		
	}
	
	void Remove(Finder<T> find)
	{
		int count=0;
		for(T obj:collection)
		{
			
			if(find.check(obj)==true)
			{
				collection.removeAt(count);		
			    break;	
			}
			count++;
		}
	}
	
	void Sort()
	{
		collection.sort();
	}
	
	T Indexer(int i)
	{
      return collection.get(i);
	}
	
	public String toString()
	{
		return collection.toString();
	}
   
	//MyLinkedList<T> 

} 
package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMostRepeatedWord {
	public static void main(String args[])
	{
		String banned[]= {"hi","hello","what"};
		String para="Hi, my name is Mahima. Hi, What is your name? ";
		FindMostRepeatedWord obj=new FindMostRepeatedWord();
		obj.findRepeatedWord(para,banned);
	}

	public void findRepeatedWord(String para,String banned[])
	{
		Set<String> banSet = new HashSet<String>();
		Map<String,Integer> wordMap=new HashMap<String,Integer>();
		for(int i=0;i<banned.length;i++)
			banSet.add(banned[i]);

		String para1[]=para.split("[^a-zA-Z]+");


		for(int i=0;i<para1.length;i++)
		{
			para1[i]=para1[i].toLowerCase();
			System.out.println(para1[i]);
			if(!banSet.contains(para1[i]))
			{
				if(wordMap.containsKey(para1[i]))
				{
					int count=wordMap.get(para1[i]);
					count=count+1;
					wordMap.put(para1[i], count);
				}
				else
					wordMap.put(para1[i], 1); // Found it once
			}
			else 
				System.out.println("Heya!"+para1[i]);
		}
		int maximum=-1;
		String repeatedWord=new String();
		for(int i=0;i<para1.length;i++)
		{
			if(wordMap.containsKey(para1[i]))
			{	
				int count=wordMap.get(para1[i]);
				if(count>maximum)
				{
					repeatedWord=para1[i];
					maximum=count;
				}
			}

		}			System.out.println("Repeated word is :" + repeatedWord);

	}


}

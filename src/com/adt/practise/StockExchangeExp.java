package com.adt.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class StockMarket{
	
	private int bayday;   //buyday
	private int sellday;
	private int profit;
	
	public int getBayday() {
		return bayday;
	}
	public void setBayday(int bayday) {
		this.bayday = bayday;
	}
	public int getSellday() {
		return sellday;
	}
	public void setSellday(int sellday) {
		this.sellday = sellday;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return "StockMarket [bayday=" + bayday + ", sellday=" + sellday + ", profit=" + profit + "]";
	}
}


public class StockExchangeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,3,5,0,0,3,1,4}; //6
//		int arr[]= {1,2,3,4,5}; //4
//		int arr[]= {3,3,5,9,0,3,1,4}; //10
		
		List<StockMarket> list=new ArrayList<>();
		
		for(int i=0;i<arr.length-1;i++) 
		{
			int bay=arr[i];
			int max=0;
			int index=-1;
			boolean f=false;
			StockMarket obj=new StockMarket();
			
			for(int j=i+1;j<arr.length;j++) 
			{
				int profit=arr[j]-bay;
				if(profit>max)
				{
					max=profit;
					
					obj.setBayday(i+1);
					obj.setProfit(max);
					index=j;
					f=true;
				}
			}
			if(f)
				obj.setSellday(index+1);
			
			list.add(obj);
		}
		
		list.stream().forEach(System.out::println);
		
//		int max=0;
		int funalmax=0;
		
		for(int i=0;i<list.size();i++) 
		{
			StockMarket s= list.get(i);
			int max=s.getProfit();
			for(int j=s.getSellday();j<list.size();j++)
			{
				max=Math.max(s.getProfit()+list.get(j).getProfit(),max);
			}
			funalmax=Math.max(funalmax, max);
		}
		System.out.println(funalmax);
	}
	
			}


//int[] price= {3,3,5,0,0,3,1,4};
//int sell=0;
////int buy=0;
//
//for(int i=0;i<price.length;i++)
//{
//	for(int j=i+1;j<price.length;j++)
//	{
//		if(price[i]<price[j])
//		{			
//			
//		sell= price[j] - price[i];
//			
//		}	
//		else if(price[i]>price[j])
//		{
//			sell=price[i]=price[j];
//		}
//		else
//		{
//			price[i]=price[i+1];
//		}
// System.out.print(sell);
//sell=price[j];
//buy=price[j];
//price[j]=price[i];				
//price[i]=buy;
//for(int i=0;i<price.length;i++)
//{
//	if(price[i]<price[i+1])
//	{
//		sell= price[i+1]-price[i];
//		System.out.print(sell);
//	}
//}

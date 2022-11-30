package my.predicate.bi.predicate.three;

import java.util.function.BiPredicate;

public class BiPrediacteMain 
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer> bipi = (i,j) -> i+j>=100;
		System.out.println(bipi.test(12, 111));
		
		
	}

}

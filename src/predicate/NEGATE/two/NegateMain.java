package predicate.NEGATE.two;

import java.util.function.Predicate;

public class NegateMain
{
	public static boolean isNotEven(Predicate<Integer> predicate,Integer i)
	{
		return predicate.negate().test(i);
	}
	
	public static void main(String[] args)
	{
		Predicate<Integer> predicate = (i) -> i%2==0;
		boolean status = isNotEven(predicate, 22);
		System.out.println("is it odd :>> "+ status);
	}


}

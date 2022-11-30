package predicate.NEGATE.two;

import java.util.function.Predicate;

public class MainSimple1 //Not an example for negate.Just showing by taking Predicate as method parameter
{
	public static  boolean isEven(Predicate<Integer> predicate,Integer i)
	{
		return predicate.test(i);
	}
	
	
	public static void main(String[] args)
	{
		Predicate<Integer> predicate = (i) -> i%2==0;
		boolean status = isEven(predicate, 22);
		System.out.println("is it even on not :>> "+ status);
	}

}

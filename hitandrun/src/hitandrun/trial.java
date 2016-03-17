package hitandrun;

import java.util.Random;

public class trial {
	
	public final static String createRandomNumber(long len) 
	{
    if (len > 18)
        throw new IllegalStateException("To many digits");
    long tLen = (long) Math.pow(10, len - 1) * 9;

    long number = (long) (Math.random() * tLen) + (long) Math.pow(10, len - 1) * 1;

    String tVal = number + "";
    if (tVal.length() != len) {
        throw new IllegalStateException("The random number '" + tVal + "' is not '" + len + "' digits");
    }
    return tVal;
	}
	public static void main(String args)
	{
		System.out.println("Num is"+createRandomNumber(5));
	}

}

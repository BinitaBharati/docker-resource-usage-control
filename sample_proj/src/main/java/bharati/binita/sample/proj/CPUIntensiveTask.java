package bharati.binita.sample.proj;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 * @author binita.bharati@gmail.com
 *
 */
public class CPUIntensiveTask {
	
	public static void main(String[] args) {
		BigInteger result = new BigInteger("1");
		int input = 1000000;
		long startMillis = System.currentTimeMillis();
		for (int i = 1 ; i <= input ; i++ ) {
			result = result.multiply(new BigInteger(i + ""));
			
		}
		long endMillis = System.currentTimeMillis();
		long tt = (endMillis - startMillis)/(1000 * 60);
		System.out.println("Total time taken = "+tt + " minutes");
		System.out.println("result111 = "+result);
		
	}

}

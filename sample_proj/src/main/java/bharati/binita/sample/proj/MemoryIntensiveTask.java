package bharati.binita.sample.proj;

import java.util.UUID;

/**
 * 
 * @author binita.bharati@gmail.com
 *
 */
public class MemoryIntensiveTask 
{
    public static void main( String[] args )
    {
    	int concatCount=Integer.parseInt(args[0]);
    	String s1 = "START-OF-INFINITELY-CONCATANATED-STRING";
        for(int i = 0 ; i < concatCount; i++) {
        	s1 = s1 + s1 + s1 + s1 + s1 + UUID.randomUUID().toString();
        }
        System.out.println("DONE HERE");
    }
}


/**
 * The <code>Ali</code> class represents basic mathematical function.
 * All functions have an algorithm which
 * are implemented as methods of this class.
 * @author Ali - 14SW17
 * @since JDK1.8
 */

 public class Ali{
	public static double sum(double n1, double n2) {
		/** These values are used for variable storage. */
	      double sum;
	       /**
	           * Provides the sum of both given values.
	           * The values are provided in the arguments.
	           * Both params are added to obatian the result.
	           * Double value would be return in the output which will carry the sum of both arguments.
	           * @since return type is of type double so decimal values can be returned in the output.
	           * @param      n1     The first value to put into the method.
	           * @param      n2     The second value to put into the method.
    		 */
	      sum = n1+n2;

	      return sum;
	 }

	 public static int product(int n1, int n2) {
	 	/** These values are used for variable storage. */
	  	      int product;
	  	       /**
	  	           * Provides the product of both given values.
	  	           * The values are provided in the arguments.
	  	           * Both params are added to obatian the result.
	  	           * An int value would be return in the output which will carry the product of both arguments.
	  	           * @since return type is of type int so no decimal valsues can be returned in the output.
	  	           * @param      n1     The first value to put into the method.
	  	           * @param      n2     The second value to put into the method.
	      		 */
	  	      product = n1*n2;

	  	      return product;
	  }
}
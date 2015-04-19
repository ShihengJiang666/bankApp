
public class BadTransactionException extends Exception{
	public int val;
	 public BadTransactionException(int badTransactionNumber) {
		    super("Invalid account number: " + badTransactionNumber);

		    val = badTransactionNumber;
		  }

}

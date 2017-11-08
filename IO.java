I/**
 * IO handles all input and output for the
 * four-square encryption algorithm
 *
 * <Add remaining required documentation here>
 */

import java.util.*;

public class IO {
	private Scanner s;

	/**
	 * IO sets up a new Scanner to System.in
	 */
	public IO() {
		s = new Scanner(System.in);
	}

	/**
	 * firstKey returns the first key from the user
	 *
	 * @return The first key from the user
	 */
	public String firstKey() {
		//COMPLETE THIS TO GET THE FIRST KEY

		//UPDATE THIS LINE WHEN DONE
		return "";
	} // end firstKey


	/**
	 * secondKey returns the second key from the user
	 *
	 * @return The second key from the user
	 */
	public String secondKey() {
		//COMPLETE THIS TO GET THE SECOND KEY

		//UPDATE THIS LINE WHEN DONE
		return "";
	} // end secondKey

	/**
	 * gets and returns whether the user wants to encrypt or decrypt
	 *
	 * @return 'e' for encryption, and 'd' for decryption
	 */
	public char encryptOrDecrypt() {
		//COMPLETE THIS TO GET THE ENCRYPT OR DECRYPT OPTION

		//UPDATE THIS LINE WHEN DONE
		return ' ';

	} // end encryptOrDecrypt

	/**
	 * message returns the message from the user
	 *
	 * @param encrypt True if encrypting, false if decrypting
	 *
	 * @return The message from the user
	 */
	public String message(boolean encrypt) {
		//COMPLETE THIS TO GET THE MESSAGE

		//UPDATE THIS LINE WHEN DONE
		return "";
	} // end message

	/**
	 * printResults prints the encrypted and decrypted messages
	 *
	 * @param msg The resulting message
	 * @param encrypt True if encrypting, false if decrypting
	 */
	public void printResults(String msg, boolean encrypt) {
		//COMPLETE THIS TO PRINT THE RESULTS
	} // end printResults

	/*
	 * printError prints an error message
	 *
	 * @param err The error message to print
	 */
	public void printError(String err) {
		//COMPLETE THIS TO PRINT THE ERROR MESSAGE
	} // end printError

} // end class
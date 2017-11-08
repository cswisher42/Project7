/**
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
		System.out.print("Enter the first key: ");
		return s.nextLine();
	} // end firstKey


	/**
	 * secondKey returns the second key from the user
	 *
	 * @return The second key from the user
	 */
	public String secondKey() {
		System.out.print("Enter the second key: ");
		return s.nextLine();
	} // end secondKey

	/**
	 * gets and returns whether the user wants to encrypt or decrypt
	 *
	 * @return 'e' for encryption, and 'd' for decryption
	 */
	public char encryptOrDecrypt() {
		System.out.print("Would you like to encrypt or dcrypt? (e/d): ");
		return s.nextLine().charAt(0);
	} // end encryptOrDecrypt

	/**
	 * message returns the message from the user
	 *
	 * @param encrypt True if encrypting, false if decrypting
	 *
	 * @return The message from the user
	 */
	public String message(boolean encrypt) {
		boolean flag = false;
		String str = "";
		if(encrypt){
			do{
				System.out.print("Enter the message to encrypt: ");
				str = s.nextLine();
				
				StringBuilder sb = new StringBuilder(str);
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == ' ')
						sb.delete(i,i+1);
				}
				str = sb.toString();
				
				if(str.length()%2 != 0){
					System.out.println("Your message must contain an even amount of characters, not including spaces.");
					flag = true;
				}
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == 'q'){
						System.out.println("Your message cannot contain the letter q.");
						flag = true;
					}
				}
			}while(flag);
			return str;
		}
		else{
			do{
				System.out.print("Enter the message to decrypt: ");
				str = s.nextLine();
				
				StringBuilder sb = new StringBuilder(str);
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == ' ')
						sb.delete(i,i+1);
				}
				str = sb.toString();
				
				if(str.length()%2 != 0){
					System.out.println("Your message must contain an even amount of characters, not including spaces.");
					flag = true;
				}
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == 'q'){
						System.out.println("Your message cannot contain the letter q.");
						flag = true;
					}
				}
			}while(flag);
			return str;
		}
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
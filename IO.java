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
		String str = s.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' ')
				sb.deleteCharAt(i);
		}
		return sb.toString();
	} // end firstKey


	/**
	 * secondKey returns the second key from the user
	 *
	 * @return The second key from the user
	 */
	public String secondKey() {
		System.out.print("Enter the second key: ");
		String str = s.nextLine().toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' ')
				sb.deleteCharAt(i);
		}
		return sb.toString();
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
				flag = false;				
				System.out.print("Enter the message to encrypt: ");
				str = s.nextLine().toLowerCase();
				
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) != ' ')
						sb.append(str.charAt(i));
				}
				str = sb.toString();
				
				if(str.length()%2 != 0){
					printError("Your message must contain an even amount of characters, not including spaces.");
					flag = true;
				}
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == 'q'){
						printError("Your message cannot contain the letter q.");
						flag = true;
					}
				}
			}while(flag);
			return str;
		}
		else{
			do{
				flag = false;
				System.out.print("Enter the message to decrypt: ");
				str = s.nextLine().toLowerCase();
				
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) != ' ')
						sb.append(str.charAt(i));
				}
				str = sb.toString();
				//System.out.println(str);
				
				if(str.length()%2 != 0){
					printError("Your message must contain an even amount of characters, not including spaces.");
					flag = true;
				}
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) == 'q'){
						printError("Your message cannot contain the letter q.");
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
		if(encrypt)
			System.out.println("\nEncrypted message: " + msg);
		else
			System.out.println("\nDecrypted message: " + msg);
	} // end printResults

	/*
	 * printError prints an error message
	 *
	 * @param err The error message to print
	 */
	public void printError(String err) {
		System.out.println(err);
	} // end printError

} // end class
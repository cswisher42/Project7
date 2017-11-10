/**
 * Cipher handles the encryption and decryption of
 * messages according to the four-square cipher algorithm.
 *
 * The cipher constructor takes to keys in the form of Strings
 * to be passed to the Square objects that are created.
 * Encrypt takes the Square objects and applies the coordinate
 * switching algorithm to return an encrypted String while
 * the method decrypt runs the opposite of the encrypt
 * algorithm to return the decrypted String.
 * #3 Extra Credit Included
 * @author Chuck Swisher
 * @version Project 7
 */

public class Cipher {
	private Square plain1;
	private Square plain2;
	private Square cipher1;
	private Square cipher2;

	/**
	 * Cipher creates the four squares based on
	 * two keys for the four-square cipher algorithm.
	 *
	 * @param key1 The first key (no Q's)
	 * @param key2 The second key (no Q's)
	 */
	public Cipher(String key1, String key2) {
		plain1 = new Square();
		plain2 = new Square(true);
		cipher1 = new Square(key1);
		cipher2 = new Square(key2);
	} // end 2 arg constructor

	/**
	 * encrypt returns the encrypted message using the
	 * four-square cipher algorithm
	 *
	 * @param message The message to encrypt
	 *
	 * @return The encrypted message
	 */
	public String encrypt(String message) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < message.length(); i+=2){
			int [] first = plain1.getPos(message.charAt(i));
			int [] second = plain2.getPos(message.charAt(i+1));
			char firstLetter = cipher1.getChar(first[0], second[1]);
			//System.out.println("char 1: " + firstLetter);
			char secondLetter = cipher2.getChar(second[0], first[1]);
			//System.out.println("char 2: " + secondLetter);
			sb.append(firstLetter);
			sb.append(secondLetter);
		}
		return sb.toString();
	} // end encrypt

	/**
	 * decrypt returns the decrypted message using the
	 * four-square cipher algorithm
 	 *
	 * @param message The message to decrypt
	 *
	 * @return The decrypted message
	 */
	public String decrypt(String message) {
		//System.out.println(message);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < message.length(); i+=2){
			int [] first = cipher1.getPos(message.charAt(i));
			int [] second = cipher2.getPos(message.charAt(i+1));
			char firstLetter = plain1.getChar(first[0], second[1]);
			char secondLetter = plain2.getChar(second[0], first[1]);
			sb.append(firstLetter);
			sb.append(secondLetter);
		
		}
		return sb.toString();
	} // end decrypt
} // end class
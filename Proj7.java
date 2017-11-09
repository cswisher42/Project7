/**
 * This project implements the four-square cipher, allowing for
 * encryption and decryption.
 *
 * <Add remaining required documentation here>
*/

public class Proj7 {
	public static void main(String[] args) {

// Complete the MAIN method
	// Get the KEYS and MESSAGE using IO class
	IO io = new IO();
	String key1 = io.firstKey();
	String key2 = io.secondKey();
	char ed = io.encryptOrDecrypt();
	boolean flag = true;
	if(ed == 'e')
		flag = true;
	else
		flag = false;
	String message = io.message(flag);
	// Pass KEYS to the CIPHER class to ENCRYPT/DECRYPT
	Cipher cipher = new Cipher(key1, key2);
	// Use CIPHER class to ENCRYPT/DECRYPT
	String newMessage = "";
	if(flag)
		newMessage = cipher.encrypt(message);
	else
		newMessage = cipher.decrypt(message);
	// Use IO class to display encrypted or decrypted message
	io.printResults(newMessage, flag);
 } // end main
} // end class
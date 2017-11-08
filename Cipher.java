/**
 * Cipher handles the encryption and decryption of
 * messages according to the four-square cipher algorithm.
 *
 * <Add remaining required documentation here>
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
		plain2 = new Square();
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
		for(int i = 0; i < message.length()-1; i++){
			
		}
		return "";
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
		//COMPLETE THIS METHOD

		//RETURN THE DECRYPTED message

		//UPDATE THIS LINE WHEN DONE
		return "";
	} // end decrypt
} // end class
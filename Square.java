/**
 * Square represents one of the squares in the four-square
 * cipher algorithm.
 *
 * <Add remaining required documentation here>
 */

public class Square {
	private char[][] matrix;

	/**
	 * Square constructs a matrix with the letters A-Z, skipping Q.
	 */
	public Square() {
		matrix = new char[5][5];

		//COMPLETE THIS CONSTRUCTOR
		//FILL matrix WITH A-Z, SKIPPING Q
	} // end no-arg constructor

	/**
	 * Square first puts the characters from key into
	 * the matrix, and then fills the matrix with the remaining
	 * letters (skipping Q).
	 *
	 * @param key One of the encryption keys
	 */
	public Square(String key) {
		matrix = new char[5][5];

		//COMPLETE THIS CONSTRUCTOR
		//FILL matrix WITH key, THEN REMAINING A-Z, SKIPPING Q
	} // end one-arg constructor

	/**
	 * getChar returns the character at a given
	 * row and column in the matrix.
	 *
	 * @param row The row to look in
	 * @param col The column to look in
	 *
	 * @return The character at (row, col)
	 */
	public char getChar(int row, int col) {
		//COMPLETE THIS METHOD
		//RETURN THE CHARACTER IN MATRIX AT POSITION row,col

		//UPDATE THIS LINE WHEN DONE
		return ' ';
	} // end getChar

	/**
	 * getPos returns the [row,col] position
	 * of the given character.
	 *
	 * @param c The character to look for
	 *
	 * @return A 1D array holding the row and col of c stored in [0] and [1]
	 */
	public int[] getPos(char c) {
		//COMPLETE THIS METHOD
		//RETURN this array holding the row and col of c stored in [0] and [1], respectively
		int[] pos = new int[2];
		
		// Search through matrix for 'c' and, when found
		// store row in pos[0] and col in pos[1]


		// If NOT found...
		//Leave this code in so that it will compile
		//Assuming char is found so don't need to
		//add code to handle if the char isn't found

		// character not found
		pos[0] = -1;
		pos[1] = -1;
		return pos;	 
	} // end getPos

	/**
	 * strContains returns whether the given string
	 * contains the given character
	 *
	 * @param str The string to search
	 * @param c The character to search for
	 *
	 * @return true if c is in str else false
	 */
	private boolean strContains(String str, char c) {

		//COMPLETE THIS METHOD (Optional, but strongly suggested)

		//REMOVE THIS LINE WHEN DONE
		return false;
		
	} // end strContains
	
	/*
	 * removeDups removes all duplicate characters
	 * from the string
	 *
	 * @param key The string to remove duplicates from
	 *
	 * @return The string with all duplicates removed
	 */
	private String removeDups(String key) {
		//COMPLETE THIS METHOD (Optional, but strongly suggested)

		//REMOVE THIS LINE WHEN DONE
		return "";

	} // end removeDups	

} // end class
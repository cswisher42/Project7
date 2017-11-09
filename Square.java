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
		String all = "abcdefghijklmnoprstuvwxyz";
		StringBuilder sb = new StringBuilder(all);
		int count = 0;
		for(int row = 0; row < 5; row++){
			for(int column = 0; column < 5; column++){
				matrix[row][column] = all.charAt(count);
				count++;
			}
		}
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
		String all = "abcdefghijklmnoprstuvwxyz";
		StringBuilder sb = new StringBuilder();
		int count = 0;
		key = removeDups(key);
		for(int i = 0; i < 25; i++){
			if(!strContains(key, all.charAt(i))){
				sb.append(all.charAt(i));
				//System.out.println(sb.toString());
			}
		}
		all = key + sb.toString();
		//System.out.println(all);
		
		for(int row = 0; row < 5; row++){
			for(int column = 0; column < 5; column++){
				matrix[row][column] = all.charAt(count);
				//System.out.print(matrix[row][column]);
				count++;
			}
			//System.out.println();
		}
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
		return matrix[row][col];
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
		for(int row = 0; row < 5; row++){
			for(int col = 0; col < 5; col++){
				//System.out.println(matrix[row][col]);
				if(matrix[row][col] == c){
					pos[0] = row;
					pos[1] = col;
					return pos;
				}
			}
		}

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

		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == c){
				//System.out.println("strContains = true at: " + c);
				return true;
			}
		}
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
		String removed = "";
		for(int i = 0; i < key.length(); i++){
			if(!removed.contains(String.valueOf(key.charAt(i))))
				removed += String.valueOf(key.charAt(i));
		}
		return removed;
	} // end removeDups	

} // end class
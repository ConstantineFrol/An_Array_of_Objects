package Week2_Q2;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Film {

	//-------------------//
	//    Attributes     //
	//-------------------//

	private String name;
	private String code;

	//-------------------//
	//    Constructor    //
	//-------------------//

	/**
	 * @param name - String - name(title) of a movie
	 */
	public Film( String name)
	{
		setName(name);

		// I'm setting attribute [ code ] with parameters that will be returned from method [ getFirstLetters ]
		this.code = getFirstLetters(name);
	}

	//-------------------//
	// Setters & Getters //
	//-------------------//

	/**
	 * 
	 * return - String - parameter of an attribute: [name]
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * 
	 * setting attribute [name] with an parameter
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * 
	 * return - String - parameter of an attribute: [code]
	 */
	public String getCode()
	{
		return this.code;
	}

	//-------------------//
	//      Methods      //
	//-------------------//

	/**
	 * @param movieName - String - parameter passed from constructor
	 * @return - String - extract the first letter from each word in a sentence
	 */
	public String getFirstLetters(String movieName)
	{
		String firstLetters = "";
		movieName = movieName.replaceAll("[.,]", ""); // Replace dots, etc (optional)
		for(String s : movieName.split(" "))
		{
			firstLetters += s.charAt(0);
		}
		return firstLetters.toUpperCase();
	}

	/**
	 * 
	 * This Method is calling Other method named: toString()
	 */
	public void print()
	{
		System.out.println(toString());
	}

	/**
	 * 
	 * return all attributes and their parameters
	 */
	public String toString() {
		return "\nFilm " + (this.name != null ? "name=" + this.name + ", " : "")
				+ (this.code != null ? "\ncode=" + this.code : "");
	}
}


package Week2_Q2;

import java.util.Arrays;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Actor {

	//-------------------//
	//    Attributes     //
	//-------------------//

	private String name;
	private String address;
	private int age;
	Film[] myFilm = new Film[3];

	//-------------------//
	//    Constructor    //
	//-------------------//


	/**
	 * @param name - String - initialize the instance [name] of your class
	 * @param address - String - initialize the instance [address] of your class
	 * @param age - integer - initialize the instance [age] of your class
	 */
	Actor(String name, String address, int age) {
		setName(name);
		setAddress(address);
		setAge(age);
	}

	//-------------------//
	// Setters & Getters //
	//-------------------//


	/**
	 * @return - String - parameter of instance [name]
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return - String - parameter of instance [address]
	 */
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return - String - parameter of instance [age]
	 */
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return Array of Object
	 */
	public Film[] getMyFilm() {
		return this.myFilm;
	}

	/**
	 * @param myFilm - setting up Array of Object with any parameters 
	 */
	public void setMyFilm(Film[] myFilm) {
		this.myFilm = myFilm;
	}

	//-------------------//
	//      Methods      //
	//-------------------//

	/**
	 * return all attributes and their parameters
	 */
	public String toString() {
		return "\nActor name=" + name + "\naddress=" + address + "\nage=" + age + "\nmyFilm=" + Arrays.toString(myFilm);
	}

	/**
	 * Calling method named: toString();
	 */
	public void print() {
		System.out.println(toString());
	}
}

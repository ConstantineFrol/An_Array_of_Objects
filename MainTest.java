package Week2_Q2;


/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class MainTest {

	public static void main(String[] args) {

		// Using constructor to create an object of the class named: Actor
		// And passing 3 parameters to that constructor
		Actor actor1 = new Actor("Jack Nicholson","Miami",74);

		// Creating an Object of each movie;
		Film movie1 = new Film("Wolf");
		Film movie2 = new Film("As good as it gets");
		Film movie3 = new Film("One flew over the Cuckoo’s Nest");

		// Passing passing objects of movies in to the method called: [movieStorage]
		Film[] actors1Movies = movieStorage(movie1, movie2, movie3);

		// Using an object of the class [Actor] We passing our array to the setter in class Actor
		actor1.setMyFilm(actors1Movies);

		// Display results for actor1
		actor1.print();

		// Using constructor to create an object of the class named: Actor
		// And passing 3 parameters to that constructor
		Actor actor2 = new Actor("Violante Placido","Bologna ",38);

		// Creating an Object of each movie;
		Film movie4 = new Film("The american");
		Film movie5 = new Film("Ghost Rider spirit of vengence");
		Film movie6 = new Film("Barah Aanan");

		// Passing passing objects of movies in to the method called: [movieStorage]
		Film[] actors2Movies = movieStorage(movie4, movie5, movie6);

		// Using an object of the class [Actor] We passing our array to the setter in class Actor
		actor2.setMyFilm(actors2Movies);

		// Display results for actor2
		actor2.print();
	}

	/**
	 * @param movie1 - Object of the 1st movie
	 * @param movie2 - Object of the 2nd movie
	 * @param movie3 - Object of the 3rd movie
	 * @return - an array that will contains objects of actors movies
	 */
	private static Film[] movieStorage(Film movie1, Film movie2, Film movie3) {

		Film[] movies = new Film[3];
		movies[0] = movie1;
		movies[1] = movie2;
		movies[2] = movie3;

		return movies;

	}

}

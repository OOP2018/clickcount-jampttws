package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 */
//TODO Delare that this implements java.util.Observer
public class ConsoleView  implements java.util.Observer{
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg != null) System.out.println(arg.toString());
			System.out.println("Count : " + counter.getCount());
		// TODO Auto-generated method stub
		
	}
	
	//TODO Write the observer method
}

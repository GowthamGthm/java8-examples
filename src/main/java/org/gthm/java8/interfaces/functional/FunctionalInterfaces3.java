package org.gthm.java8.interfaces.functional;
import org.gthm.java8.domain.Trade;

// Functional Interfaces
public class FunctionalInterfaces3 {
	// Functional interface
	interface ITrade {
		void set(Trade t, String status);
	};
	// Lambda expression
	
	
	public static void main(String[] args) {
		FunctionalInterfaces3 client = new FunctionalInterfaces3();
	}

}

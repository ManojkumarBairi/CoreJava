package netcentric;

import java.util.concurrent.Callable;

public class Egg {
	Callable<Bird> createBird;
	 public Egg(Callable<Bird> createBird) {
		this.createBird=createBird;
	       // throw new UnsupportedOperationException("Waiting to be implemented.");
	    }

	    public Bird hatch() throws Exception {
	        //throw new UnsupportedOperationException("Waiting to be implemented.");
	    	if (createBird == null)

	    		throw new IllegalStateException();

	    		try {

	    		return createBird.call();

	    		} finally {

	    		createBird = null;

	    		}

	    		}
	    
}

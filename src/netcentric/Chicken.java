package netcentric;

import java.util.concurrent.Callable;

class Chicken implements Bird,Callable {
    public Chicken() {
    }

    public static void main(String[] args) throws Exception {
        Chicken chicken = new Chicken();
      /*  Egg e=chicken.lay();
        e.hatch();*/
        System.out.println(chicken instanceof Bird);
    }

	@Override
	public Egg lay() {
		//Chicken chicken = new Chicken();
		//Egg e=new Egg((Callable<Bird>) chicken);
		return new Egg(Chicken::new);
		//return e;
	}

	@Override
	public Object call() throws Exception {
		
		return null;
	}
}
package innerclass;

public class Computer {

	public int components;
	
	Computer(){
		components = 12;
	}
	
	public int getComponents() {
		return components;
	}


	public void setComponents(int components) {
		this.components = components;
	}


	private class Keyboard{
		String alphabets;
		String numbers;
		boolean keypadlightavailable;
		public String getAlphabets() {
			return alphabets;
		}
		public void setAlphabets(String alphabets) {
			this.alphabets = alphabets;
		}
		public String getNumbers() {
			return numbers;
		}
		public void setNumbers(String numbers) {
			this.numbers = numbers;
		}
		public boolean isKeypadlightavailable() {
			return keypadlightavailable;
		}
		public void setKeypadlightavailable(boolean keypadlightavailable) {
			this.keypadlightavailable = keypadlightavailable;
		}
		
		
	}
	
	public static void main(String args[]) {
		Computer com = new Computer();
		System.out.println(com.getComponents());
		
		Keyboard k = new Computer().new Keyboard();
		System.out.println(k.toString());
	}
}

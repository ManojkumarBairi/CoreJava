package finalKeyword.example1;

public class Lex {
	final int registeredUsers = 100;
	int courses = 100;
	
	Lex(){
		//int registeredUsers = this.registeredUsers +courses;
		int registeredUsers = 250;
	}

	void display() {
		System.out.println(this.registeredUsers);
	}
	public static void main(String[] args) {
		Lex lex = new Lex();
		lex.display();

	}

}

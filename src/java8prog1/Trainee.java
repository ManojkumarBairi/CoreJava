package java8prog1;

public class Trainee {
	int traineeId;
	String name;
	float fee;

	static String companyName = "infosys";

	static void change() {
		companyName = "Infy";
	}

	Trainee(int traineeId, String name, float fee) {
		{
			this.traineeId = traineeId;
			this.name = name;
			this.fee = fee;

		}
	}

	void display() {
		System.out.println(traineeId + "-" + name + "-" + fee + " -"
				+ companyName);
	}
	public static void main(String[] args) {
		Trainee t1 = new Trainee(111, "ram", 1000.0f);
		t1.change();
		t1.display();

		Trainee t2 = new Trainee(123, "aaa", 2000.0f);
		t2.change();
		t2.display();

	}

}

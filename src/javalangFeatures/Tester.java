package javalangFeatures;

public class Tester {

	public static void main(String[] args) {
	/*	try {
			String query = "...";    // line 1
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement(query);
			System.out.println(statement.executeUpdate());
		} catch (SQLException e) {
			System.out.println(e);
		}*/

		
	/*	String[] values = { "9a4b x", "3a z", "a", "1a2b3c " };
		int counter = 0;
		for (String value : values) {
			if (value.matches("(\\d[a-z])+\\s\\w?")) {
				counter++;
			}
		}
		System.out.println(counter);*/
		
		
		String[] values = { "xy", "xay", "xaby", "xa" };
		for (String value : values) {
			if (value.matches("x.y")) {
				System.out.println(value);
			}
		}
		
	}

}

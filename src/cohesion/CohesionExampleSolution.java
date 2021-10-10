package cohesion;

class InternetDownloader {
	public void downloadFromInternet() {
		
	}
}

class DataParser {
	public void parseData(String content) {
		
	}
}

class DatabaseStorer {
	public void storeIntoDatabase(String data) {
		
	}
}

class DownloadAndStore2 {
	
	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData("");
		new DatabaseStorer().storeIntoDatabase("");
	}
}
public class CohesionExampleSolution {

	public static void main(String[] args) {
		

	}

}

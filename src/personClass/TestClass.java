package personClass;

public class TestClass {

	public static void main(String[] args) {
		
			InterestingFacts Matthew = new InterestingFacts();
			Matthew.addFact("I have an 18 inch penis.");
			Matthew.addFact("I like bananas.");
			Matthew.addFact("I'm not gay.");
			
			System.out.println(Matthew.aboutMe());
	}

}

package personClass;
import java.util.ArrayList;
public class InterestingFacts {
	ArrayList<String> funFacts = new ArrayList<String>();
	public InterestingFacts(){
		
	}
	
	public void addFact(String newFact){
		funFacts.add(newFact);
	}
	
	
	public String aboutMe(){
		String current = null;
		
		for(int x = 1; x <= funFacts.size(); x++){
			current =  current + x + ". " + funFacts.get(x-1);
		}
		
		
		return current;
	}
	
	
}

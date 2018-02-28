package personClass;
import java.util.ArrayList;
public class Projects {
	ArrayList<String> completedProjects = new ArrayList<String>();
	public Projects(){
		
	}
	public void addProject(String project){
		completedProjects.add(project);
	}
	public String projectSummary(){
		String summary = null;
		for (int i = 0; i < completedProjects.size(); i ++){
			summary = summary + (i+1) + ". " + completedProjects.get(i) + " ";
		}
		String summaryEdit = summary.substring(4);
		return summaryEdit;
	}

}

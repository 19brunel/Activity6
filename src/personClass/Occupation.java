package personClass;

public class Occupation {
	private String company;
	private String jobTitle;
	public Occupation(){
		company = "Brookfield Central High School";
		jobTitle = "Computer Science Teacher";
	}
	public String nameTag(){
		return company + "-" + jobTitle;
	}
}

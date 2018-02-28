package personClass;

public class Person {
	private String name;
	private double salary;
	private Schedule schedule;
	private Address address;
	private InterestingFacts interestingFacts;
	private Projects project;
	private Occupation occupation;
	public Person(){
		name = "Grant Parfrey";
		salary = 999.9;
		schedule = new Schedule();
		address = new Address();
		interestingFacts = new InterestingFacts();
		project = new Projects();
	}
	public String getAddress(){
		return address.mailingLabel();
	}
	public String getSchedule(){
		return schedule.mySchedule();
	}
	public String getInterestingFacts(){
		return interestingFacts.aboutMe();
	}
	public String getProjects(){
		return project.projectSummary();
	}
	public String getOccupation(){
		return occupation.nameTag();
	}
}

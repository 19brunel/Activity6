package personClass;

public class Schedule {
	
	private String[] scheduledMeetings;
	
	public Schedule(){
		scheduledMeetings = new String[5];
	}
	
	public String mySchedule(){
		String finalString = "";
		if(scheduledMeetings[0].isEmpty()!=true){
			finalString = scheduledMeetings[0];
		}
		if(scheduledMeetings[1].isEmpty()!=true){
			finalString = scheduledMeetings[0]+"\n"+scheduledMeetings[1];
		}
		if(scheduledMeetings[2].isEmpty()!=true){
			finalString = scheduledMeetings[0]+"\n"+scheduledMeetings[1]+"\n"+scheduledMeetings[2];
		}
		if(scheduledMeetings[3].isEmpty()!=true){
			finalString = scheduledMeetings[0]+"\n"+scheduledMeetings[1]+"\n"+scheduledMeetings[2]+"\n"+scheduledMeetings[3];
		}
		if(scheduledMeetings[4].isEmpty()!=true){
			finalString = scheduledMeetings[0]+"\n"+scheduledMeetings[1]+"\n"+scheduledMeetings[2]+"\n"+scheduledMeetings[3]+"\n"+scheduledMeetings[4];
		}
		return finalString;
	}
	
	
}

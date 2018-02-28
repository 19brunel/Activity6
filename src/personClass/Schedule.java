package personClass;

public class Schedule {
	
	private String[] scheduledMeetings;
	
	public Schedule(){
		scheduledMeetings = new String[5];
		scheduledMeetings[0] = "Meeting 1";
		scheduledMeetings[1] = "Meeting 2";
		scheduledMeetings[2] = "Meeting 3";
		scheduledMeetings[3] = "Meeting 4";
		scheduledMeetings[4] = "Meeting 5";
	}
	public Schedule(String a, String b, String c, String d, String e){
		scheduledMeetings = new String[5];
		scheduledMeetings[0] = a;
		scheduledMeetings[1] = b;
		scheduledMeetings[2] = c;
		scheduledMeetings[3] = d;
		scheduledMeetings[4] = e;
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

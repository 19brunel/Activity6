package personClass;

public class Schedule {
	
	private String[] scheduledMeetings;
	
	public Schedule(){
		scheduledMeetings = new String[5];
	}
	public Schedule(String a, String b, String c, String d, String e){
		scheduleMeetings = new String[5];
		scheduleMeetings[0] = a;
		scheduleMeetings[1] = b;
		scheduleMeetings[2] = c;
		scheduleMeetings[3] = d;
		scheduleMeetings[4] = e;
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

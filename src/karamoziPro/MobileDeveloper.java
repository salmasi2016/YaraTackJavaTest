package karamoziPro;

public class MobileDeveloper extends Applicant{
	private String lastJobPosition;
	private int numApp;
	
	public MobileDeveloper(String name, String jp, String id, int we, String ljp, int numApp) {
		super.setName(name);
		super.setJobPosition(jp);
		super.setId(id);
		super.setWorkExperience(we);
		setLastJobPosition(ljp);
		setNumApp(numApp);
	}
	
	public String getLastJobPosition() {
		return lastJobPosition;
	}
	
	public void setLastJobPosition(String lastJobPosition) {
		this.lastJobPosition = lastJobPosition;
	}
	
	public int getNumApp() {
		return numApp;
	}
	
	public void setNumApp(int numApp) {
		this.numApp = numApp;
	}
}
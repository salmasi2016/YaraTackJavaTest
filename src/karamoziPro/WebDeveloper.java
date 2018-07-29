package karamoziPro;

public class WebDeveloper extends Applicant {
	private String lastJobPosition;
	private String programmingLanguage;
	
	public WebDeveloper(String name, String jp, String id, int we, String ljp, String pl) {
		super.setName(name);
		super.setJobPosition(jp);
		super.setId(id);
		super.setWorkExperience(we);
		setLastJobPosition(ljp);
		setProgrammingLanguage(pl);
	}

	public String getLastJobPosition() {
		return lastJobPosition;
	}
	
	public void setLastJobPosition(String lastJobPosition) {
		this.lastJobPosition = lastJobPosition;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
}

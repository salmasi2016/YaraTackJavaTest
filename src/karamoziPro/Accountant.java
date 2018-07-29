package karamoziPro;

public class Accountant extends Applicant {
	private String lastDegree;

	public Accountant(String name, String jp, String id, int we, String ld) {
		super.setName(name);
		super.setJobPosition(jp);
		super.setId(id);
		super.setWorkExperience(we);
		setLastDegree(ld);
	}

	public String getLastDegree() {
		return lastDegree;
	}

	public void setLastDegree(String lastDegree) {
		this.lastDegree = lastDegree;
	}
}

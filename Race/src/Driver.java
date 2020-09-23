
public class Driver {
	private String name;
	private Bonus speciality;

	public Driver(String name, Bonus speciality) {
		this.name = name;
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bonus getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Bonus speciality) {
		this.speciality = speciality;
	}

}

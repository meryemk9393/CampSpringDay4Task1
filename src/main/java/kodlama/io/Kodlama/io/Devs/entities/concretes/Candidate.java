package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class Candidate {
	
	private int id;
	private String name;
	private String lastName;
	Language lang;
	
	
	public Candidate() {
		super();
	}


	public Candidate(int id, String name,String lastName, Language lang) {
		super();
		this.id = id;
		this.name = name;
		this.lastName=lastName;
		this.lang = lang;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Language getLang() {
		return lang;
	}


	public void setLang(Language lang) {
		this.lang = lang;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}

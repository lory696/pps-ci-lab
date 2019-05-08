

public class Giacomo {
	
	final private String name;
	final private String surname;	

	public Giacomo(final String name, final String surname){
		super();
		this.name = name;
		this.surname= surname;
	}
	
	public String getName() {
	    return this.name;
	}
	
	public String getSurname() {
	    return this.surname;
	}
	
	public String toString(){
		return this.name + " " + this.surname;
	}	
}
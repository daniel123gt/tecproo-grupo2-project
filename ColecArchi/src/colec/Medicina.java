package colec;

public class Medicina {
	private int codMed;
	private String nomMed;
	public Medicina(int codMed, String nomMed) {
		super();
		this.codMed = codMed;
		this.nomMed = nomMed;
	}
	public int getCodMed() {
		return codMed;
	}
	public void setCodMed(int codMed) {
		this.codMed = codMed;
	}
	public String getNomMed() {
		return nomMed;
	}
	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}
	
}

package colec;

public class Paciente {
	private int codPaciente, dniPaciente, tlfPaciente;
	private String nomPaciente, corrPaciente, sexPaciente;
	public Paciente(int codPaciente, int dniPaciente, int tlfPaciente, String nomPaciente, String corrPaciente,
			String sexPaciente) {
		super();
		this.codPaciente = codPaciente;
		this.dniPaciente = dniPaciente;
		this.tlfPaciente = tlfPaciente;
		this.nomPaciente = nomPaciente;
		this.corrPaciente = corrPaciente;
		this.sexPaciente = sexPaciente;
	}
	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	public int getDniPaciente() {
		return dniPaciente;
	}
	public void setDniPaciente(int dniPaciente) {
		this.dniPaciente = dniPaciente;
	}
	public int getTlfPaciente() {
		return tlfPaciente;
	}
	public void setTlfPaciente(int tlfPaciente) {
		this.tlfPaciente = tlfPaciente;
	}
	public String getNomPaciente() {
		return nomPaciente;
	}
	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}
	public String getCorrPaciente() {
		return corrPaciente;
	}
	public void setCorrPaciente(String corrPaciente) {
		this.corrPaciente = corrPaciente;
	}
	public String getSexPaciente() {
		return sexPaciente;
	}
	public void setSexPaciente(String sexPaciente) {
		this.sexPaciente = sexPaciente;
	}

	
}

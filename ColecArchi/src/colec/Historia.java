package colec;

import java.util.ArrayList;

public class Historia {
	private int codHistoria;
	private String fechaHistoria, diagHistoria, tratHistoria;
	private Paciente pacHistoria;
	private ArrayList<Medicina> medicamentos = new ArrayList<Medicina>();
	public Historia(int codHistoria, String fechaHistoria, String diagHistoria, String tratHistoria,
			Paciente pacHistoria, ArrayList<Medicina> medicamentos) {
		super();
		this.codHistoria = codHistoria;
		this.fechaHistoria = fechaHistoria;
		this.diagHistoria = diagHistoria;
		this.tratHistoria = tratHistoria;
		this.pacHistoria = pacHistoria;
		this.medicamentos = medicamentos;
	}
	public int getCodHistoria() {
		return codHistoria;
	}
	public void setCodHistoria(int codHistoria) {
		this.codHistoria = codHistoria;
	}
	public String getFechaHistoria() {
		return fechaHistoria;
	}
	public void setFechaHistoria(String fechaHistoria) {
		this.fechaHistoria = fechaHistoria;
	}
	public String getDiagHistoria() {
		return diagHistoria;
	}
	public void setDiagHistoria(String diagHistoria) {
		this.diagHistoria = diagHistoria;
	}
	public String getTratHistoria() {
		return tratHistoria;
	}
	public void setTratHistoria(String tratHistoria) {
		this.tratHistoria = tratHistoria;
	}
	public Paciente getPacHistoria() {
		return pacHistoria;
	}
	public void setPacHistoria(Paciente pacHistoria) {
		this.pacHistoria = pacHistoria;
	}
	public ArrayList<Medicina> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(ArrayList<Medicina> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}

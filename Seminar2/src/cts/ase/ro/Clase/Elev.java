package cts.ase.ro.Clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasaPrimita) {
		this.clasa = clasaPrimita;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		final StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append(", clasa= ").append(clasa);
		stringBuilder.append(", tutore= ").append(tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
		setSumaFinantare(30);
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

}

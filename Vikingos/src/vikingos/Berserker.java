package vikingos;

public class Berserker implements EstadoGuerrero {
	private String nombre = "Berserker";
	private double ataqueState=3;
	private double defensaState=0.1;
	private int vecesCalmarse;
	@Override
	public EstadoGuerrero atacar(double danio){
		vecesCalmarse = 0;
		if(danio >= 15){
			return new Berserker();
		}else
			return new Normal();
	}
	@Override
	public EstadoGuerrero calmarse(){
		vecesCalmarse++;
		if(vecesCalmarse == 3)
			return new Normal();
		return new Berserker();
	}
	public double getAtaqueState() {
		return ataqueState;
	}
	public double getDefensaState() {
		return defensaState;
	}
	public String getNombreEstado() {
		return nombre;
	}
	
}

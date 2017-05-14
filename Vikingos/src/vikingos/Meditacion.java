package vikingos;

public class Meditacion implements EstadoGuerrero {
	private String nombre = "Meditacion";
	//tiene los valores por los que se multiplicaran los estados del guerrero
	private double ataqueState=0.1;
	private double defensaState=5;
	@Override
	public EstadoGuerrero atacar(double danio){
		if(danio >= 5){
			return new Normal();
		}else
			return new Meditacion();
	}
	@Override
	public EstadoGuerrero calmarse(){
		return new Meditacion();	
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

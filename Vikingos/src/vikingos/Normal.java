package vikingos;

public class Normal implements EstadoGuerrero {
	private String nombre = "Normal";
	//tiene los valores por los que se multiplicaran los estados del guerrero
	private double ataqueState=1;
	private double defensaState=1;
	@Override
	public EstadoGuerrero atacar(double danio){
		if(danio >= 15){
			return new Berserker();
		}else
			return new Normal();
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

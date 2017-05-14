package vikingos;

public interface EstadoGuerrero {
	
	public EstadoGuerrero atacar(double danio);
	public EstadoGuerrero calmarse();
	public double getAtaqueState();
	public double getDefensaState();
	public String getNombreEstado();

}

package vikingos;

public class Guerrero {

	private double ataque=50;
	private double defensa=10;
	private double vida=100;
	private EstadoGuerrero estado;
	
	public Guerrero(){
		this.estado = new Normal();
	}
	public void atacar(double danio){
		this.estado = this.estado.atacar(danio);
		this.defensa *= this.estado.getDefensaState();
		this.ataque *= this.estado.getAtaqueState();
	}
	public void calmarse(){
		
		this.estado = this.estado.calmarse();
	}
	
	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public EstadoGuerrero getEstado() {
		return estado;
	}

	public void setEstado(EstadoGuerrero estado) {
		this.estado = estado;
	}


}

package vikingos;

public class Guerrero {

	private double ataque=50;
	private double defensa=10;
	private double vida=100;
	private int vecesCalmarse;
	private EstadoGuerrero estado;
	
	public Guerrero(){
		this.estado = new Normal();
	}

	public void estadoNormal() {
		estado = new Normal();
	}
	public void estadoBerserker() {
		estado = new Berserker();
	}
	public void estadoMeditacion() {
		estado = new Meditacion();
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

	public int getVecesCalmarse() {
		return vecesCalmarse;
	}

	public void setVecesCalmarse(int vecesCalmarse) {
		this.vecesCalmarse = vecesCalmarse;
	}

	public EstadoGuerrero getEstado() {
		return estado;
	}

	public void setEstado(EstadoGuerrero estado) {
		this.estado = estado;
	}

	public void getEstadoGuerrero(){

	}
	public EstadoGuerrero atacar(){
		this.estado = this.estado.atacar();
	}

}

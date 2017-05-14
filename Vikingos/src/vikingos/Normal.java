package vikingos;

public class Normal implements EstadoGuerrero {

	@Override
	public EstadoGuerrero atacar(double danio){
		if(danio >= 15){
			
			return new Berserker();
		}
			
	}
	@Override
	public EstadoGuerrero calmarse(){
		
	}
	
}

import org.junit.Assert;
import org.junit.Test;

import vikingos.Berserker;
import vikingos.EstadoGuerrero;
import vikingos.Guerrero;
import vikingos.Meditacion;
import vikingos.Normal;

public class TestGuerrero {
		
		@Test
		public void testdeNormalaBerserker(){
			
			Guerrero g1 = new Guerrero();
			g1.setEstado(new Normal());
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			g1.atacar(20);
			System.out.println("Atacado");
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			EstadoGuerrero estadofin = new Berserker();
			Assert.assertEquals(estadofin.getNombreEstado(), g1.getEstado().getNombreEstado());
		}
		@Test
		public void testdeBerserkeraNormal(){
			
			Guerrero g1 = new Guerrero();
			g1.setEstado(new Berserker());
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			g1.atacar(20);
			System.out.println("Atacado");
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			EstadoGuerrero estadoact = new Berserker();
			EstadoGuerrero estadofin = new Normal();
			Assert.assertEquals(estadoact.getNombreEstado(), g1.getEstado().getNombreEstado());
			g1.calmarse();
			g1.calmarse();
			Assert.assertEquals(estadoact.getNombreEstado(), g1.getEstado().getNombreEstado());
			g1.atacar(20);
			g1.calmarse();
			Assert.assertEquals(estadoact.getNombreEstado(), g1.getEstado().getNombreEstado());
			g1.calmarse();
			g1.calmarse();
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			Assert.assertEquals(estadofin.getNombreEstado(), g1.getEstado().getNombreEstado());
		}
		@Test
		public void testdeNormalaMeditacion(){
			Guerrero g1 = new Guerrero();
			g1.setEstado(new Normal());
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			g1.calmarse();
			System.out.println("calmado");
			System.out.println("Estado:" + g1.getEstado().getNombreEstado());
			EstadoGuerrero estadofin = new Meditacion();
			Assert.assertEquals(estadofin.getNombreEstado(), g1.getEstado().getNombreEstado());
		}
}

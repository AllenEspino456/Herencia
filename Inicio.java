package principal;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo a = new Vehiculo();
		a.setMarca("Toyota");
		a.setColor("Gris");
		a.setAño(2010);
		
		Vehiculo b = new Vehiculo();
		b.setMarca("Honda");
		b.setColor("Blanco");
		b.setAño(2016);
		
		Motor x = new Motor();
		x.setModelo("Motor de 1.5 cilindros");
		x.setKm(10);
		
		Motor y = new Motor();
		y.setModelo("Motro de 2.0 Cilindros");
		y.setKm(14);
		
		a.setMotor(x);
		

	}

}

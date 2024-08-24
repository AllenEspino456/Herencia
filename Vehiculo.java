package principal;

public class Vehiculo {
		private String Marca;
		private String Color;
		private int Año;
		private Motor motor;
		
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public int getAño() {
			return Año;
		}
		public void setAño(int año) {
			Año = año;
		}
		
		public Motor getMotor() {
			return this.motor;
		}
		public void setMotor(Motor x) {
			this.motor=x;
		}
		
		
		void movimiento(Vehiculo a) {
			System.out.println("El vehiculo"+Marca+"de Color"+Color+"del Año"+Año+"Con Motor"+motor.getModelo()+"Con una Acelaracion de "+motor.getKm());
			}

}

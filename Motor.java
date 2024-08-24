package principal;

public class Motor implements Movimiento {
	private String Modelo;
	private int Km;
	
	@Override
	public int obtenerVelocidadKM() {
		// TODO Auto-generated method stub
		return 0;
		
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getKm() {
		return Km;
	}

	public void setKm(int km) {
		Km = km;
	}

}

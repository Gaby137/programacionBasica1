package ar.edu.unlam.pb1;

public class EjemploDeTelevisor {

	public static void main(String[] args) {
		Televisor tele1 = new Televisor();
		System.out.println(tele1);
		boolean cambio =tele1.cambiarDeCanal(1, 0, 8, 4);
		if (cambio) {
			System.out.println(tele1);
		}else {
			System.out.println("no cambio de canal");
			System.out.println(tele1);
		}
		
	
		tele1.subirDeCanal();
		System.out.println(tele1);
	
		tele1.volverAlCanalAnterior();
		System.out.println(tele1);
		
		}
	
	
		

	

}

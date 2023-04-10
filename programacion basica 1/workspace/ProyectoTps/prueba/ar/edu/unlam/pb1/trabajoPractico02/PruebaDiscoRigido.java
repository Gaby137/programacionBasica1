package ar.edu.unlam.pb1.trabajoPractico02;

public class PruebaDiscoRigido {

	public static void main(String[] args) {

		System.out.println("a. seagate de 10 TB");
		DiscoRigido seagate = new DiscoRigido(10);
		System.out.println("cantidad en DVDs: "+seagate.CantidadDvds());
		System.out.println("cantidad en BLUEs: "+seagate.cantidadBlue());
		
		System.out.println("b. hitachi de 20 TB");
		DiscoRigido hitachi = new DiscoRigido(20);
		System.out.println("cantidad en DVDs: "+hitachi.CantidadDvds());
		System.out.println("cantidad en BLUEs: "+hitachi.cantidadBlue());
		
		System.out.println("c. westernDigital de 32 TB");
		DiscoRigido westernDigital = new DiscoRigido(32);
		System.out.println("cantidad en DVDs: "+westernDigital.CantidadDvds());
		System.out.println("cantidad en BLUEs: "+westernDigital.cantidadBlue());
		
		System.out.println("d. toshiba de 48 TB ");
		DiscoRigido toshiba = new DiscoRigido(48);
		System.out.println("cantidad en DVDs: "+toshiba.CantidadDvds());
		System.out.println("cantidad en BLUEs: "+toshiba.cantidadBlue());

	}

}

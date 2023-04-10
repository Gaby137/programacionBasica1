package ar.edu.unlam.pb1;

public class Televisor {
	public static final char ENTRADA_TELEVISION_DE_AIRE = 'A';
	public static final char ENTRADA_TELEVISION_POR_CABLE = 'C';
	public static final char ENTRADA_HDMI1 = '1';
	public static final char ENTRADA_HDMI2 = '2';
	public static final char ENTRADA_USB = 'U';
	public static final int VOLUMEN_MINIMO = 0;
	public static final int VOLUMEN_MAXIMO = 100;
	public static final int CANAL_MINIMO = 0;
	public static final int CANAL_MAXIMO = 99999;
	public static final int CANAL_UN_DIGITO = 9;
	public static int id = 0;
	private char entradaActual;
	private long numeroDeSerie;
	private boolean encendido;
	private char entradaSeleccionada;
	private int volumen;
	private int canal;
	private int ultimoCanal;
		
	public Televisor() {
		this.numeroDeSerie = id++;;
	}
	
	public Televisor(int numeroDeSerie) {
		this.numeroDeSerie = id++;
	}
	

//	a. encenderOApagar [Botón Power]: Invierte el estado del televisor. Si se encuentra apagado, lo
//	enciende, caso contrario lo apaga.
	public void encenderOApagar () {
		if (this.encendido == false) {
			this.encendido = true;
				
		}
		else {
			this.encendido = false;
		}
			
	}
	
//	b. toString [Botón Display]: Devuelvo la información con el estado actual del televisor.
	 public String toString() {
		 return "(entradaActual :"+this.entradaActual+ "|numeroDeSerie: "+this.numeroDeSerie
				 +"|encendido : "+this.encendido + "|entradaSelecionada: "+this.entradaSeleccionada
				 + "volumen: "+this.volumen+"|canal: "+this.canal+")";
	 }
	
//	c. seleccionarEntrada [Botón Input]: Selecciona la entrada deseada.
	 public void seleccionarEntrada(char entradaDeseada) {
		this.entradaSeleccionada = entradaDeseada;
	}
//	d. subirElVolumen [+]: Incrementa el volumen en uno.
	 public void subirElVolumen() {
		 if (this.volumen >=VOLUMEN_MINIMO && this.volumen < VOLUMEN_MAXIMO) {
			 this.volumen++;
		 }
	 }

//	e. bajarElVolumen [-]: Decrementa el volumen en uno.
	 public void bajarElVolumen() {
		 if (this.volumen > VOLUMEN_MINIMO && this.volumen <=VOLUMEN_MAXIMO) {
			 this.volumen--;
		 }
	 }
//	f. subirDeCanal (>): Incrementa el canal en uno.
	 public void subirDeCanal() {
		 if (this.canal >= CANAL_MINIMO && this.canal <CANAL_MAXIMO) {
			 this.ultimoCanal=this.canal;
		 	 this.canal++;
		 }
		 if (this.canal == CANAL_MAXIMO) {
			 this.ultimoCanal=this.canal;
			 this.canal = CANAL_MINIMO;
		 }
	}
	 
//	g. bajarDeCanal (<): Decrementa el canal en uno.
	 public void bajarDeCanal() {
		 if (this.canal > CANAL_MINIMO && this.canal <=CANAL_MAXIMO) {
			 this.ultimoCanal=this.canal;
			 this.canal--;
		 }
		 if (this.canal == CANAL_MINIMO) {
			 this.ultimoCanal=this.canal;
			 this.canal = CANAL_MAXIMO;
		 }
	 }
//	h. cambiarDeCanal : Disponible en varios formatos
//	i. [0 – 9] Cambio digital de un digito (recibe el canal deseado)
	 public boolean cambiarDeCanal(int canalDeseado) {
		 if (canalDeseado >=CANAL_MINIMO && canalDeseado <=CANAL_UN_DIGITO) {
			 this.ultimoCanal=this.canal;
			 this.canal = canalDeseado;
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

	 
//	ii. [10+] Cambio digital dos dígitos (recibe la decena y la unidad. A partir de ahí construye
//	el canal deseado)
	 public boolean cambiarDeCanal(int primerDigito, int segundoDigito) {
		 if (primerDigito>=1 && primerDigito <=9) {
			 
			 if (segundoDigito>=0 && segundoDigito <=9) {
				 this.ultimoCanal=this.canal;
				 this.canal = (primerDigito*10)+segundoDigito;
				 return true;
			 }
			  
		 } 
		 return false;
	 }
	 
//	iii. [100 +] Cambio digital tres dígitos (recibe la centana, la decena y la unidad, a partir de
//	ahí construye el canal deseado)
	 public boolean cambiarDeCanal(int primerDigito, int segundoDigito, int tercerDigito) {
		 if (primerDigito>=1 && primerDigito <=9) {
			 
			 if	(segundoDigito>=0 && segundoDigito <=9) {
				 
				 if(tercerDigito>=0 && tercerDigito <=9) {
					 this.ultimoCanal=this.canal;
					 this.canal = (primerDigito*100)+(segundoDigito*10)+tercerDigito;
					 return true;
				 }
			 }
			 
		 }
		 return false;
	 }
	 
//	iv. [1000 +] Cambio digital cuatro dígitos (recibe los cuatro dígitos que formarán el canal)
	 public boolean cambiarDeCanal(int primerDigito, int segundoDigito, int tercerDigito, int cuartoDigito) {
		 if (primerDigito>=1 && primerDigito <=9) {
			 
			 if	(segundoDigito>=0 && segundoDigito <=9) {
				 
				 if(tercerDigito>=0 && tercerDigito <=9) {
					
					 if (cuartoDigito>=0 && cuartoDigito<=9) {
						 this.ultimoCanal=this.canal;
						 this.canal = (primerDigito*1000)+(segundoDigito*100)+(tercerDigito*10)+cuartoDigito;
						 return true;
					 }
				 }
			 }
			 
		 }
		 return false;
	 }
	 
//	i. volverAlCanalAnterior [Prev.]: Retorna al último canal seleccionado.
	 public void volverAlCanalAnterior() {
		 this.canal=this.ultimoCanal;
	 }
	 
//	j. silenciar [Mute]: Actualiza el valor del volumen en cero.
	 public void silenciar() {
		 this.volumen = VOLUMEN_MINIMO;
	 }

//	k. Los gets que consideres absolutamente necesario para poder completar el desarrollo. 
	 public char getEntradaActual() {
		 return this.entradaActual;
	 }
	 
	 public long getNumeroDeSerie() {
		 return this.numeroDeSerie;
	 }
	 public boolean isEncendido() {
		 return this.encendido;
	 }
	 public int getVolumen() {
		 return this.volumen;
	 }
	 
	 public int getCanal() {
		 return this.canal;
	 }
	

}

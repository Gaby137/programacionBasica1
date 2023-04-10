package ar.edu.unlam.pb1.trabajoPractico02;

public class EjemploDeCalculadora {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora(1, 2);
		Calculadora calculadoraDelCelular = new Calculadora();
		System.out.println("la suma es: "+casio.sumar());
		System.out.println(casio);
		System.out.println("la resta es: "+casio.restar());
		System.out.println(casio);
		System.out.println("la multiplicacion es: "+casio.multiplicar());
		System.out.println("la division es: "+casio.dividir());
		System.out.println();
		System.out.println("la suma es: "+calculadoraDelCelular.sumar(2, 1));
		System.out.println("la resta es: "+calculadoraDelCelular.restar(2, 1));
		System.out.println("la multiplicacion es: "+calculadoraDelCelular.multiplicar(2, 1));
		System.out.println("la division es: "+calculadoraDelCelular.dividir(2, 1));
	
		/*6- Como sabes, para poder utilizar una clase en Java, es necesario instanciar un objeto de
dicha clase. Sin embargo, existen casos en los que esto no se cumple. Tomando como base
los ejemplos vistos hasta el momento, ¿Te animás a identificar en qué caso no estamos
instanciando la clase para poder utilizarla? ¿Cómo explicarías esta situación?*/
		//rta.: no tiene atributos propios de la Clase calculadora, solo de la clase Coche.
		
		/*7- Ya lo hemos mencionado, y lo repetiremos incansablemente. La reutilización del código es
una de las características que más nos preocupan a los programadores. Hagamos nuestra
primera reutilización. Queremos tener una herramienta que nos permita calcular el área
de un círculo. ¿Qué clase re-utilizarías de las que ya hicimos? Hacelo, pero aprovecha la
ventaja de tener el valor exacto de PI en una constante almacenada en la clase Math
(Math.PI)*/
		System.out.println("el area del circulo con radio de 3 es: "+calculadoraDelCelular.calcularAreaCirculo(3));
		
		//prueba del metodo esPositivo
		boolean resul =  Calculadora.esPositivo(5);
		if (resul)
			System.out.println("es positivo");
		else
			System.out.println("es negativo");
		
		//prueba de la division
		
		Calculadora div = new Calculadora(2, 0);
		double resul2 = div.dividir();
		System.out.println(resul2);
		
		
		int resultado = calculadoraDelCelular.potencia(2,3);
		System.out.println("resultado de la potencia:"+resultado);
		
		int resultadodelasumatoria = calculadoraDelCelular.sumatoria(4);
		System.out.println("resultado de la sumatoria: "+resultadodelasumatoria);
		
		int resultado2 = calculadoraDelCelular.sumatoria(2, 4);
		System.out.println("resultado de la sumatoria2: "+resultado2);
		
	}

	
}
package ar.edu.unlam.pb1.trabajoPractico06;

public class PruebaTablaAscii {

	public static void main(String[] args) {
		
		char ascii=' ';
		int nrosAscii=48;
		while (nrosAscii>=48 && nrosAscii<=57) {
			ascii= (char) nrosAscii;
			System.out.print(nrosAscii+"="+ascii+" ");
			nrosAscii++;
		}
		
		int mayuAscii=65;
		while (mayuAscii>=65 && mayuAscii<=90) {
			ascii= (char) mayuAscii;
			System.out.print(mayuAscii+"="+ascii+" ");
			mayuAscii++;
		}
		
		int minuAscii=97;
		while (minuAscii>=97 && minuAscii<=122) {
			ascii= (char) minuAscii;
			System.out.print(minuAscii+"="+ascii+" ");
			minuAscii++;
		}
			
			int esp1=37;
			while (esp1>=37 && esp1<=47) {
				ascii= (char) esp1;
				System.out.print(esp1+"="+ascii+" ");
				esp1++;
			}
			
			int esp2=58;
			while (esp2>=58 && esp2<=64) {
				ascii= (char) esp2;
				System.out.print(esp2+"="+ascii+" ");
				esp2++;
			}
			
			int esp3=91;
			while (esp3>=91 && esp3<=96) {
				ascii= (char) esp3;
				System.out.print(esp3+"="+ascii+" ");
				esp3++;
			}
			
			int esp4=123;
			while (esp4>=123 && esp4<=126) {
				ascii= (char) esp4;
				System.out.print(esp4+"="+ascii+" ");
				esp4++;
			} 
			
	}

}

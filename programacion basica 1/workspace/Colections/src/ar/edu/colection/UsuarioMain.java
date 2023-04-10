package ar.edu.colection;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMain {

	public static void main(String[] args) {
		List<Usuario> lu = new ArrayList<>();
		lu.add(new Usuario("A", 1));
		lu.add(new Usuario("Z", 3));
		lu.add(new Usuario("E", 2));
		lu.add(new Usuario("B", 4));

		for (Usuario usuario : lu) {
			System.out.println(usuario);
		}
		System.out.println("-----------------------------------");
		lu.sort(new OrdenarPorEdad());
		for (Usuario usuario : lu) {
			System.out.println(usuario);
		}

	}

}

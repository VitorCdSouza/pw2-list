import java.util.List;

public class ListagemUsuarios {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(27, "Felipe", 300, true);
		Usuario u2 = new Usuario(7, "Maria", 320, false);
		Usuario u3 = new Usuario(32, "Ana", 270, true);
		Usuario u4 = new Usuario(15, "João", 350, false);
		Usuario u5 = new Usuario(18, "Julio", 200, false);
		
		List<Usuario> usuarios = List.of(u1, u2, u3, u4, u5);
		
		System.out.println(usuarios.size());
		
		usuarios.forEach(i -> {
			System.out.println("Usuário:" + i.getNome());
		});
	}

}

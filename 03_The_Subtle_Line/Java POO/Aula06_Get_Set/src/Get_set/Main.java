package Get_set;

public class Main {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa();
		
		novaPessoa.setNome("João Vinícius");
		novaPessoa.setIdade(29);
		System.out.println(
				"Nome: "+ novaPessoa.getNome()+
				"\nIdade: "+ novaPessoa.getIdade()
				);

	}

}

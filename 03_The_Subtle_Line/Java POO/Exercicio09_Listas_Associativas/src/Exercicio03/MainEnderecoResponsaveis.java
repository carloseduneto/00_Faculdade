package Exercicio03;

import java.util.ArrayList;

public class MainEnderecoResponsaveis {

	public static void main(String[] args) {
		Cidade cidade01 = new Cidade("Patolândia","MG");
		Endereco endereco01 = new Endereco("Rua Pimenta de Pádua", "350", "Centro", cidade01);
		Responsavel responsavel01 = new Responsavel("Pato Donald", "037.918.421-76","(11)95555-1234" , "donaldpato@gmail.com", endereco01);
		Responsavel responsavel02 = new Responsavel("Tio Patinhas", "902.135.481-23","(11)93422-3212" , "tio-pat@empresaspatinhas.com", endereco01);
		Responsavel responsavel03 = new Responsavel("Margarida", "621.829.503-95","(11)95432-3224" , "margarida.duck@gmail.com", endereco01);

		Crianca crianca01 = new Crianca("Zezinho", 8);
		Crianca crianca02 = new Crianca("Luizinho", 6);
		Crianca crianca03 = new Crianca("Huguinho", 7);
		Crianca crianca04 = new Crianca("Patolino", 9);
		
		responsavel01.adicionarCrianca(crianca01);
		responsavel01.adicionarCrianca(crianca02);
		
		responsavel02.adicionarCrianca(crianca01);
		responsavel02.adicionarCrianca(crianca03);
		responsavel02.adicionarCrianca(crianca04);

		responsavel03.adicionarCrianca(crianca01);
		
		ArrayList<Object> Responsaveis = new ArrayList<>();
		
		Responsaveis.add(responsavel01);
		Responsaveis.add(responsavel02);
		Responsaveis.add(responsavel03);
		
		
		for (Object item: Responsaveis) {
			System.out.println("Responsável: " + ((Responsavel)item).getNome() + 
								" 🪪 "+ ((Responsavel)item).getCpf() +
								" ☎️ " + ((Responsavel)item).getTelefone()+
								" 📧 " + ((Responsavel)item).getEmail() );
			System.out.println("Endereco: " + ((Responsavel)item).getEndereco().getLogradouro() + 
					", "+ ((Responsavel)item).getEndereco().getNumero() + 
					", " + ((Responsavel)item).getEndereco().getBairro() +
					", " + ((Responsavel)item).getEndereco().getCidade().getNome() +
					" - " + ((Responsavel)item).getEndereco().getCidade().getEstado()
					);
			
			for (Crianca todasCriancas : ((Responsavel) item).getCriancas()) {
				System.out.println("Criança: " + todasCriancas.getNome()+
									", " + todasCriancas.getIdade() + " anos.");
			}
			System.out.println("\n");
		}
		
	}

}

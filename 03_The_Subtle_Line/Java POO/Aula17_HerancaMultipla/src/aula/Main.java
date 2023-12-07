package aula;

public class Main {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("João Vinícius", 6576);
		System.out.println("Nome do aluno: "+ aluno01.getNome());
		System.out.println("Matrícula do aluno: " + aluno01.getMatricula());
		
		Monitor monitor01 = new Monitor(12232, "Jéssica", 65544 );
		System.out.println("Nome do monitor: "+ monitor01.getNome());
		System.out.println("Salário do monitor: "+ monitor01.getSalario());
		System.out.println("Matrícula do monitor: " + monitor01.getMatricula());
		
		monitor01.ReceberSalario();
		monitor01.receberAdiantamento();

	}

}

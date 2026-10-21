package aula;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criar um objeto da classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Criando um objeto das notas
		nota nota1 = new nota();
		
		System.out.print("Digite o seu RA: ");
		nota1.setRA(entrada.nextInt());
		
		System.out.print("Digite a sua Disciplina: ");
		nota1.setDisciplina(entrada.next());
		
		System.out.print("Digite a Média dos Exercicios: ");
		nota1.setMd_exerc(entrada.nextFloat());
		
		System.out.print("Digite a Nota do Teste de Desempenho: ");
		nota1.setN_td(entrada.nextFloat());
		
		System.out.print("Digite a Nota da Prova: ");
		nota1.setN_prova(entrada.nextFloat());
		
		nota1.setMedia((nota1.getMd_exerc() + nota1.getN_td() + nota1.getN_prova()) / 3);
		//float media = (nota1.getMd_exerc() + nota1.getN_td() + nota1.getN_prova()) / 3;
		//nota1.setMedia(media);
		
		nota1.MostrarDados();
		
	}

}

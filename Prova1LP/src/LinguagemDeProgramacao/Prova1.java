// Nomes: 
// Kamylle Victoria Santos Bellini
// Sarah de Jesus Lima

package LinguagemDeProgramacao;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prova1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");
		
		String nome;
		double salarioBruto, salarioHora, salarioLiquido, extraOuDesconto = 0, iRPF;
		int horasTrabalhadas;
		
		System.out.println("*** FOLHA DE PAGAMENTO ***");
		
		System.out.print("Nome do colaborador.....: ");
		nome = leitor.nextLine();
		
		System.out.print("Valor do Salario Bruto..: ");
		salarioBruto = leitor.nextDouble();
		
		System.out.print("Horas trabalhadas no mês.: ");
		horasTrabalhadas = leitor.nextInt();
		
		if(horasTrabalhadas != 160) {
			salarioHora = salarioBruto / 160;
			extraOuDesconto = (horasTrabalhadas - 160) * salarioHora;
		}
		
		//imposto
		
		if(salarioBruto >= 2259.21 && salarioBruto <= 2826.65) {
			iRPF = salarioBruto * 0.075 - 169.44;
		}
		else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
			iRPF = salarioBruto * 0.15 - 381.44;
		}
		else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
			iRPF = salarioBruto * 0.225 - 662.77;
		}
		else if (salarioBruto > 4664.68) {
			iRPF = salarioBruto * 0.275 - 896;
		}
		else {iRPF = 0;
		}
		
		//INSS
		
		double iNSS = 0, primeiraFaixa = 105.9, segundaFaixa = 112.92, terceiraFaixa = 160, quartaFaixa = 530.04;
		
		if (salarioBruto >= 0 && salarioBruto <= 1412) {
			iNSS = (salarioBruto - 0) * 0.075;
		}
		else if (salarioBruto >= 1412.01 && salarioBruto <= 2666.68) {
			iNSS = (salarioBruto - 1412.01) * 0.09;
			iNSS += primeiraFaixa;
		}
		else if (salarioBruto >= 2666.69 && salarioBruto <= 4000.03) {
			iNSS = (salarioBruto - 2666.69) * 0.12;
			iNSS += primeiraFaixa + segundaFaixa;
		}
		else if (salarioBruto >= 4000.04 && salarioBruto <= 7786.02) {
			iNSS = (salarioBruto - 4000.04) * 0.14;
			iNSS += primeiraFaixa + segundaFaixa + terceiraFaixa;
		}
		else {
			iNSS = primeiraFaixa + segundaFaixa + terceiraFaixa + quartaFaixa;
		}
			
		salarioLiquido = salarioBruto - iNSS - iRPF + extraOuDesconto;
		
		//Calculo folha de pagamento

		System.out.println("*** Calculo da Folha de Pagamento ***");
		if (extraOuDesconto < 0) {
			System.out.println("Colaborador..........: " + nome);
			System.out.println("Salario Bruto........: " + df.format(salarioBruto));
			System.out.println("IRPF retido..........: " + df.format(iRPF));
			System.out.println("INSS retido..........: " + df.format(iNSS));
			System.out.println("Desconto por atraso..: " + df.format(extraOuDesconto));
			System.out.println("Salario Liquido......: " + df.format(salarioLiquido));
		}
		else if(extraOuDesconto > 0) {
			System.out.println("Colaborador..........: " + nome);
			System.out.println("Salario Bruto........: " + df.format(salarioBruto));
			System.out.println("IRPF retido..........: " + df.format(iRPF));
			System.out.println("INSS retido..........: " + df.format(iNSS));
			System.out.println("Hora extra a receber.: " + df.format(extraOuDesconto));
			System.out.println("Salario Liquido......: " + df.format(salarioLiquido));
		}
		else {
			System.out.println("Colaborador..........: " + nome);
			System.out.println("Salario Bruto........: " + df.format(salarioBruto));
			System.out.println("IRPF retido..........: " + df.format(iRPF));
			System.out.println("INSS retido..........: " + df.format(iNSS));
			System.out.println("Salario Liquido......: " + df.format(salarioLiquido));
		}
		leitor.close();
	}
}
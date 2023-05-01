package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;

public class TesteColaborador {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		Colaborador objColaborador = new Colaborador(texto("Digite um nome"),
				decimal("Digite o valor por hora"),
				texto("Digite o cargo"),
				decimal("Digite a quantidade de horas trabalhadas"),
				decimal("Digite o percentual do IR"),
				inteiro("Digite a idade"));
		
		System.out.println("Nome: " + objColaborador.getNome() + 
				"\nValor por Hora: " + objColaborador.getValorHora() +
				"\nCargo: " + objColaborador.getCargo());
		
		System.out.println("\nTodas as informações:\n" + objColaborador.getExibirTudo());
		System.out.println("\nSalário Total: " + objColaborador.getSalario());
		System.out.println("Imposto de Renda: " + objColaborador.getIr());
		System.out.println("Informação Imposto de Renda: " + objColaborador.infoSalario());
		System.out.println("Salário com Desconto de Imposto de Renda: " + objColaborador.salarioDescontoIr());
	}

}

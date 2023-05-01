package br.com.fiap.beans;

public class Colaborador {
	private String nome;
	private double valorHora;
	private String cargo;
	private double quantHrs;
	private double percent;
	private int idade;
	public Colaborador() {
		super();
	}
	public Colaborador(String nome, double valorHora, String cargo, double quantHrs, double percent, int idade) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.quantHrs = quantHrs;
		this.percent = percent;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getQuantHrs() {
		return quantHrs;
	}
	public void setQuantHrs(double quantHrs) {
		this.quantHrs = quantHrs;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getExibirTudo() {
		return "Nome: " + nome + "\nValorHora: " + valorHora + "\nCargo: " + cargo;
	}
	
	public double getSalario () {
		return valorHora * quantHrs;
	}
	
	public double getIr () {
		return (valorHora * quantHrs) * (percent / 100);
	}
	public String infoSalario () {
		String informacao;
		if (getSalario() <= 2000) {
			informacao = "Não desconta IR";
		}
		else {
			informacao = "Descontado Imposto de Renda";
		}
		return informacao;
	}
	public double salarioDescontoIr() {
		double salario;
		if(getSalario() <= 2000) {
			salario = getSalario();
		}
		else {
			salario = getSalario() - getIr();
		}
		return salario;
	}
}

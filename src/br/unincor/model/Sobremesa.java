package br.unincor.model;

import java.text.DecimalFormat;

public class Sobremesa extends Produto {
	
	private Boolean adicionais; //Define se adiciona mais alguns ingredientes - sem validação

	public Sobremesa(String nome, Double preco, Boolean adicionais) {
		super(nome, preco);
		this.adicionais = adicionais;
	}

	public Boolean getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(Boolean adicionais) {
		this.adicionais = adicionais;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00"); //Formatando o preço com 2 casas decimais
		return "Sobremesa [adicionais=" + adicionais + "]";
	}
	
	
	
	
	
}

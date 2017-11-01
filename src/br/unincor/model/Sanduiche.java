package br.unincor.model;

import java.text.DecimalFormat;

public class Sanduiche extends Produto{
	
	private Boolean trio; //Define se adiciona batata e refrigerante - sem validação
	private Boolean dobroRecheio; //Define se terá o dobro de recheio - sem validação
	
	
	
	public Sanduiche(String nome, Double preco, Boolean trio, Boolean dobroRecheio) {
		super(nome, preco);
		this.trio = trio;
		this.dobroRecheio = dobroRecheio;
	}
	
	public Boolean getTrio() {
		return trio;
	}
	
	public void setTrio(Boolean trio) {
		this.trio = trio;
	}

	public Boolean getDobroRecheio() {
		return dobroRecheio;
	}

	public void setDobroRecheio(Boolean dobroRecheio) {
		this.dobroRecheio = dobroRecheio;
	}

	@Override
	public String verDados() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Sanduiche [trio=" + trio + ", dobroRecheio=" + dobroRecheio + "]";
	}
	
	
	
}

package br.unincor.exception;

import br.unincor.model.Produto;


public class PrecoZeradoException extends Exception {
	
	private Produto produto; 

	public PrecoZeradoException(Produto produto) {
		super();
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String getMessage() {
		return "O produto " + this.produto.getNome() + " está com o preço zerado.";
	}
	
	





}

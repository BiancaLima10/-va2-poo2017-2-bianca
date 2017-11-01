package br.unincor.controle;
import java.util.List;

import br.unincor.model.Produto;



public class CalculoPrecos {
	

	public void calculaPrecoFinal(Produto p) throws PrecoZeradoException {
		if(p.getPrecoBase() != null && p.getPrecoBase() != 0) {
			//Preço do produto está ok;
			
			if(produto instanceof Produto) {
				Produto produto = (Produto)produto;
				
				if(p.gettrio(true)){
					p.setPrecoFinal(p.getPrecoBase()+15.00);
				} else {
					p.getdobroRecheio(true)){
						p.setPrecoFinal(p.getPrecoBase()*0.3);
					}
					
				}else if(p instanceof Sobremesa){
					Sobremesa s = (Sobremesa)p;
					
					if(s.getAdicionais(true)){
						s.setPrecoFinal(s.getPrecoBase()*0.35);
					}
				}
				
			} else {
				//Produto com o preço zerado!
				throw new PrecoZeradoException(produto);
			}
		}
			
		
	}
	
	public Double pagtoDinheiro(List<Produto> listProduto) {
		Double somaPreco = 0.0;
		
		for(Produto p : listProduto){
			somaPreco -= p.getPrecoFinal();
		
		}
		return somaPreco*0.1;

	}
	
	public void pagtoCartao(List<Produto> listProduto) {
		Double somaPeco = 0.0;
		
		for (Produto p : listProduto){
			somaPreco +=p.getPrecoFinal();
		}
		return somaPreco*0.05;
	}

}

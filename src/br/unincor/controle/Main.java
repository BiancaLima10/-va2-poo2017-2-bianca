package br.unincor.controle;
import java.util.ArrayList;

import br.unincor.exception.PrecoZeradoException;

import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario view = new Usuario();
		CalculaPreco calc = new CalculaPreco();
		List<Produto> listProduto = new ArrayList<Produto>();
		
		Integer op = 0;
		while(op != -1 && op != 2){
			op = view.exibeMenuPrincipal();
			
			try {
				if(op == 0){
					Sanduiche sanduiche = new Produto("Nome", 'Sanduiche X', "Dobro Recheio", false, true);
					calc.calculaPrecoFinal(sanduiche);
					listProduto.add(sanduiche);
				} else if(op == 1) {
					Sobremesa s = new Sobremesa("Nome", 'Sobremesa X', "Preço", 5.65, true);
					calc.calculaPrecoFinal(sobremesa);
					listProduto.add(sobremesa);
				}
			}catch (PrecoZeradoException pze) {
				view.exibeMsg(pze.getMessage());
			}
		} 
		Integer opPagto = view.exibePagto();
		Double valorFinal = 0.0;
		if(opPagto == 1) {
			//Cartão
			valorFinal = calc.pagtoCartao(listMidia);
		} else {
			//Boleto
			valorFinal = calc.pagtoDinheiro(listMidia);
		}
		view.exibeMsg("Resumo do pedido");
		for (Produto produto : listMidia) {
			view.exibeMsg(midia.verDados());
		}
		view.exibeMsg("Valor final: " + valorFinal);
	}
}
		
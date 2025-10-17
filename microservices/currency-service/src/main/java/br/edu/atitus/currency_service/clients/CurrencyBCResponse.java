package br.edu.atitus.currency_service.clients;

import java.util.List;

public class CurrencyBCResponse {
	
	private List<values> value;
	
	public List<values> getValue() {
		return value;
	}


	public void setValue(List<values> value) {
		this.value = value;
	}



	public static class values {
		private double cotacaoVenda;

		public double getCotacaoVenda() {
			return cotacaoVenda;
		}

		public void setCotacaoVenda(double cotacaoVenda) {
			this.cotacaoVenda = cotacaoVenda;
		}
		
		
	}
}

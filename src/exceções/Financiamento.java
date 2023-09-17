package exceções;

public class Financiamento {
	
	private Double valorTotal;
	private Double entrada;
	private Integer parcelas;
	

	public Financiamento (Double valorTotal, Double entrada, Integer parcelas) {
		if(entrada < valorTotal*0.2) {
			throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
		}else if(parcelas < 6) {
			throw new RuntimeException("O numero minimo de parcelas e 6");
		}
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;
	}
	
	public double prestacao() {
		return (valorTotal-entrada)/parcelas;
	}
}
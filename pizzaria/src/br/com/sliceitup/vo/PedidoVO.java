package br.com.sliceitup.vo;

public class PedidoVO {

	private Ineger id;
	private ClienteVO cliente;
	private Date saida;
	private Date data;
	private String status;

	public Ineger getId() {
		return id;
	}

	public void setId(Ineger id) {
		this.id = id;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
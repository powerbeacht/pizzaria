package br.com.sliceitup.vo;

public class PedidoItemVO {

	private Integer id;
	private PedidoVO pedido;
	private Integer tamanho;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PedidoVO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoVO pedido) {
		this.pedido = pedido;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
}

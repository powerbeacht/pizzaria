package br.com.sliceitup.vo;

public class SaborItemPedidoVO {

	private Integer id;
	private SaborVO sabor;
	private PedidoItemVO itemPedido;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SaborVO getSabor() {
		return sabor;
	}

	public void setSabor(SaborVO sabor) {
		this.sabor = sabor;
	}

	public PedidoItemVO getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(PedidoItemVO itemPedido) {
		this.itemPedido = itemPedido;
	}

}

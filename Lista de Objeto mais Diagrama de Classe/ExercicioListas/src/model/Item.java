package model;

public class Item {

    private int id;
    private int quantidade;
    private double subTotal;
    private Pedido pedido;
    private Produto produto;

    public Item(){
    }

    public Item(int id, int quantidade, double subTotal, Pedido pedido, Produto produto){
        this.id = id;
        this.quantidade = quantidade;
        this.subTotal = subTotal;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getSubTotal(){
        return subTotal;
    }
    public void setSubTotal(double subTotal){
        this.subTotal = subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public Produto getProduto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
}

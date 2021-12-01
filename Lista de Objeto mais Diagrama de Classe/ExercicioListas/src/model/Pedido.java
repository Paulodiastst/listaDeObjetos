package model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private double valorFrete;
    private double valoDesconto;
    private double valorCupom;
    private double valorTotal;
    private Date data;
    private List<Item> itens;


    public Pedido(){
    }

    public Pedido(int id, double valorFrete, double valoDesconto, double valorCupom, double valorTotal, Date data, List<Item> itens){
        this.id = id;
        this.valorFrete = valorFrete;
        this.valoDesconto = valoDesconto;
        this.valorCupom = valorCupom;
        this.valorTotal = valorTotal;
        this.data = data;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValoDesconto() {
        return valoDesconto;
    }

    public void setValoDesconto(double valoDesconto) {
        this.valoDesconto = valoDesconto;
    }

    public double getValorCupom() {
        return valorCupom;
    }

    public void setValorCupom(double valorCupom) {
        this.valorCupom = valorCupom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}

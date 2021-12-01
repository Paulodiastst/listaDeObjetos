package testes;

import model.Item;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Cadastro {
    public static void main(String[] args) {

        // Criar os objetos e suas instâncias
        Produto pro1 = new Produto();
        pro1.setId(10);
        pro1.setNome("arroz");
        pro1.setDescricao("integral");
        pro1.setValor(2);

        Produto pro2 = new Produto();
        pro2.setId(15);
        pro2.setNome("biscoito");
        pro2.setDescricao("integral");
        pro2.setValor(1);

        Produto pro3 = new Produto();
        pro3.setId(3);
        pro3.setNome("arroz");
        pro3.setDescricao("branco");
        pro3.setValor(3);

        Item i1 = new Item();
        i1.setId(1);
        i1.setQuantidade(10);
        i1.setSubTotal(10.5);
        i1.setProduto(pro1);

        Item i2 = new Item();
        i2.setId(2);
        i2.setQuantidade(10);
        i2.setQuantidade(50);
        i2.setProduto(pro2);

        Item i3 = new Item();
        i3.setId(5);
        i3.setQuantidade(4);
        i3.setQuantidade(10);
        i3.setProduto(pro3);

        // Declar uma váriavel
        ArrayList<Item> listaDeItens = new ArrayList<Item>();
        listaDeItens.add(i1);
        listaDeItens.add(i2);
        listaDeItens.add(i3);

        Pedido ped1 = new Pedido();
        ped1.setId(2);
        ped1.setValorCupom(4);
        ped1.setValoDesconto(4);
        ped1.setValorFrete(4);
        ped1.setValorTotal(4);
        ped1.setData(new Date());
        ped1.setItens(listaDeItens);


        i1.setPedido(ped1);
        i2.setPedido(ped1);
        i3.setPedido(ped1);

        System.out.println("Nota Fiscal do Pedido");
        System.out.println("Id Pedido: " + ped1.getId());
        System.out.println("Valor Total do Pedido: " +ped1.getValorTotal());
        for (Item i : ped1.getItens()) {
            System.out.println("id Item: " +i.getId());
            System.out.println("quantidade Item: " +i.getQuantidade());
            System.out.println("subtotal Item: "+i.getSubTotal());
            System.out.println("id Produto: " +i.getProduto().getId());
            System.out.println("nome Produto: " +i.getProduto().getNome());
        }
    }
}

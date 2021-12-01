package model;

public class Produto {
    private int id;
    private String nome;
    private String codigoBarras;
    private double valor;
    private String descricao;


    // Criar todos os métodos públicos de manipulação.
    // Primeiro fazer o método construtor vazio.
    public Produto(){
    }

    // Segundo gerar o construtor cheio.
    public Produto(int id, String nome, String codigoBarras, double valor, String descricao){
        this.id = id;
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
        this.descricao = descricao;
    }

    // Terceiro gerar os gett e sett

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCodigoBarras(){
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }



}

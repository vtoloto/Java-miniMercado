package View;

public class Item {


    private double precoUnidade;
    private double desconto;
    private int quantidade;
    private String descricao;
    private String id;

    public Item( String id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;

        if (quantidade >=0) {
            this.quantidade = quantidade;
        }
        else {
            this.quantidade = 0;
        }
        this.precoUnidade = preco;
    }
    public double getAjusteTotal() {
        double total = precoUnidade * quantidade;
        double descontototal  = total * desconto;
        double ajusteTotal = total - descontototal;

        return ajusteTotal;
    }

    public void setDesconto(double desconto) {
        if (desconto <=1.00) {
            this.desconto = desconto;
        }
        else {
            this.desconto = 0.0;
        }
    }

    public  double getDesconto(){
        return desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >=0) {
            this.quantidade = quantidade;
        }
    }

    public String getProdutoId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}

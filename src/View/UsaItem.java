package View;

public class UsaItem {
    public static void main(String[] args) {
        //instancia os itens
        Item leite = new Item("01","Leite Leco", 1, 7.99);
        Item iogurte = new Item( "20", "Iogurte Batavo", 3, 3.55);
        Item pao = new Item( "02", "Pão Francês", 6, 0.78);
        Item sabao = new Item("35", "OMO", 2, 9.99);

        //aplica os descontos
        leite.setDesconto(0.07);

        //calcula os preços
        double precoLeite = leite.getAjusteTotal();
        double precoIogurte = iogurte.getAjusteTotal();
        double precoPao = pao.getAjusteTotal();
        double precoSabao = sabao.getAjusteTotal();

        //imprime os produtos
        System.out.println("");
        System.out.println("Obrigado pela preferência!");
        System.out.println("Volte Sempre!!");
        System.out.println("");
        System.out.println("");

        System.out.println(leite.getDescricao()+ "     \t $" + precoLeite);
        System.out.println(iogurte.getDescricao()+ "\t $" + precoIogurte);
        System.out.println(pao.getDescricao()+ "    \t $" + precoPao);
        System.out.println(sabao.getDescricao()+ "         \t $" + precoSabao);

        //calcula e imprime o valor total
        double total = precoLeite + precoIogurte + precoPao + precoSabao;
        System.out.println("Preço Total \t $" + total);

    }
}

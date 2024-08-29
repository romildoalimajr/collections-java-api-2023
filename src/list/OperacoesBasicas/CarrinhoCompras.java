package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

import list.OperacoesBasicas.Item;

public class CarrinhoCompras {
    
    private List<Item> itemList;

    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public Double calcularValorTotal(double preco, int quantidade){
        double carrinhoTotal = preco * quantidade;
        return carrinhoTotal;
    }

    public void exibirItens(){
        return;
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Feijão", 9.50f, 10);
        carrinhoCompras.adicionarItem("Arroz", 6.66f, 10);
        carrinhoCompras.adicionarItem("Flocão", 4.89f, 20);

        //System.out.println(carrinhoCompras.exibirItens());
    }
}


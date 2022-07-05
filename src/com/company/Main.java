package com.company;

import com.company.models.Carrinho;
import com.company.models.Combo;
import com.company.models.Produto;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("batata", 3.99);
        Produto produto2 = new Produto("coca-cola", 5.50);
        Produto produto3 = new Produto("x-burger", 15.00);
        Produto produto4 = new Produto("sorvete", 10.00);

        Combo combo = new Combo("com-batata");

        combo.addProduto(produto1);
        combo.addProduto(produto2);
        combo.addProduto(produto3);

        Carrinho carrinho = new Carrinho();

        carrinho.addItem(combo);
        carrinho.addItem(produto4);

        System.out.println("Valor do sorvete: " + produto4.calcularPreco());
        System.out.printf("Valor do combo: %.2f %n", combo.calcularPreco());
        System.out.println("valor total: " + carrinho.calcularPreco());
    }
}

package com.company.models;

import java.util.ArrayList;

public class Carrinho implements Item{

  private ArrayList<Item> listaDeItens = new ArrayList<Item>();

  public void addItem(Item item){
    listaDeItens.add(item);
  }

  @Override
  public double calcularPreco() {
    double soma = 0;
    for (Item item: listaDeItens){
      soma += item.calcularPreco();
    }
    return soma;
  }
}

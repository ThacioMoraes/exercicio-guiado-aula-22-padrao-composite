package com.company.models;

import java.util.ArrayList;

public class Combo implements Item {
    private String nome;
    private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();

  public Combo(String nome) {
    this.nome = nome;
  }

  public void addProduto(Produto produto){
    listaDeProdutos.add(produto);
  }

  @Override
    public double calcularPreco(){
      double soma = 0;
      for (Item item: listaDeProdutos){
           soma += item.calcularPreco();
      }
      return soma;
    }
}

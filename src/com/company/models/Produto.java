package com.company.models;

public class Produto implements Item {

  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  @Override
  public double calcularPreco(){
    return this.preco;
  }

  public void getNome(){
    System.out.println(this.nome);
  }

}

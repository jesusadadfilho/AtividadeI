package com.company.app;

import com.company.models.Produto;

import java.util.List;

public class Venda {
    private List<Produto> produtos;
    private List<Integer> quatidades;
    private double valorTotal;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Integer> getQuatidades() {
        return quatidades;
    }

    public void setQuatidades(List<Integer> quatidades) {
        this.quatidades = quatidades;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

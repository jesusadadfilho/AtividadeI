package com.company.controlers;

import com.company.app.Venda;

import java.util.ArrayList;
import java.util.List;

public class DescontoPorProduto {
    private double valorFinal;
    private Venda venda;
    private List<Double> valoresDescontados = new ArrayList<>();

    public DescontoPorProduto(Venda venda) {
        this.venda = venda;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Double> getValoresDescontados() {
        return valoresDescontados;
    }

    public void setValoresDescontados(List<Double> valoresDescontados) {
        this.valoresDescontados = valoresDescontados;
    }

    public void calularDescontoPorProduto(){
        for (int i = 0; i < venda.getProdutos().size(); i++){
            if(venda.getQuatidades().get(i) >= 20){
                double valor = venda.getProdutos().get(i).getValor() * venda.getQuatidades().get(i);
                valoresDescontados.add(valor * 0.9);
            }else{
                valoresDescontados.add(venda.getProdutos().get(i).getValor() * venda.getQuatidades().get(i));
            }
        }
        gerarValorTotal();
    }

    private void gerarValorTotal(){
        for(int i = 0; i < this.valoresDescontados.size(); i++ ){
            this.valorFinal += this.valoresDescontados.get(i);
        }
        venda.setValorTotal(this.valorFinal);
    }






}

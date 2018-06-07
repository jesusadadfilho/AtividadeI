package com.company.controlers;

import com.company.app.Venda;
import com.company.models.Cliente;

public class DescontoPorCliente {
    private Venda venda;
    private Cliente cliente;
    private Double valorTotal;

    public DescontoPorCliente(Venda venda, Cliente cliente) {
        this.venda = venda;
        this.cliente = cliente;
    }

    public void gerarDesconto(){
        if(cliente.getPontos() > 1000){
            for(int i =0; i < venda.getProdutos().size(); i++){
                valorTotal += venda.getProdutos().get(i).getValor() * venda.getQuatidades().get(i);
            }
            valorTotal = valorTotal * 0.95;
        }
    }
}

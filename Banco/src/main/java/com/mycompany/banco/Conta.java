package com.mycompany.banco;


public class Conta {
    
    private Double saldo = 0.00;
    
    public boolean saque(Double valor){
        
        if(saldo <= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean deposito (Double valor){
        
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

}

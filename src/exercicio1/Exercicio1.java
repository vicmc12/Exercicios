/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author 31381243
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
        private int codigo = 0;
        private double valorDoProduto = 0;
        private double valorFinalProduto = 0;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public double getValorFinalProduto() {
        return valorFinalProduto;
    }

    public void setValorFinalProduto(double valorFinalProduto) {
        this.valorFinalProduto = valorFinalProduto;
    }
    public Exercicio1(){
        String valor = JOptionPane.showInputDialog(null,"Digite o valor do produto: ");
        try{
        valorDoProduto = Integer.parseInt(valor);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null, "Este não é um valor válido!");
        }
        String codigoInput = JOptionPane.showInputDialog(null,"Digite o código: ");
        
        try{
        codigo = Integer.parseInt(codigoInput);
        }catch(Exception NumberFormatException){
            JOptionPane.showMessageDialog(null, "Este não é um valor válido!");
        }
        if(codigo == 1){
            valorFinalProduto =valorDoProduto + valorDoProduto*0.10;
        }else{
          if(codigo == 3){
            valorFinalProduto =valorDoProduto + valorDoProduto*0.25;
        } else{
              if(codigo == 4){
            valorFinalProduto =valorDoProduto + valorDoProduto*0.30;
        }else{
               if(codigo == 8){
            valorFinalProduto =valorDoProduto + valorDoProduto*0.50;
        }    else{
                   JOptionPane.showMessageDialog(null, "Código invalido!");
               }
              }
               
          } 
          
        }

       JOptionPane.showMessageDialog(null, "O valor final do produto é: "+valorFinalProduto);
    }
        
        
        
    }
   

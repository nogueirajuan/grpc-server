package com.codenotfound.grpc.client.util;

import org.springframework.stereotype.Component;

@Component
public class Util {

    public double calculaDesvioPadrao(double[] valores){

        double media = calculaMedia(valores);
        double somaDesvioPadrao = 0;
        double result;

        for(int i = 0; i < valores.length; i++){
            somaDesvioPadrao += Math.pow((valores[i] - media), 2);
        }

        result = Math.sqrt(somaDesvioPadrao / valores.length);

        return result;
    }

    public double calculaMedia(double[] valores){

        double media;
        double soma = 0;

        for(int i = 0; i<= valores.length - 1; i++){
            soma += valores[i];
        }

        media = soma / valores.length;

        return media;
    }

    public double[] removeExtremos(double[] valores){

        double maiorIndex = 0;
        double menorIndex = 0;
        double maiorValor = 0;
        double menorValor = 99999;

        double[] resultado = new double[8];

        //marca maior e menor valor
        for(int i = 0; i < valores.length; i++){
            if (valores[i] > maiorValor){
                maiorIndex = i;
                maiorValor = valores[i];
            }

            if(valores[i] < menorValor){
                menorIndex = i;
                menorValor = valores[i];
            }
        }

        int contador = 0;
        for(int i = 0; i < resultado.length; i++){
            if (i != maiorIndex && i != menorIndex){
                resultado[contador] = valores[i];
                contador++;
            }
        }

        return resultado;

    }

}

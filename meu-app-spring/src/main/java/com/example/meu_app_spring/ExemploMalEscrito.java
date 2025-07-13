package com.example.meu_app_spring;

public class ExemploMalEscrito {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("O número " + numeros[i] + " é par");
            } else {
                System.out.println("O número " + numeros[i] + " não é par");
            }
        }
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma = soma + numeros[i];
        }
        System.out.println("A soma é " + soma);
    }
}

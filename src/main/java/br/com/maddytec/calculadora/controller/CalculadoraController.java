package br.com.maddytec.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    public String CalculoSoma(double valor1, double valor2){
        double soma = valor1 + valor2;
        return "Resultado: " + soma;
    }

    @GetMapping("/subtracao")
    public String calculoSubtracao(double valor1, double valor2){
        double subtracao = valor1 - valor2;
        return "Resultado: " + subtracao;
    }

    @GetMapping("/multiplicacao")
    public String calculoMultiplicacao(double valor1, double valor2){
        double multiplicacao = valor1 * valor2;
        return "Resultado: " + multiplicacao;
    }

    @GetMapping("/divisao")
    public String calculoDivisao(double valor1, double valor2){
        double divisao = valor1 / valor2;
        return "Resultado: " + divisao;
    }

}

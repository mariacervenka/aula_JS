package br.fiap.calculadorahtml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")


public class CalculadoraController {

    @GetMapping("/somar")
    public int somar(int a, int b){

        return a + b;
    }


    @GetMapping("/subtrair")
    public int subtrair(int a, int b){

        return a - b;
    }


    @GetMapping("/multiplicar")
    public int multiplicar(int a, int b){

        return a * b;
    }


    @GetMapping("/dividir")
    public int dividir(int a, int b){

        return a / b;
    }

}

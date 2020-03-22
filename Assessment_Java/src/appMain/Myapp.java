package appMain;


import dominio.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Myapp {

    public static void main(String[] args) throws IOException {


        // ASSESSMENT QUESTÃO [ 4 ]
//        Fatorial count = new Fatorial();
//        System.out.println("-----------------------");
//        System.out.println(count.Calculo(5));


        // ASSESSMENT QUESTÃO [ 5 ]
//        X_elevado_Y ask_5 = new X_elevado_Y(0,0 );
//        System.out.println("-----------------------");
//        ask_5.CalculoElevado();


        // ASSESSMENT QUESTÃO [ 6 ]
//        ReadFile ask_6 = new ReadFile();
//        ask_6.Resposta();


        // ASSESSMENT QUESTÃO [ 7 ]
//        Esfera Calculo = new Esfera(2);
//        System.out.println(Calculo.Calculo_Area());
//        System.out.println(Calculo.Calculo_Volume());


        // ASSESSMENT QUESTÃO [ 8 ]
        // [1, 2, 3, 2, 2, 3, 3, 3, 3] resultará em: {'1': 1, '2': 3, '3': 5}
//        Vetor novo = new Vetor();
//        novo.vetor();


        // ASSESSMENT QUESTÃO [ 9 ]
        String json = String.join(" ",
                Files.readAllLines(Paths.get("./Simples.json"), StandardCharsets.UTF_8));

        Resto restoDado = new Gson().fromJson(json, Resto.class);

        System.out.println("Primeiro Nome: "+restoDado.getNome().getPrimeiro_nome());
        System.out.println("Ultimo Nome: "+restoDado.getNome().getUltimo_nome());
        System.out.println("CPF: "+restoDado.getCPF());
        System.out.println("E-mail: "+restoDado.getEmail());

    }
}

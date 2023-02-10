package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Item;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Item> lista = new ArrayList<>();
        lista.add(new Item("Papel Higienico", 741, 0.1));
        lista.add(new Item("Detergente", 890, 0.025));
        lista.add(new Item("Luva", 6000, 0.0125));

        double soma = 0;
        for (Item item : lista) {
            soma += item.totalPorItens();
        }

        double quantCaminhoes = soma / 50;

        for (int i = 0; i < quantCaminhoes; i++) {

            if (soma > 50) {
                soma = soma - 50;
                System.out.println("O " + (i + 1) + " caminhão ira levar " + 50 + " m3");
            } else {
                System.out.println("O " + (i + 1) + " caminhão ira levar" +  soma + " m3");
            }

        }

        sc.close();
    }
}

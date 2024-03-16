package br.com.fiap.tds.model;

import br.com.fiap.tds.model.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Carro gol = new Carro();
    gol.setCor("Azul");
    gol.setModelo("gol");
    gol.setPlaca("GIO2028");
    gol.setModelo("Gol");
    gol.setEletrico(true);
    gol.setAno(2024);


        System.out.println(gol.getModelo() + " " + gol.getCor() + " " + gol.getPlaca() );
        }
    }

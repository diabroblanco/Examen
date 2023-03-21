package examenElectrodomestico;

import java.util.Scanner;
//Examen de Adrian

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Electrodomestico electro=new Electrodomestico("Frigorífico","Jack Frost" , 0.350, 24);
        System.out.println(electro.toString());	
        System.out.println("++++++++++++++++++++++++++++++");
        Lavadora lava=new Lavadora("Lavadora","Drown", 0.132, 24, 1);
        lava.setPrecio(500);
        System.out.println(lava.toString());
        System.out.println("++++++++++++++++++++++++++++++");

        Lavadora lavafria=new Lavadora("Lavadora", "Cold", 0.132, 24, 420,false);
        System.out.println(lavafria.toString());
		
	}

}

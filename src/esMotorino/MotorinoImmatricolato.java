package esMotorino;

import java.util.Scanner;

public class MotorinoImmatricolato {

		Scanner sc = new Scanner (System.in);
		String Targa;
		float maxVelocita = 0;
		String colore;
		float velocitÓ;
		String tipo;
		boolean antifurto=false;
		MotorinoImmatricolato (String c, String t, float x) {
		colore=c;
		velocitÓ=x;
		tipo=t;
		}
		
		float getVelocitÓ(){
		return velocitÓ;
		}
		
		void accelera(float x){
			if(maxVelocita<velocitÓ) {
				maxVelocita = velocitÓ;

			}
		if(antifurto==false) {velocitÓ = velocitÓ + x;}
		}
		
		float getMax(){
			return maxVelocita; 
		}
		
		void inserisciAntifurto(){
		antifurto=true;
		}
		
		void targa(){
			Targa = sc.nextLine();
			
		}
		
}

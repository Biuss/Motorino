package esMotorino;

import java.util.Scanner;

public class MotorinoImmatricolato {

		Scanner sc = new Scanner (System.in);
		String Targa;
		float maxVelocita = 0;
		String colore;
		float velocità;
		String tipo;
		boolean antifurto=false;
		MotorinoImmatricolato (String c, String t, float x) {
		colore=c;
		velocità=x;
		tipo=t;
		}
		
		float getVelocità(){
		return velocità;
		}
		
		void accelera(float x){
			if(maxVelocita<velocità) {
				maxVelocita = velocità;

			}
		if(antifurto==false) {velocità = velocità + x;}
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

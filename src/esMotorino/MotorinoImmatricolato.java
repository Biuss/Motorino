package esMotorino;

import java.util.Scanner;

public class MotorinoImmatricolato {

		Scanner sc = new Scanner (System.in);
		String Targa;
		float maxVelocita = 0;
		String colore;
		float velocit�;
		String tipo;
		boolean antifurto=false;
		MotorinoImmatricolato (String c, String t, float x) {
		colore=c;
		velocit�=x;
		tipo=t;
		}
		
		float getVelocit�(){
		return velocit�;
		}
		
		void accelera(float x){
			if(maxVelocita<velocit�) {
				maxVelocita = velocit�;

			}
		if(antifurto==false) {velocit� = velocit� + x;}
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

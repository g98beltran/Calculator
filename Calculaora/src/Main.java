
import javax.swing.JOptionPane;//biblioteca API

public class Main {
	/**
	 * Calculadora suma resta multiplica i divideix
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instancias
		UI u = new UI();
		Calculant q = new Calculant();
		// variables
		int x, y, z;
		// variable per a finestra
		String m;
		// variable per entrar
		int entrar = 0;

		// start
		// variable per entrar en la calculadora

		while (entrar == 0) {
			
			x = 0;
			y = 0;
			z = 0;
			String aux = "";
			
			m = "num";
			/**
			 * 1er: Controlar que has afegit algo i que no has ixit del programa amb l variable auxiliar (aux)
			 */
			try {
				aux = u.input(m);
			} catch (Exception e) {
				u.error("Adeu!", "Estas ixint de la app!", e);
			}
			/**
			 * 2on: Una vegada que la variable auxiliar no es null, la convertirem en un nombre.
			 */
			try {
				x = u.integer(aux);
			} catch (NumberFormatException nfe) {
				//En el cas de que no hages un ficat un nombre entrarà en aqusta excepció i traurà el missatge de error.
				u.error("HAs de posar un num!", nfe);
			}
			//Despres no oblides inicialitzar la variable aux SEMPRE.
			aux = "";
			
			
			String[] options = new String[] { "+", "-", "*", "/" };
			try{
				z = u.option("Introdueix el teu operador", "calcula", options);
			}catch(Exception e){
				u.error("by!", e);
			}
			
			m = "num2";
			
			try{
				aux = u.input(m);
				//y = Integer.parseInt(JOptionPane.showInputDialog(null, m));
			}catch(Exception e){
				u.error("Paca casa", e);
			}
			try{
				y = u.integer(aux);
			}catch(NumberFormatException nfe){
				u.error("no es un nombre", nfe);
			}
		
			// cridant al metode
			q.calculant(z, x, y);

			m = "Vols realitzar un altra operació?";
			try{
				entrar = u.confirm(m); 
			}catch(Exception e){
				u.error("BY!", e);
			}
			
		}
	}
}

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
				aux = JOptionPane.showInputDialog(null, m);
			} catch (Exception e) {
				//Li donem un missatge al user.
				JOptionPane.showMessageDialog(null, "Adeu!");
				//Li donem un altre al programador per a saber què ha passat.
				System.err.println(e.getMessage());
				System.exit(0);
			}
			/**
			 * 2on: Una vegada que la variable auxiliar no es null, la convertirem en un nombre.
			 */
			try {
				x = Integer.parseInt(aux);
			} catch (NumberFormatException nfe) {
				//En el cas de que no hages un ficat un nombre entrarà en aqusta excepció i traurà el missatge de error.
				JOptionPane.showMessageDialog(null, "Tan sols es poden calcular nombres!", "Error", JOptionPane.ERROR_MESSAGE);
				System.err.println(nfe.getMessage());
				System.exit(0);
			}
			//Despres no oblides inicialitzar la variable aux SEMPRE.
			aux = "";
			
			
			String[] options = new String[] { "+", "-", "*", "/" };
			try{
				z = JOptionPane.showOptionDialog(null, "Introdueix el teu operador.", "Calcula", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "By!");
				System.err.println(e.getMessage());
				System.exit(0);
			}
			
			m = "num2";
			
			try{
				aux = JOptionPane.showInputDialog(null,m);
				//y = Integer.parseInt(JOptionPane.showInputDialog(null, m));
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Ale aw!");
				System.err.println(e.getMessage());
				System.exit(0);
			}
			try{
				y =Integer.parseInt(aux);
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null, "No és un nombre!","Error",JOptionPane.ERROR_MESSAGE);
				System.err.println(nfe.getMessage());
				System.exit(0);
			}
		
			// cridant al metode
			q.calculant(z, x, y);

			m = "Vols realitzar un altra operació?";
			try{
				entrar = JOptionPane.showConfirmDialog(null, m);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "By!");
				System.err.println(e.getMessage());
				System.exit(0);
			}
			
		}
	}
}
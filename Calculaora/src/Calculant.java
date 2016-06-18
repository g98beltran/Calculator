import javax.swing.JOptionPane;

public class Calculant {
	private int res;
	private String m;
	public void calculant(int z ,int x,int y){
		Calculo calculaora = new Calculo();
		switch(z){
		
			case 0:
				res = calculaora.suma(x, y);
				m = +x+" "+"+"+" "+y+" = "+res;
				JOptionPane.showMessageDialog(null, m);
				break;
			case 1:
				res = calculaora.resta(x, y);
				m = +x+" "+"-"+" "+y+" = "+res;
				JOptionPane.showMessageDialog(null, m);
				break;
			case 2:
				res = calculaora.multi(x, y);
				m = +x+" "+"x"+" "+y+" = "+res;
				JOptionPane.showMessageDialog(null, m);
				break;
			case 3:
				res = calculaora.divisio(x, y);
				m = +x+" "+"/"+" "+y+" = "+res;
				JOptionPane.showMessageDialog(null, m);
				break;
		}
	}
}

//clase calcular
public class Calculo {
	//variable
	private int res;
	//metodo sumar
	public int suma(int x,int y){
		
		res = x + y;
		return res;
	}
	//metodo resta
	public int resta(int x, int y){
		//conprovar i canviar ordre
		if(x>y){
			res = x - y;
			return res;
		}else{
			res = y - x;
			return res;
		}		
	}
	//metodo multiplicació
	public int multi(int x,int y){
		res = x * y;
		return res;
	}
	//metodo dividir
	public int divisio(int x,int y){
		//comprovar i canviar ordre
		if(x>y){
			res = x/y;
			return res;
		}else{
			res = y/x;
			return res;
		}
	}
}

package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public int impuesto(){
		return 0;
	}

	public int impuesto(int sueldo, int retiro){

		if  (sueldo >= 1500000 && sueldo < 3000000 && retiro == 1000000){
			return 6;
		} else if  (sueldo >= 1500000 && sueldo < 3000000 && retiro == 2000000){
			return 12;
		} else if  (sueldo >= 1500000 && sueldo < 3000000 && retiro == 4300000){
			return 17;
		} else if  (sueldo >= 3000000  && sueldo < 5000000 && retiro == 4300000){
			return 24;
		} else if  (sueldo >= 5000000  && sueldo < 6000000 && retiro == 4300000){
			return 22;
		} else if  (sueldo >= 6000000 && retiro == 4300000){
			return 31;
		} else {
			return 0;
		}
	}
	
	public int saldoAhorro(int ahorro) {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}
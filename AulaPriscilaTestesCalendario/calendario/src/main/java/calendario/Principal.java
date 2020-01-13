package calendario;

public class Principal {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		data1.setDia(29);
		data1.setMes(2);
		data1.setAno(2022);
		
		Controle controle = new Controle();
		Data diaSeguinte = controle.proximoDia(data1);
		System.out.println(diaSeguinte);
				
	}
}

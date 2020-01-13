package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControleTest {
	
	
	@Test 
	public void verificaProximoDiaDentroDoMesmoMesDe30Dias(){
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(29,1,2020));
		Data proximoDiaEsperado = new Data(30,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
		
	}
	
	@Test 
	public void verificaProximoDiaDentroDoMesmoMesDe31Dias(){
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30,1,2020));
		Data proximoDiaEsperado = new Data(31,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
		
	}
	
	
	@Test
	public void verificaProximoDiaDepoisDoDia30() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30,4,2020));
		Data proximoDiaEsperado = new Data(1,5,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
			
	}
	
	@Test
	public void verificaProximoDiaDepoisDoDia31() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31,1,2020));
		Data proximoDiaEsperado = new Data(1,2,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
			
	}
	
	@Test
	public void verificaProximoDiaDentroDoMesDeFevereiroNoANoBissexto() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28,2,2020));
		Data proximoDiaEsperado = new Data(29,2,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	@Test
	public void verificaViradaDoMesDeFevereiroParaMarcoDeUmAnoNaoBissexto() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28,2,2019));
		Data proximoDiaEsperado = new Data(1,3,2019);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	@Test
	public void verificaViradaDoMesDeFevereiroParaMarcoNoAnoBissexto() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(29,2,2020));
		Data proximoDiaEsperado = new Data(1,3,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	@Test
	public void verificaViradaDoAno() {
		Controle controle = new Controle();
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31,12,2020));
		Data proximoDiaEsperado = new Data(1,1,2021);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
			
	}
	
	
	
	

}

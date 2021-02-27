
public class Exemplo00 {

	public static void main(String[] args) {
		
		
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro Henrique");
		pedro.setIdade(22);
		
		
		Pessoa vitor = new Pessoa();
		vitor.setNome("Vitor Augusto");
		vitor.setIdade(25);
		
		
		Curintiano gustavo = new Curintiano();
		gustavo.setNome("Gustavo Mota");
		gustavo.setIdade(27);
		
		// Conversas 
		vitor.dizerOlaParaPessoa(pedro);
		vitor.dizerOlaParaPessoa(gustavo);
		vitor.saudacao(gustavo);
		vitor.saudacao(pedro);
		gustavo.saudacao(vitor);
		pedro.expressarSentimento(vitor, "triste");
		vitor.expressarSentimento(gustavo, "feliz");
		
		
  
	}

}
/*
//%d inteiro    %s String/Char 

import java.util.Locale;



public class desafioED {



 public static void main(String[] args) {
     
     String product1 ="Computer";
     String product2 ="Office desk";
     
     int age = 30;
     int code = 5290;
     char gender ='F';
     
     double price1 = 2100.0;
     double price2 = 650.50;
     double measure = 53.234567;
     
     System.out.printf("Products: %n"
             + "%s,  which price is $ %.2f %n"
             + "%s, which price is $ %.2f %n"
             + "%n"
             + "Record: %d years old, code %d and gender: %s %n"
             + "%n"
             + "Measue with eight decimal places: %.8f %n"
             + "Rounded (three decimal places): %.3f %n",product1, price1, product2,
     price2, age, code, gender, measure, measure);
     Locale.setDefault(Locale.US);
     System.out.printf("US decimal point: %.3f", measure);        
 }



}
*/
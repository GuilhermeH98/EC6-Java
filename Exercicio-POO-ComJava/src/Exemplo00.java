
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

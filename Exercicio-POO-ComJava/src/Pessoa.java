
public class Pessoa {
	private String nome;
	private int idade;
	
	
	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void dizerOla() {
		System.out.println(this.nome+": Ol�");
	}
	
	public void dizerOlaParaPessoa(Pessoa outraPessoa) {
		System.out.printf("%n" + this.nome+": Ol�, "+ outraPessoa.getNome() + "%n");
		outraPessoa.dizerOla();
	}
	
	public void responderSaudacao() {
		System.out.println(this.nome+": Igualmente ");
	}
	public void saudacao(Pessoa outraPessoa) 
	{
		System.out.printf("%n" + this.nome+": � um prazer te conhecer " + outraPessoa.getNome() + "%n");
		outraPessoa.responderSaudacao();
		
	}
	
	public void expressarSentimento(Pessoa outraPessoa,String sentimento) 
	{
		System.out.printf("%n"+ this.nome+": Estou me sentindo "+ sentimento + "%n");
		outraPessoa.responderSentimento(this.getNome(), sentimento);
	}
	
	public void responderSentimento(String nomePessoa, String sentimento) {
		System.out.printf(this.nome+": Eu entendo "+ nomePessoa + " eu tambem me sinto " + sentimento + " as vezes %n");
	}
	
}

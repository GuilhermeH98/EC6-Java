
public class Curintiano extends Pessoa {
	
	@Override
	public void dizerOla() {
		System.out.println(this.getNome()+": Vai curintians");
		
	}
	@Override
	public void responderSaudacao()
	{
		System.out.println(this.getNome()+": Tamo junto");
		
	}
	
	@Override
	public void saudacao(Pessoa outraPessoa) 
	{
		System.out.printf("%n" + this.getNome()+": É um prazer te conhecer " + outraPessoa.getNome() + " vai curintians %n");
		outraPessoa.responderSaudacao();
	}
	
	@Override
	public void responderSentimento(String nomePessoa, String sentimento) {
		System.out.printf(this.getNome()+": Vou te roubar indiferente se você está "+ sentimento + " ou não %n");
	}
	

}

public class Contato {
	
	private String nome;
	private String telefone;
	
	public Contato(){
		this.nome = "-";
	}
	
	public Contato(String umNome){
		this.nome=umNome;
	}
	
	public Contato(String umNome, String umTelefone){
		this.nome=umNome;
		this.telefone=umTelefone;
	}
	
}

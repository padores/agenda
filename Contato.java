public class Contato {
	
	private String nome;
	private String telefone;
	
	public Contato(){
		this.setNome("-");
	}
	
	public Contato(String umNome){
		this.setNome(umNome);
	}
	
	public Contato(String umNome, String umTelefone){
		this.setNome(umNome);
		this.setTelefone(umTelefone);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

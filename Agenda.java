import java.util.Vector;

public class Agenda {
	
    private Vector<Contato> listaContatos;
    
    public Agenda() {
        this.listaContatos = new Vector<Contato>();
    }
    public String adicionarContato(Contato novoContato){
        this.listaContatos.add(novoContato);
        return "Contato Cadastrado com Sucesso!";
    }
}
import java.util.HashMap;
import java.util.Map;


public class Questao {

	private String pergunta;
	private Opcao opcaoCorreta;
	private Map<Opcao ,Alternativa> alternativas = new HashMap<Opcao, Alternativa>();
	private boolean favorito;
	
	public void adicionaAlternativa(Opcao opcao, Alternativa alternativa ){
		if (alternativas.size()<=5)
		this.alternativas.put(opcao, alternativa);	
	}
	
	public void removeAlternativa(Opcao opcao){
		this.alternativas.remove(opcao);	
	}
	
	public void defineAlternativaCorreta(Opcao opcao){
		this.opcaoCorreta = opcao;
		
		}
	
	public Opcao exibeAlternativaCorreta(){
		return this.opcaoCorreta;
	}
	
	public Map<Opcao,Alternativa> exibeTodasAlternativas() {
		return this.alternativas;
	}
	
	public Alternativa exibeAlternativaPorOpcao(Opcao opcao){
		Alternativa alternativa = alternativas.get(opcao);
		return alternativa;
	}
	
	public void formulaPergunta(String pergunta){
		this.pergunta = pergunta;
	}
	
	public void marcaFavorito(){
		this.favorito = true;
	}
	public void desmarcaFavorito(){
		this.favorito = false;
	}
	
}
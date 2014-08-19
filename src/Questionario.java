import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Questionario {
	
	private LocalDate data;
	private List<Questao> questoes = new ArrayList<Questao>();
	
	private void adicionaQuestao(int numero,Questao questao){
		if (questoes.size() <=10)
		this.questoes.add(numero, questao);
		}
	
	private void removeQuestao(int numero){
		this.questoes.remove(numero);
	}
	
	public Questionario() {
		this.data = LocalDate.now();
	}

	private LocalDate exibeDataQuestionario(){
		return this.data;
	}
	
}

package aula;

public class nota {
	int RA;
	String disciplina;
	float md_exerc, n_td, n_prova, media;
	
	//getter e setter
	int getRA() {
		return this.RA;
	}
	
	String getDisciplina() {
		return this.disciplina;
	}
	
	float getMd_exerc() {
		return this.md_exerc;
	}
	
	float getN_td() {
		return this.n_td;
	}
	
	float getN_prova() {
		return this.n_prova;
	}
	
	float getMedia() {
		return this.media;
	}
	
	void setRA(int _ra) {
		this.RA =_ra;
	}
	
	void setDisciplina(String _disciplina) {
		this.disciplina = _disciplina;
	}
	
	void setMd_exerc(float _md_exerc) {
		this.md_exerc = _md_exerc;
	}
	
	void setN_td(float _n_td) {
		this.n_td = _n_td;
	}
	
	void setN_prova(float _n_prova) {
		this.n_prova = _n_prova;
	}
	
	void setMedia(float _media) {
		this.media = _media;
	}
	
	void MostrarDados() {
		System.out.println("Dados das Notas");
		System.out.println("RA: " + this.getRA());
		System.out.println("Disciplina: " + this.getDisciplina());
		System.out.println("Média dos Exercicios: " + this.getMd_exerc());
		System.out.println("Nota do Teste de Desempenho: " + this.getN_td());
		System.out.println("Nota da Prova: " + this.getN_prova());
		System.out.println("Média Final: " + this.getMedia());
	}
}

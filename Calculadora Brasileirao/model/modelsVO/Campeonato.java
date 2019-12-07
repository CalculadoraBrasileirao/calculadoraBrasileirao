package modelsVO;

public class Campeonato {
	private int codigo;
	private String nome;
	private String timeCampeao;
	
	public int getCodigo() {
		return codigo;
	}

	public String getTimeCampeao() {
		return timeCampeao;
	}

	public void setTimeCampeao(String timeCampeao) {
		this.timeCampeao = timeCampeao;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

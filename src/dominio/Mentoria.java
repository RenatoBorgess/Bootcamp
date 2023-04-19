package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCargaHoraria() {
		return XP_PADRAO * cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + getCargaHoraria() + "]";
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

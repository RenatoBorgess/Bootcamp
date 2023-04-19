package dominio;

public class Main {
	public static void main(String[] args) {
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria top");
		mentoria.setDescricao("Melhor mentoria do pedaço");
		mentoria.setCargaHoraria(30);
		
		Curso curso = new Curso();
		curso.setTitulo("Curso top");
		curso.setDescricao("melhor curso do bairro");
		curso.setCargaHoraria(50);
			
	}
}

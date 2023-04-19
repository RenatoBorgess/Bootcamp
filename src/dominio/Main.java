package dominio;



public class Main {
	public static void main(String[] args) {
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria top");
		mentoria.setDescricao("Melhor mentoria do pedaço");
		mentoria.setCargaHoraria(30);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso top");
		curso1.setDescricao("melhor curso do bairro");
		curso1.setCargaHoraria(50);
			
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Bootcamp da ora de Javao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLigia = new Dev();
		devLigia.setNome("Lígia");
		devLigia.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Lígia: " + devLigia.getConteudosInscritos());
		devLigia.progredir();
		devLigia.progredir();
		
		System.out.println("Conteúdos concluídos Lígia: " + devLigia.getConteudosConcluidos());
	System.out.println("XP: " + devLigia.calcularTotalXp());
	}
}

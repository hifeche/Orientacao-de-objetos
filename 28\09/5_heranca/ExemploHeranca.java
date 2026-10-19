public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Frederico");
        p1.setEmail("fred@erico.net");
        p1.setIdade(28);

        Pessoa p2 = new Pessoa("Marcos", "marcos@gmail.com", 22);

        Aluno a1 = new Aluno();
        a1.setNome("Márcia");
        a1.setEmail("asd@asd.com");
        a1.setIdade(31);
        a1.setNota1(8.5f);

        Aluno a2 = new Aluno("Ana", "qwerty@asd.com", 
            19, 7.5f, 9.0f, 8.0f, 6.9f);
    }
}

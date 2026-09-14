public class Turma {
    private int nroTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdeAlunos;
    private Aluno[] vetAluno;

    public Turma(){
        this.vetAluno = new Aluno[40];
    }

    public int getnroTurma(){
        return nroTurma;
    }

    public int getNroTurma() {
        return nroTurma;
    }

    public void setNroTurma(int nroTurma) {
        this.nroTurma = nroTurma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeAlunos() {
        return qtdeAlunos;
    }

    public void setQtdeAlunos(int qtdeAlunos) {
        this.qtdeAlunos = qtdeAlunos;
    }

    public Aluno getAluno(int pos) {
        return this.vetAluno[pos];
    }

    public void setAluno(Aluno a) {
        if(this.qtdeAlunos < 40){
            this.vetAluno[qtdeAlunos] = a;
            qtdeAlunos++;
        }
    }
}

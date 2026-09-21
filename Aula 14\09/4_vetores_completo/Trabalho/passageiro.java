public class passageiro {
    private String nome;
    private String passaporte;
    private int datansc;
    private String CPF;
    private String contato;

    
    public String getNome() {
    return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getPassaporte() {
        return this.passaporte;
    }

    public void setPassaporte(String p) {
        this.passaporte = p;
    }

    public int getDatansc() {
        return this.datansc;
    }

    public void setDatansc(int datansc) {
        this.datansc = datansc;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String c) {
        this.contato = c;
    }
}

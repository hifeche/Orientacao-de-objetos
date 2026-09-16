public class companhia {
    private String nome;
    private float cnpj;
    private String pais;
    private float telefone;
    private String email;
    private String endereco;
    private int Qntdvoos;
    private voo[] vetVoos;


    
    public voo getVetVoos(int vo) {
        return this.vetVoos[vo];
    }


    public void setVetVoos(voo a) {
        if (this.Qntdvoos < 10) {
            this.vetVoos[Qntdvoos]= a;
            Qntdvoos++;
        }
    }

    public int getQntdvoos() {
        return Qntdvoos;
    }


    public void setQntdvoos(int qntdvoos) {
        Qntdvoos = qntdvoos;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getCnpj() {
        return cnpj;
    }


    public void setCnpj(float cnpj) {
        this.cnpj = cnpj;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }


    public float getTelefone() {
        return telefone;
    }


    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

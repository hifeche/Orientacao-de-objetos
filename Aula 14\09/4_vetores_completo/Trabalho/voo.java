public class voo {
    private float id;
    private String origem;
    private String destino;
    private float hora_saida;
    private float hora_chagada;
    private String status;
    private String pilotos;
    private passageiro[] vetPassageiros;
    private int Qntdpass;
    
    
    public voo() {
    this.vetPassageiros = new passageiro[50];
    }

    
    public float getId() {
        return id;
    }
    
    
    public void setId(float id) {
        this.id = id;
    }
    
    
    public String getOrigem() {
        return origem;
    }
    
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    
    public String getDestino() {
        return destino;
    }
    
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
    public float getHora_saida() {
        return hora_saida;
    }
    
    
    public void setHora_saida(float hora_saida) {
        this.hora_saida = hora_saida;
    }
    
    
    public float getHora_chagada() {
        return hora_chagada;
    }
    
    
    public void setHora_chagada(float hora_chagada) {
        this.hora_chagada = hora_chagada;
    }
    
    
    public String getStatus() {
        return status;
    }
    
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getPilotos() {
        return pilotos;
    }
    
    
    public void setPilotos(String pilotos) {
        this.pilotos = pilotos;
    }
    
    
    public int getQntdpass() {
        return Qntdpass;
    }
    
    
    public void setQntdpass(int qntdpass) {
        Qntdpass = qntdpass;
    }


    public passageiro getpassageiro(int pos) {
        return this.vetPassageiros[pos];
    }
    
    
    public void setpassageiro(passageiro a) {
        if (this.Qntdpass < 50) {
            this.vetPassageiros[Qntdpass]= a;
            Qntdpass++;
        }
    }
}
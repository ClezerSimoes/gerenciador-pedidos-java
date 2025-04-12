package edu.clezer.gerenciadorpedidos.model.pessoa;

abstract class Pessoa {
    private int numeroId;
    private String nome;
    private String telefone;
    private String email;
    private String tipoAcesso;
    private String observação;

    public Pessoa(int numeroId, String nome, String telefone, String email, String tipoAcesso){
        this.numeroId = numeroId;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email; 
        this.tipoAcesso = tipoAcesso;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public String getObservação() {
        return observação;
    }

    public void fazerPedido(){

    }
    
}

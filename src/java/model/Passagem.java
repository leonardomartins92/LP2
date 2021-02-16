package model;


import java.time.LocalDate;


public class Passagem {
    private static int cont=1;
   
    private String origem;
    private String destino;
    private String dataIda;
    private String dataVolta;
    private Pacote pacote;
    private Empresa empresa;
    
    private final int id;
    private String cnpjEmpresa;
    private int idPacote;

    public Passagem(String origem, String destino , String dataIda, String dataVolta, Pacote pacote, Empresa empresa) {
        this.id=cont;
        cont++;
        this.origem = origem;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.pacote= pacote;
        this.empresa = empresa;
        
    }

    public Passagem(String origem, String destino, String dataIda,Pacote pacote, Empresa empresa) {
        this.id=cont;
        cont++;
        this.origem = origem;
        this.destino= destino;
        this.dataIda = dataIda;
        this.pacote= pacote;
        this.empresa = empresa;
        
    }

    @Override
    public String toString() {
        return "model.Passagem{" +
                "origem='" + origem + '\'' +
                ", destino=" + destino +
                '}';
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

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.setIdPacote(pacote.getId());
        this.pacote = pacote;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public int getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(int idPacote) {
        this.idPacote = idPacote;
    }
    
}

package entitites;

public class PessoaJuridica extends Contribuinte{

    private Integer numFuncionarios;

    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
        super(name, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }
    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double imposto(){
        if (getNumFuncionarios() < 10){
            return super.getRendaAnual() * 0.16;
        }else{
            return getRendaAnual() * 0.14;
        }
    }
    @Override
    public double taxaTotal() {
        return imposto();
        }
    }
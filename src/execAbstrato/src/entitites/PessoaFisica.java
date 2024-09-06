package entitites;

public class PessoaFisica extends Contribuinte{
    private Double gastoSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    @Override
    public double imposto(){
        if (getRendaAnual() < 2000.00){
            return super.getRendaAnual() * 0.15;
        }else {
            return super.getRendaAnual() * 0.25;
        }
    }
    @Override
    public double taxaTotal(){
        return imposto() - (getGastoSaude() * 0.50);
    }
}

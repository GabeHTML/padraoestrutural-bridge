public class Hospitalar extends Cargo{

    private int numHorasTrabalhadas;

    public Hospitalar(float salarioBase){

        super(salarioBase);
    }

    public void setNumHorasTrabalhadas(int numHorasTrabalhadas) {

        this.numHorasTrabalhadas = numHorasTrabalhadas;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numHorasTrabalhadas * (50 + this.formacao.percentualAumentoHora());
    }
}

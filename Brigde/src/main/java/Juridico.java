public class Juridico extends Cargo{

    public Juridico(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {

        return this.salarioBase;
    }
}

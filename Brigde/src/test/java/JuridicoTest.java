import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuridicoTest {

    @Test
    void deveRetornarSalarioClinicoComJuridico() {
        Formacao formacao = new Clinico();
        Juridico juridico = new Juridico(10000.0f);
        juridico.setFormacao(formacao);
        assertEquals(11000.0f, juridico.calcularSalario(), 0.05f);
    }

    @Test
    void deveRetornarSalarioEsportistaComJuridico() {
        Formacao formacao = new Esportista();
        Juridico juridico = new Juridico(10000.0f);
        juridico.setFormacao(formacao);
        assertEquals(11400.0f, juridico.calcularSalario(), 0.07f);
    }

    @Test
    void deveRetornarSalarioSocialComJuridico() {
        Formacao formacao = new Social();
        Juridico juridico = new Juridico(10000.0f);
        juridico.setFormacao(formacao);
        assertEquals(11600.0f, juridico.calcularSalario(), 0.08f);
    }

    @Test
    void deveRetornarSalarioPsicologoComJuridico() {
        Formacao formacao = new Psicologo();
        Juridico juridico = new Juridico(10000.0f);
        juridico.setFormacao(formacao);
        assertEquals(11800.0f, juridico.calcularSalario(), 0.09f);
    }
}

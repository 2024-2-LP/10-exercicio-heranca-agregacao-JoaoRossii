package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile(String plataforma, String linguagem, Integer horasProtoripacao) {
        this.plataforma = plataforma;
        this.linguagem = linguagem;
        this.horasPrototipacao = horasProtoripacao;
    }

    public DesenvolvedorMobile() {
    }

    @Override
    public Double calcularSalario() {
        return (qtdHoras * valorHora) + this.horasPrototipacao * 200;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasProtoripacao) {
        this.horasPrototipacao = horasProtoripacao;
    }
}

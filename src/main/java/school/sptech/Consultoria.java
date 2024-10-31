package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas, List<Desenvolvedor> desenvolvedors) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }

    public Consultoria() {
        this.desenvolvedores = new ArrayList<>();
    }

    public Boolean contratar (Desenvolvedor desenvolvedor) {
        if (desenvolvedores.size() < vagas) {
            this.desenvolvedores.add(desenvolvedor);
            return true;
        }
        return false;
    }

    public Boolean contratarFullstack(DesenvolvedorWeb desenvolvedor) {
        if (desenvolvedor.isFullstack()) {
            this.desenvolvedores.add(desenvolvedor);
            return true;
        }
        return false;
    }

    public Double getTotalSalarios() {
        Double Salarios = 0.0;
        for (Desenvolvedor dev : desenvolvedores) {
            Salarios += dev.calcularSalario();
        }
        return Salarios;
    }

    public Integer qtdDesenvolvedoresMobile() {
        Integer qtdDevs = 0;
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev instanceof DesenvolvedorMobile) {
                qtdDevs ++;
            }
        }
        return qtdDevs;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario) {
        List<Desenvolvedor> salarios = new ArrayList<>();
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor.calcularSalario() >= salario) {
                salarios.add(desenvolvedor);
            }
        }
        return salarios;
    }

    public Desenvolvedor buscarMenorSalario() {
        if (desenvolvedores.isEmpty()) {
            return null;
        }
        Desenvolvedor salarioMenor = this.desenvolvedores.get(0);

        for (Desenvolvedor dev : desenvolvedores) {
            if (dev.calcularSalario() < salarioMenor.calcularSalario()) {
                salarioMenor = dev;
            }
        }
        return salarioMenor;
    }

    public List<Desenvolvedor> buscarPorTecnologia(String tecnologia) {
        List<Desenvolvedor> devTec = new ArrayList<>();
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev instanceof DesenvolvedorWeb) {
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getBackend())) {
                    devTec.add(dev);
                }
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getFrontend())) {
                    devTec.add(dev);
                }
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getSgbd())) {
                    devTec.add(dev);
                }
            }
            if (dev instanceof DesenvolvedorMobile) {
                if(tecnologia.equals(((DesenvolvedorMobile) dev).getLinguagem())) {
                    devTec.add(dev);
                }
                if(tecnologia.equals(((DesenvolvedorMobile) dev).getPlataforma())) {
                    devTec.add(dev);
                }
            }
        }
        return devTec;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {
        Double salarios = 0.0;
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev instanceof DesenvolvedorWeb) {
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getBackend())) {
                    salarios += dev.calcularSalario();
                }
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getFrontend())) {
                    salarios += dev.calcularSalario();
                }
                if(tecnologia.equals(((DesenvolvedorWeb) dev).getSgbd())) {
                    salarios += dev.calcularSalario();
                }
            }
            if (dev instanceof DesenvolvedorMobile) {
                if(tecnologia.equals(((DesenvolvedorMobile) dev).getLinguagem())) {
                    salarios += dev.calcularSalario();
                }
                if(tecnologia.equals(((DesenvolvedorMobile) dev).getPlataforma())) {
                    salarios += dev.calcularSalario();
                }
            }
        }
        return salarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
}

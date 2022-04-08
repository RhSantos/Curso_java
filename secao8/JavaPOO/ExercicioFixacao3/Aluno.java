package secao8.JavaPOO.ExercicioFixacao3;

public class Aluno {

    private String nome;
    private double nota1tri;
    private double nota2tri;
    private double nota3tri;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1tri() {
        return nota1tri;
    }

    public void setNota1tri(double nota1tri) {
        this.nota1tri = nota1tri;
    }

    public double getNota2tri() {
        return nota2tri;
    }

    public void setNota2tri(double nota2tri) {
        this.nota2tri = nota2tri;
    }

    public double getNota3tri() {
        return nota3tri;
    }

    public void setNota3tri(double nota3tri) {
        this.nota3tri = nota3tri;
    }

    public double notaFinal() {
        return nota1tri + nota2tri + nota3tri;
    }

    public double missingPoints() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }

}

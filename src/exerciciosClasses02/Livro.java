package exerciciosClasses02;

public class Livro {
    private String titulo, autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void ExibeInfos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

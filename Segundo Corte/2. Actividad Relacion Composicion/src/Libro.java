public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private String referenciaBibliografica;

    public Libro(String titulo, String autor, int añoPublicacion, String editorial, String referenciaBibliografica){
        this.autor=autor;
        this.titulo=titulo;
        this.añoPublicacion=añoPublicacion;
        this.editorial=editorial;
        this.referenciaBibliografica=referenciaBibliografica;
    }
    public void imprimir(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia bibliografica: "+ referenciaBibliografica);
    }
}

public class Nombre{
    
    private int valeurNombre;

    public Nombre(){
        this.valeurNombre = 0;
    }

    public Nombre(int nb){
        this.valeurNombre = nb;
    }

    public int valeur(){
        return this.valeurNombre;
    }

    public void setValeurNombre(int nb){
        this.valeurNombre = nb;
    }

    public String toString(){
        return ("Voici le nombre: " + this.valeur());
    }

}

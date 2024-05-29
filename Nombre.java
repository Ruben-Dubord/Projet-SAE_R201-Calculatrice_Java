public class Nombre extends Expression{
    
    private int valeurNombre;

    public Nombre(){
        this.valeurNombre = 0;
    }

    public Nombre(int nb){
        this.valeurNombre = nb;
    }

    public double valeur(){
        return this.valeurNombre;
    }

    public void setValeurNombre(int nb){
        this.valeurNombre = nb;
    }

    public String toString(){
        return (""+this.valeur());
    }

}

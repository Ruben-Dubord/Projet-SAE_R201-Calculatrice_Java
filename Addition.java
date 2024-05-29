public class Addition extends Operation {
    
    public Addition(Nombre n1, Nombre n2){
        super(n1,n2);
    }

    public int valeur(){
        return (this.getOperande1().valeur() + this.getOperande2().valeur());
    }

    public String toString(){
        return this.getOperande1().valeur() +" + "+ this.getOperande2().valeur();
    }

}

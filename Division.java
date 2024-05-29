public class Division extends Operation{
    
    public Division(Nombre n1, Nombre n2){
        super(n1,n2);
    }

    public int valeur() throws ArithmeticException{
        
        if (this.getOperande2().valeur() == 0){
            throw new ArithmeticException();
        }
        
        else{
            return this.getOperande1().valeur() / this.getOperande2().valeur();
        }
    }

    public String toString(){
        return this.getOperande1().valeur() +" / "+ this.getOperande2().valeur();
    }

}

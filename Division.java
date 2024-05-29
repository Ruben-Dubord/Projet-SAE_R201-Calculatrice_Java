public class Division extends Operation{
    
    public Division(Expression e1, Expression e2){
        super(e1,e2);
    }

    public double valeur() throws ArithmeticException{
        
        if (this.getOperande2().valeur() == 0){
            throw new ArithmeticException();
        }
        
        else{
            return this.getOperande1().valeur() / this.getOperande2().valeur();
        }
    }

    public String toString(){
        
        return "(" + this.getOperande1() + " / " + this.getOperande2()+")";

    }

}

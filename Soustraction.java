public class Soustraction extends Operation {
    
    public Soustraction(Expression e1, Expression e2){
        super(e1,e2);
    }

    public double valeur(){
        return this.getOperande1().valeur() - this.getOperande2().valeur();
    }

    public String toString(){
        return "(" + this.getOperande1() + " - " + this.getOperande2()+")";
    }

}

public abstract class Operation extends Expression{
    
    private Expression operande1;
    private Expression operande2;
    
    public Operation(){
        this.operande1 = new Nombre(0);
        this.operande2 = new Nombre(0);
    }

    public Operation(Expression e1, Expression e2){
        this.operande1 = e1;
        this.operande2 = e2;
    }
    
    public Expression getOperande1(){
        return this.operande1;
    }

    public Expression getOperande2(){
        return this.operande2;
    }

}

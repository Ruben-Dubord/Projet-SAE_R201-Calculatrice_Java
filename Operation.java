public abstract class Operation{
    
    private Nombre operande1;
    private Nombre operande2;
    
    public Operation(){
        this.operande1 = new Nombre(0);
        this.operande2 = new Nombre(0);
    }

    public Operation(Nombre n1, Nombre n2){
        this.operande1 = n1;
        this.operande2 = n2;
    }
    
    public abstract int valeur();

    public Nombre getOperande1(){
        return this.operande1;
    }

    public Nombre getOperande2(){
        return this.operande2;
    }

}

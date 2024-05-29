public class CalculatriceSimple {
    public static void main(String[]args){
        try{
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);
            Nombre cinq = new Nombre(5);
            Nombre zero = new Nombre();
    
            Operation s = new Soustraction(dix,six);
            Operation m = new Multiplication(six, dix);
            Operation d = new Division(dix, cinq);
            Operation d2 = new Division(dix, zero);
    
            System.out.println(s + " = " + s.valeur());    
            System.out.println(m + " = " + m.valeur());    
            System.out.println(d + " = " + d.valeur());    
            System.out.println(d2 + " = " + d2.valeur());    
        }
        catch (ArithmeticException e){
            System.out.println("Tentative de division par 0, opération impossible");
        }
    }
}

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
            //Operation d2 = new Division(dix, zero); Mis en commentaire pour permettre la construction des Expressions suivantes
    
            System.out.println(s + " = " + s.valeur());    
            System.out.println(m + " = " + m.valeur());    
            System.out.println(d + " = " + d.valeur());    
            //System.out.println(d2 + " = " + d2.valeur());

            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);
            Expression sous = new Soustraction(dixSept,deux);
            Expression add = new Addition(deux,trois);
            Expression div = new Division(sous,add);

            System.out.println(div + " = " + div.valeur());

        }
        catch (ArithmeticException e){
            System.out.println("Tentative de division par 0, opération impossible");
        }
    }
}

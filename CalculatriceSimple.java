public class CalculatriceSimple {

    public static Expression fabriqueExpression(String e){

        int nbParanthesesRencontre = 0;
        int indice_operation = 0;

        e = e.trim();
        if(e.startsWith("(") && e.endsWith(")")){
            e = e.substring(1, e.length() - 1);
        }

        try{
            double val = Double.parseDouble(e);
            return new Nombre(val);
        }
        catch (NumberFormatException err) {}

        for(int i = 0; i < e.length(); i++){
            char c = e.charAt(i);
            if(c == '('){
                nbParanthesesRencontre++;
            }
            else if(c == ')'){
                nbParanthesesRencontre--;
            }
            else if (nbParanthesesRencontre == 0 && (c == '+' || c == '-' || c == '/' || c == '*')){
                indice_operation = i;
                break;
            }
        }

        if(indice_operation != 0){
            String exp_gauche = e.substring(0, indice_operation);
            String exp_droite = e.substring(indice_operation + 1);

            Expression op1 = fabriqueExpression(exp_gauche);
            Expression op2 = fabriqueExpression(exp_droite);

            char type_operation = e.charAt(indice_operation);

            if(type_operation == '+'){
                return new Addition(op1, op2);
            }
            else if (type_operation == '-'){
                return new Soustraction(op1, op2);
            }
            else if (type_operation == '/'){
                return new Division(op1, op2);
            }
            else{
                return new Multiplication(op1, op2);
            }
        }

        throw new IllegalArgumentException("L'expression entrée est invalide: " + e);
    }

    public static void main(String[]args){

        try{
            /*
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);

            Expression s = new Soustraction(dixSept, deux);
            Expression a = new Addition(deux, trois);
            Expression d = new Division(s, a);
            Expression m = new Multiplication(deux,trois);

            System.out.println(d + " = "  + d.valeur());
            System.out.println(m + " = "  + m.valeur());

            */
            String expression = "(2+2)*a";
            System.out.println("Expression : " + expression);
            Expression resultat = fabriqueExpression(expression);
            System.out.println("Résultat : " + resultat + " = " + resultat.valeur());

            

        }
        catch (ArithmeticException e){
            System.out.println("Tentative de division par 0, opération impossible");
        }
        
        catch (IllegalArgumentException err){
            System.out.println(err);
        }
    }
}

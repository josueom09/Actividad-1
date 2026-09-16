import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old is Juan? ");
        double juan = scanner.nextDouble();

        double alberto = calcular_edad.edad_alberto(juan);
        double ana = calcular_edad.edad_ana(juan);
        double mama = calcular_edad.edad_mama(juan,alberto,ana);

        System.out.println("Edad de Juan: " + juan); 
        System.out.println("Edad de Alberto: " + alberto); 
        System.out.println("Edad de Ana: " + ana);
        System.out.println("Edad de la mama: " + mama);
    }      
}

class calcular_edad{
    public static double edad_alberto (double edad_juan){ 
        return edad_juan * (2.0/3.0);
    }
    public static double edad_ana (double edad_juan){ 
        return edad_juan * (4.0/3.0);
    }
    public static double edad_mama (double edad_juan, double edad_alberto, double edad_ana){ 
        return edad_juan + edad_alberto + edad_ana;
    }
}

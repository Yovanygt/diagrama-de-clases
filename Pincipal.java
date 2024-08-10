public class Pincipal 
{
	

    public static void main(String[] args) {
        // Crear instancia de Simulacion
        Simulacion sim = new Simulacion();

        // Crear el equipo Real Madrid con 11 jugadores y un entrenador
        Persona[] RealMadrid = new Persona[11];
        Persona[] Barcelona = new Persona[11];
        
        // Asignar el entrenador
        RealMadrid[0] = new Entrenador("Carlo Ancelotti", 65, "Italia", "Italiano", 30);
        
        // Asignar jugadores
        RealMadrid[1] = new Futbolista("Thibaut Courtois", 31   , "Bélgica", "Portero", 1);
        RealMadrid[2] = new Futbolista("Dani Carvajal", 31 , "España", "Defensa", 2);
        RealMadrid[3] = new Futbolista("Eder Militao", 25, "Brasil", "Defensa", 3);
        RealMadrid[4] = new Futbolista("David Alaba", 31, "Austria", "Defensa", 4);
        RealMadrid[5] = new Futbolista("Ferland Mendy", 28, "Francia", "Defensa", 5);
        RealMadrid[6] = new Futbolista("Toni Kroos", 33, "Alemania", "Centrocampista", 8);
        RealMadrid[7] = new Futbolista("Luka Modric", 38, "Croacia", "Centrocampista", 10);
        RealMadrid[8] = new Futbolista("Federico Valverde", 25, "Uruguay", "Centrocampista", 15);
        RealMadrid[9] = new Futbolista("Vinícius Júnior", 24, "Brasil", "Delantero", 20);
        RealMadrid[10] = new Futbolista("MBAPEE  ",   26  , "  Francia", "  Delantero  "  , 9);
    
        
     // Imprimir el equipo
        Barcelona[0] = new Entrenador("Xavi Hernández", 44, "España", "Español", 5);
        
        Barcelona[1] = new Futbolista("Marc-André ter Stegen", 32, "Alemania", "Portero", 1);
        Barcelona[2] = new Futbolista("Jules Koundé", 25, "Francia", "Defensa", 23);
        Barcelona[3] = new Futbolista("Ronald Araújo", 25, "Uruguay", "Defensa", 4);
        Barcelona[4] = new Futbolista("Andreas Christensen", 28, "Dinamarca", "Defensa", 15);
        Barcelona[5] = new Futbolista("Alejandro Balde", 20, "España", "Defensa", 22);
        Barcelona[6] = new Futbolista("Frenkie de Jong", 27, "Países Bajos", "Centrocampista", 21);
        Barcelona[7] = new Futbolista("Pedri", 21, "España", "Centrocampista", 8);
        Barcelona[8] = new Futbolista("Gavi", 19, "España", "Centrocampista", 6);
        Barcelona[9] = new Futbolista("Robert Lewandowski", 35, "Polonia", "Delantero", 9);
        Barcelona[10] = new Futbolista("Raphinha", 27, "Brasil", "Delantero", 11);
        
        System.out.println("===== Equipo Real Madrid =====\n");
        for (int i = 0; i < 11; i++) {
            System.out.println(RealMadrid[i].toString());
        }
        
        System.out.println("\n===== Equipo Barcelona =====\n");
        for (int i = 0; i < Barcelona.length; i++) {
            System.out.println(Barcelona[i].toString());
       
       
        }
        
    }
}

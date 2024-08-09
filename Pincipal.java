public class Pincipal 
{
	

    public static void main(String[] args) {
        // Crear instancia de Simulacion
        Simulacion sim = new Simulacion();

        // Crear el equipo Real Madrid con 11 jugadores y un entrenador
        Persona[] RealMadrid = new Persona[11];
        
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
        sim.imprimirEquipo(RealMadrid);
    }
}

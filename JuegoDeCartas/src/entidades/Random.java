package entidades;

public class Random {
	// "public" aquí significa que esta clase se puede usar desde cualquier parte del programa.
    // Es como decir: "esta clase es visible para todos".

    public static int ObtenerPosicion() {
        /*  
            --- EXPLICACIÓN DE PUBLIC ---

            "public" = este método puede ser llamado desde cualquier otra clase.
            Es como si dijeras: "este método está abierto al público".

            --- EXPLICACIÓN DE STATIC ---

            "static" = NO necesitas crear un objeto de la clase para usar este método.
            O sea, no tienes que hacer:

                Random r = new Random();  // <-- esto NO es necesario

            Como es static, simplemente llamas al método así:

                Random.ObtenerPosicion();

            Piensa en "static" como: 
            "pertenece a la clase y no a un objeto".
        */

        // Math.random() devuelve un número entre 0.0 y 1.0 (1 no incluido)
        // Multiplicamos por 52 para tener números hasta 51.999..
        // Convertimos a entero quitando decimales (int)
        return (int)(Math.random() * 52);
    }
}
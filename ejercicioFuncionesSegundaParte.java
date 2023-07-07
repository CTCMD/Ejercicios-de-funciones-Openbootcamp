
/*
Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 */

// Autor:Fran Mariño Diz




class ejerciciosFuncionesSegundaparte {
    public static void main (String[]args){
        coche miCoche = new coche(); // Se crea un objeto llamado miCoche
        miCoche.contarPuertas(); //Se crea la funcion de incremento del número de puertas
        System.out.println(miCoche.puertas); // Se imprime por pantalla el número de puertas
    }
static class coche  //creación de la clase coche
{
        public int puertas = 0; // variable numérica dentro de la clase coche
        public void contarPuertas (){
    this.puertas++;
    }

}
}


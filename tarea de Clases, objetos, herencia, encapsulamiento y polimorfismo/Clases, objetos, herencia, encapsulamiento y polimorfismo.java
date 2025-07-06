}// Clase base: Animal
class Animal {
    // Encapsulación: atributo privado
    private String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Getter (método público para acceder al atributo privado)
    public String getNombre() {
        return nombre;
    }

    // Método que será sobrescrito en las clases hijas
    public String hacerSonido() {
        return "Este animal hace un sonido.";
    }
}

// Clase derivada: Perro (hereda de Animal)
class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre); // Llama al constructor de la clase base
        this.raza = raza;
    }

    // Sobrescritura del método hacerSonido (polimorfismo)
    @Override
    public String hacerSonido() {
        return "¡Guau! ¡Guau!";
    }
}

// Clase derivada: Gato (hereda de Animal)
class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    // Sobrescritura del método hacerSonido (polimorfismo)
    @Override
    public String hacerSonido() {
        return "Miau~";
    }
}

// Clase principal con el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Perro miPerro = new Perro("Max", "Labrador");
        Gato miGato = new Gato("Mishi", "Blanco");

        // Mostrar resultados
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        System.out.println("Sonido del perro: " + miPerro.hacerSonido());

        System.out.println("Nombre del gato: " + miGato.getNombre());
        System.out.println("Sonido del gato: " + miGato.hacerSonido());
    }
}

public class Vehiculo {
    String marca;
    public String modelo;
    public String color;
    public String matricula;
    private int marcha;
    private boolean cambioAutomatico;
    private int numMarchas;

    public Vehiculo(String marca, String modelo, String color, String matricula, boolean cambioAutomatico, int numMarchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cambioAutomatico = cambioAutomatico;
        if (cambioAutomatico)
            this.numMarchas = 0;
        else
            this.numMarchas = numMarchas;
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, boolean cambioAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cambioAutomatico = cambioAutomatico;
        if (cambioAutomatico)
            numMarchas = 0;
        else
            numMarchas = 5;
    }
}

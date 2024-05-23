package Clases;

public class Main {
    public static void main(String[] args) {
        Arquero arquero = new Arquero("Iker", "Casillas", "España", 50, 90, 96, 99);
        System.out.println("Arquero: ");
        System.out.println("Nombre: "+ arquero.getNombre());
        System.out.println("Apellido: "+ arquero.getApellido());
        System.out.println("Nacionalidad: "+ arquero.getNacionalidad());
        System.out.println("Tiro: "+ arquero.getTiro());
        System.out.println("Pase: "+ arquero.getPase());
        System.out.println("Defensa: "+ arquero.getDefensa());
        System.out.println("Reflejos: " +arquero.getReflejos());
        arquero.habilidad_jugador();
        System.out.println("-------------------------------");

        Central1 central1 = new Central1("Ronald", "Araujo", "Uruguay", 70, 92, 99, 100);
        System.out.println("Central1: ");
        System.out.println("Nombre: "+ central1.getNombre());
        System.out.println("Apellido: "+ central1.getApellido());
        System.out.println("Nacionalidad: "+ central1.getNacionalidad());
        System.out.println("Tiro: "+ central1.getTiro());
        System.out.println("Pase: "+ central1.getPase());
        System.out.println("Defensa: "+ central1.getDefensa());
        System.out.println("Entrada: "+ central1.getEntrada1());
        central1.habilidad_jugador();
        System.out.println("-------------------------------");

        Central2 central2 = new Central2("Pau", "Cubarsi", "España", 65, 95, 96, 99);
        System.out.println("Central2: ");
        System.out.println("Nombre: "+ central2.getNombre());
        System.out.println("Apellido: "+ central2.getApellido());
        System.out.println("Nacionalidad: "+ central2.getNacionalidad());
        System.out.println("Tiro: "+ central2.getTiro());
        System.out.println("Pase: "+ central2.getPase());
        System.out.println("Defensa: "+ central2.getDefensa());
        System.out.println("Entrada: "+ central2.getEntrada2());
        central2.habilidad_jugador();
        System.out.println("--------------------------------");

        MCD mcd = new MCD("Sergio", "Busquet", "España", 40, 99,99, 100);
        System.out.println("MCD: ");
        System.out.println("Nombre: "+ mcd.getNombre());
        System.out.println("Apellido: "+ mcd.getApellido());
        System.out.println("Nacionalidad: "+ mcd.getNacionalidad());
        System.out.println("Tiro: "+ mcd.getTiro());
        System.out.println("Pase: "+ mcd.getPase());
        System.out.println("Defensa: "+ mcd.getDefensa());
        System.out.println("Dominio: "+ mcd.getDominio());
        mcd.habilidad_jugador();
        System.out.println("--------------------------------");

        MC mc = new MC("Pablo", "Gavi", "España", 95, 96,97, 101);
        System.out.println("MC: ");
        System.out.println("Nombre: "+ mc.getNombre());
        System.out.println("Apellido: "+ mc.getApellido());
        System.out.println("Nacionalidad: "+ mc.getNacionalidad());
        System.out.println("Tiro: "+ mc.getTiro());
        System.out.println("Pase: "+ mc.getPase());
        System.out.println("Defensa: "+ mc.getDefensa());
        System.out.println("Vision: "+ mc.getVision());
        mc.habilidad_jugador();
        System.out.println("--------------------------------");

        MCO mco = new MCO("Jude", "Bellingham", "Inglaterra", 98, 96,90, 99);
        System.out.println("MCO: ");
        System.out.println("Nombre: "+ mco.getNombre());
        System.out.println("Apellido: "+ mco.getApellido());
        System.out.println("Nacionalidad: "+ mco.getNacionalidad());
        System.out.println("Tiro: "+ mco.getTiro());
        System.out.println("Pase: "+ mco.getPase());
        System.out.println("Defensa: "+ mco.getDefensa());
        System.out.println("Precision: "+ mco.getPrecision());
        mco.habilidad_jugador();
        System.out.println("--------------------------------");

        LateralDerecho lateralderecho = new LateralDerecho("Joao", "Cancelo", "Portugues", 95, 97,80, 99);
        System.out.println("Lateral Derecho: ");
        System.out.println("Nombre: "+ lateralderecho.getNombre());
        System.out.println("Apellido: "+ lateralderecho.getApellido());
        System.out.println("Nacionalidad: "+ lateralderecho.getNacionalidad());
        System.out.println("Tiro: "+ lateralderecho.getTiro());
        System.out.println("Pase: "+ lateralderecho.getPase());
        System.out.println("Defensa: "+ lateralderecho.getDefensa());
        System.out.println("Velocidad: "+ lateralderecho.getVelocidad1());
        lateralderecho.habilidad_jugador();
        System.out.println("--------------------------------");
       
        LateralIzquierdo lateralizquierdo = new LateralIzquierdo("Alejandro", "Balde", "España", 93, 96,90, 100);
        System.out.println("Lateral Izquierdo: ");
        System.out.println("Nombre: "+ lateralizquierdo.getNombre());
        System.out.println("Apellido: "+ lateralizquierdo.getApellido());
        System.out.println("Nacionalidad: "+ lateralizquierdo.getNacionalidad());
        System.out.println("Tiro: "+ lateralizquierdo.getTiro());
        System.out.println("Pase: "+ lateralizquierdo.getPase());
        System.out.println("Defensa: "+ lateralizquierdo.getDefensa());
        System.out.println("Velocidad: "+ lateralizquierdo.getVelocidad2());
        lateralizquierdo.habilidad_jugador();
        System.out.println("--------------------------------");

        Delantero delantero = new Delantero("Vitor", "Roque", "Brasil", 98, 85,74, 100);
        System.out.println("Delantero: ");
        System.out.println("Nombre: "+ delantero.getNombre());
        System.out.println("Apellido: "+ delantero.getApellido());
        System.out.println("Nacionalidad: "+ delantero.getNacionalidad());
        System.out.println("Tiro: "+ delantero.getTiro());
        System.out.println("Pase: "+ delantero.getPase());
        System.out.println("Defensa: "+ delantero.getDefensa());
        System.out.println("Finalización: "+ delantero.getFinalizacion());
        delantero.habilidad_jugador();
        System.out.println("--------------------------------");
     }
}

public class Semaforo {
        private String estado;

    public Semaforo(String estadoInicial) {
            this.estado = estadoInicial;
        }
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    public String getEstado() {
        return estado;
    }

        public void mostrarEstado() {
            String rojo = "\u001B[31m";
            String verde = "\u001B[32m";
            String amarillo = "\u001B[33m";
            String reset = "\u001B[0m";
            switch (estado) {
                case "rojo":
                    System.out.println("        " + rojo +  "                  ((*))  " + reset + "  |           l          |" + reset +  " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |     ↓     l     ↑    |" + reset + " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |           l          |" + verde + " ((*)) "+reset);
                    System.out.println("        ___________________________                        ___________________________");
                    System.out.println("                  ←  ←  ←                                         ←  ←  ←                          ");
                    System.out.println("             ----------------------------------+----------------------------------");
                    System.out.println("                  →  →  →                                         →  →  →                         ");
                    System.out.println("        ___________________________                        ____________________________");
                    System.out.println("        " + verde +  "                  ((*))  " + reset + "  |           l          |" + reset +  " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |     ↓     l      ↑   |" + reset + " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |           l          |" + rojo + " ((*)) "+reset);
                    break;
                case "amarillo":
                    System.out.println("                                ");
                    System.out.println("                                ");
                    System.out.println("        " + reset +  "                  ((*))  " + reset + "  |           l          |" + reset +  " ((*)) ");
                    System.out.println("        " + amarillo + "                  ((*))  " + reset +  "  |     ↓     l     ↑    |" + amarillo + " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |           l          |" + reset + " ((*)) ");
                    System.out.println("        ___________________________                        ___________________________");
                    System.out.println("                  ←  ←  ←                                         ←  ←  ←                          ");
                    System.out.println("             ----------------------------------+----------------------------------");
                    System.out.println("                  →  →  →                                         →  →  →                         ");
                    System.out.println("        ___________________________                        ____________________________");
                    System.out.println("        " + reset +  "                  ((*))  " + reset + "  |           l          |" + reset +  " ((*)) ");
                    System.out.println("        " + amarillo + "                  ((*))  " + reset +  "  |     ↓     l      ↑   |" + amarillo + " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |           l          |" + reset + " ((*)) ");
                    System.out.println("                                ");
                    System.out.println("                                ");
                    break;
                case "verde":
                    System.out.println("        " + reset +  "                  ((*))  " + reset + "  |           l          |" + rojo +  " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |     ↓     l     ↑    |" + reset + " ((*)) ");
                    System.out.println("        " + verde + "                  ((*))  " + reset +  "  |           l          |" + reset + " ((*)) "+reset);
                    System.out.println("        ___________________________                        ___________________________");
                    System.out.println("                  ←  ←  ←                                         ←  ←  ←                          ");
                    System.out.println("             ----------------------------------+----------------------------------");
                    System.out.println("                  →  →  →                                         →  →  →                         ");
                    System.out.println("        ___________________________                        ____________________________");
                    System.out.println("        " + rojo +  "                  ((*))  " + reset + "  |           l          |" + reset +  " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |     ↓     l      ↑   |" + reset + " ((*)) ");
                    System.out.println("        " + reset + "                  ((*))  " + reset +  "  |           l          |" + verde + " ((*)) "+reset);
                    break;
            }
        }
    }


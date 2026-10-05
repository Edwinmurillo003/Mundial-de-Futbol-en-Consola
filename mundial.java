class Mundial {

    // ============================================================
    // DATOS
    // ============================================================

    static String[] LETRAS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

    // 12 grupos x 4 selecciones
    static String[][] GRUPOS = {
        {"México", "Sudáfrica", "Corea del Sur", "Chequia"},
        {"Canadá", "Bosnia y Herzegovina", "Catar", "Suiza"},
        {"Brasil", "Marruecos", "Haití", "Escocia"},
        {"Estados Unidos", "Paraguay", "Australia", "Turquía"},
        {"Alemania", "Curazao", "Costa de Marfil", "Ecuador"},
        {"Países Bajos", "Japón", "Suecia", "Túnez"},
        {"Bélgica", "Egipto", "Irán", "Nueva Zelanda"},
        {"España", "Cabo Verde", "Arabia Saudita", "Uruguay"},
        {"Francia", "Senegal", "Irak", "Noruega"},
        {"Argentina", "Argelia", "Austria", "Jordania"},
        {"Portugal", "RD Congo", "Uzbekistán", "Colombia"},
        {"Inglaterra", "Croacia", "Ghana", "Panamá"}
    };

    // Descriptor de cada bandera:
    // {país, base, color1, color2, color3, adorno1, colorAdorno1, adorno2, colorAdorno2}
    static String[][] BANDERAS = {
        {"México", "V3", "VERDE", "BLANCO", "ROJO", "EMB", "AMARILLO", "NADA", ""},
        {"Sudáfrica", "H2", "ROJO", "AZUL", "", "BANDAH", "VERDE", "TRI", "NEGRO"},
        {"Corea del Sur", "LISO", "BLANCO", "", "", "TAEGUK", "", "TRIGRAMAS", "NEGRO"},
        {"Chequia", "H2", "BLANCO", "ROJO", "", "TRI", "AZUL", "NADA", ""},

        {"Canadá", "V121", "ROJO", "BLANCO", "", "HOJA", "ROJO", "NADA", ""},
        {"Bosnia y Herzegovina", "LISO", "AZUL", "", "", "TRIB", "AMARILLO", "ESTRELLASB", "BLANCO"},
        {"Catar", "LISO", "GRANATE", "", "", "SIERRA", "BLANCO", "NADA", ""},
        {"Suiza", "LISO", "ROJO", "", "", "CRUZS", "BLANCO", "NADA", ""},

        {"Brasil", "LISO", "VERDE", "", "", "ROMBO", "AMARILLO", "DISCOP", "AZUL"},
        {"Marruecos", "LISO", "ROJO", "", "", "ESTRELLA", "VERDE", "NADA", ""},
        {"Haití", "H2", "AZUL", "ROJO", "", "EMB", "BLANCO", "NADA", ""},
        {"Escocia", "LISO", "AZUL", "", "", "ASPA", "BLANCO", "NADA", ""},

        {"Estados Unidos", "RAYAS", "ROJO", "BLANCO", "", "CANTON", "AZUL", "NADA", ""},
        {"Paraguay", "H3", "ROJO", "BLANCO", "AZUL", "EMB", "VERDE", "NADA", ""},
        {"Australia", "LISO", "AZUL", "", "", "UNION", "", "ESTRELLAS", "BLANCO"},
        {"Turquía", "LISO", "ROJO", "", "", "MEDIALUNA", "BLANCO", "ESTRELLAD", "BLANCO"},

        {"Alemania", "H3", "NEGRO", "ROJO", "AMARILLO", "NADA", "", "NADA", ""},
        {"Curazao", "LISO", "AZUL", "", "", "FRANJAB", "AMARILLO", "PUNTOS", "BLANCO"},
        {"Costa de Marfil", "V3", "NARANJA", "BLANCO", "VERDE", "NADA", "", "NADA", ""},
        {"Ecuador", "H211", "AMARILLO", "AZUL", "ROJO", "EMB", "NARANJA", "NADA", ""},

        {"Países Bajos", "H3", "ROJO", "BLANCO", "AZUL", "NADA", "", "NADA", ""},
        {"Japón", "LISO", "BLANCO", "", "", "DISCO", "ROJO", "NADA", ""},
        {"Suecia", "LISO", "AZUL", "", "", "NORDICA", "AMARILLO", "NADA", ""},
        {"Túnez", "LISO", "ROJO", "", "", "DISCOP", "BLANCO", "ESTRELLA", "ROJO"},

        {"Bélgica", "V3", "NEGRO", "AMARILLO", "ROJO", "NADA", "", "NADA", ""},
        {"Egipto", "H3", "ROJO", "BLANCO", "NEGRO", "EMB", "AMARILLO", "NADA", ""},
        {"Irán", "H3", "VERDE", "BLANCO", "ROJO", "EMB", "ROJO", "NADA", ""},
        {"Nueva Zelanda", "LISO", "AZUL", "", "", "UNION", "", "ESTRELLAS", "ROJO"},

        {"España", "H121", "ROJO", "AMARILLO", "", "NADA", "", "NADA", ""},
        {"Cabo Verde", "LISO", "AZUL", "", "", "TRIFRANJA", "BLANCO", "ANILLO", "AMARILLO"},
        {"Arabia Saudita", "LISO", "VERDE", "", "", "ESCRITURA", "BLANCO", "NADA", ""},
        {"Uruguay", "RAYAS", "BLANCO", "AZUL", "", "CANTON", "BLANCO", "SOLC", "AMARILLO"},

        {"Francia", "V3", "AZUL", "BLANCO", "ROJO", "NADA", "", "NADA", ""},
        {"Senegal", "V3", "VERDE", "AMARILLO", "ROJO", "ESTRELLA", "VERDE", "NADA", ""},
        {"Irak", "H3", "ROJO", "BLANCO", "NEGRO", "ESCRITURAC", "VERDE", "NADA", ""},
        {"Noruega", "LISO", "ROJO", "", "", "NORDICA2", "BLANCO", "NADA", ""},

        {"Argentina", "H3", "CELESTE", "BLANCO", "CELESTE", "SOLP", "AMARILLO", "NADA", ""},
        {"Argelia", "V2", "VERDE", "BLANCO", "", "DISCOP", "ROJO", "ESTRELLA", "BLANCO"},
        {"Austria", "H3", "ROJO", "BLANCO", "ROJO", "NADA", "", "NADA", ""},
        {"Jordania", "H3", "NEGRO", "BLANCO", "VERDE", "TRI", "ROJO", "ESTRELLAH", "BLANCO"},

        {"Portugal", "V2P", "VERDE", "ROJO", "", "ESFERA", "AMARILLO", "NADA", ""},
        {"RD Congo", "LISO", "CELESTE", "", "", "DIAG", "ROJO", "NADA", ""},
        {"Uzbekistán", "H3", "CELESTE", "BLANCO", "VERDE", "NADA", "", "NADA", ""},
        {"Colombia", "H211", "AMARILLO", "AZUL", "ROJO", "NADA", "", "NADA", ""},

        {"Inglaterra", "LISO", "BLANCO", "", "", "CRUZ", "ROJO", "NADA", ""},
        {"Croacia", "H3", "ROJO", "BLANCO", "AZUL", "EMB", "ROJO", "NADA", ""},
        {"Ghana", "H3", "ROJO", "AMARILLO", "VERDE", "ESTRELLA", "NEGRO", "NADA", ""},
        {"Panamá", "PANAMA", "", "", "", "NADA", "", "NADA", ""}
    };

    // Fase de grupos: {local, visitante, grupo, fecha, hora (Colombia), sede}
    static String[][] PARTIDOS = {
        {"México", "Sudáfrica", "A", "11 de junio", "14:00", "Ciudad de México"},
        {"Corea del Sur", "Chequia", "A", "11 de junio", "21:00", "Guadalajara"},

        {"Canadá", "Bosnia y Herzegovina", "B", "12 de junio", "14:00", "Toronto"},
        {"Estados Unidos", "Paraguay", "D", "12 de junio", "20:00", "Los Ángeles"},

        {"Catar", "Suiza", "B", "13 de junio", "14:00", "San Francisco"},
        {"Brasil", "Marruecos", "C", "13 de junio", "17:00", "Nueva York/Nueva Jersey"},
        {"Haití", "Escocia", "C", "13 de junio", "20:00", "Boston"},
        {"Australia", "Turquía", "D", "13 de junio", "23:00", "Vancouver"},

        {"Alemania", "Curazao", "E", "14 de junio", "12:00", "Houston"},
        {"Países Bajos", "Japón", "F", "14 de junio", "15:00", "Dallas"},
        {"Costa de Marfil", "Ecuador", "E", "14 de junio", "18:00", "Filadelfia"},
        {"Suecia", "Túnez", "F", "14 de junio", "21:00", "Monterrey"},

        {"España", "Cabo Verde", "H", "15 de junio", "11:00", "Atlanta"},
        {"Bélgica", "Egipto", "G", "15 de junio", "14:00", "Seattle"},
        {"Arabia Saudita", "Uruguay", "H", "15 de junio", "17:00", "Miami"},
        {"Irán", "Nueva Zelanda", "G", "15 de junio", "20:00", "Los Ángeles"},

        {"Francia", "Senegal", "I", "16 de junio", "14:00", "Nueva York/Nueva Jersey"},
        {"Irak", "Noruega", "I", "16 de junio", "17:00", "Boston"},
        {"Argentina", "Argelia", "J", "16 de junio", "20:00", "Kansas City"},
        {"Austria", "Jordania", "J", "16 de junio", "23:00", "San Francisco"},

        {"Portugal", "RD Congo", "K", "17 de junio", "12:00", "Houston"},
        {"Inglaterra", "Croacia", "L", "17 de junio", "15:00", "Dallas"},
        {"Ghana", "Panamá", "L", "17 de junio", "18:00", "Toronto"},
        {"Uzbekistán", "Colombia", "K", "17 de junio", "21:00", "Ciudad de México"},

        {"Chequia", "Sudáfrica", "A", "18 de junio", "11:00", "Atlanta"},
        {"Suiza", "Bosnia y Herzegovina", "B", "18 de junio", "14:00", "Los Ángeles"},
        {"Canadá", "Catar", "B", "18 de junio", "17:00", "Vancouver"},
        {"México", "Corea del Sur", "A", "18 de junio", "20:00", "Guadalajara"},

        {"Estados Unidos", "Australia", "D", "19 de junio", "14:00", "Seattle"},
        {"Escocia", "Marruecos", "C", "19 de junio", "17:00", "Boston"},
        {"Brasil", "Haití", "C", "19 de junio", "20:00", "Filadelfia"},
        {"Turquía", "Paraguay", "D", "19 de junio", "23:00", "San Francisco"},

        {"Países Bajos", "Suecia", "F", "20 de junio", "12:00", "Houston"},
        {"Alemania", "Costa de Marfil", "E", "20 de junio", "15:00", "Toronto"},
        {"Ecuador", "Curazao", "E", "20 de junio", "19:00", "Kansas City"},
        {"Túnez", "Japón", "F", "20 de junio", "23:00", "Monterrey"},

        {"España", "Arabia Saudita", "H", "21 de junio", "11:00", "Atlanta"},
        {"Bélgica", "Irán", "G", "21 de junio", "14:00", "Los Ángeles"},
        {"Uruguay", "Cabo Verde", "H", "21 de junio", "17:00", "Miami"},
        {"Nueva Zelanda", "Egipto", "G", "21 de junio", "20:00", "Vancouver"},

        {"Argentina", "Austria", "J", "22 de junio", "12:00", "Dallas"},
        {"Francia", "Irak", "I", "22 de junio", "16:00", "Filadelfia"},
        {"Noruega", "Senegal", "I", "22 de junio", "19:00", "Nueva York/Nueva Jersey"},
        {"Jordania", "Argelia", "J", "22 de junio", "22:00", "San Francisco"},

        {"Portugal", "Uzbekistán", "K", "23 de junio", "12:00", "Houston"},
        {"Inglaterra", "Ghana", "L", "23 de junio", "15:00", "Boston"},
        {"Panamá", "Croacia", "L", "23 de junio", "18:00", "Toronto"},
        {"Colombia", "RD Congo", "K", "23 de junio", "21:00", "Guadalajara"},

        {"Suiza", "Canadá", "B", "24 de junio", "14:00", "Vancouver"},
        {"Bosnia y Herzegovina", "Catar", "B", "24 de junio", "14:00", "Seattle"},
        {"Escocia", "Brasil", "C", "24 de junio", "17:00", "Miami"},
        {"Marruecos", "Haití", "C", "24 de junio", "17:00", "Atlanta"},
        {"Chequia", "México", "A", "24 de junio", "20:00", "Ciudad de México"},
        {"Sudáfrica", "Corea del Sur", "A", "24 de junio", "20:00", "Monterrey"},

        {"Curazao", "Costa de Marfil", "E", "25 de junio", "15:00", "Filadelfia"},
        {"Ecuador", "Alemania", "E", "25 de junio", "15:00", "Nueva York/Nueva Jersey"},
        {"Japón", "Suecia", "F", "25 de junio", "18:00", "Dallas"},
        {"Túnez", "Países Bajos", "F", "25 de junio", "18:00", "Kansas City"},
        {"Turquía", "Estados Unidos", "D", "25 de junio", "21:00", "Los Ángeles"},
        {"Paraguay", "Australia", "D", "25 de junio", "21:00", "San Francisco"},

        {"Noruega", "Francia", "I", "26 de junio", "14:00", "Boston"},
        {"Senegal", "Irak", "I", "26 de junio", "14:00", "Toronto"},
        {"Cabo Verde", "Arabia Saudita", "H", "26 de junio", "19:00", "Houston"},
        {"Uruguay", "España", "H", "26 de junio", "19:00", "Guadalajara"},
        {"Egipto", "Irán", "G", "26 de junio", "22:00", "Seattle"},
        {"Nueva Zelanda", "Bélgica", "G", "26 de junio", "22:00", "Vancouver"},

        {"Panamá", "Inglaterra", "L", "27 de junio", "16:00", "Nueva York/Nueva Jersey"},
        {"Croacia", "Ghana", "L", "27 de junio", "16:00", "Filadelfia"},
        {"Colombia", "Portugal", "K", "27 de junio", "18:30", "Miami"},
        {"RD Congo", "Uzbekistán", "K", "27 de junio", "18:30", "Atlanta"},
        {"Argelia", "Austria", "J", "27 de junio", "21:00", "Kansas City"},
        {"Jordania", "Argentina", "J", "27 de junio", "21:00", "Dallas"}
    };


    // ============================================================
    // MENÚ PRINCIPAL
    // ============================================================

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println();
            System.out.println("      ___________      ");
            System.out.println("     '._==_==_=_.'     ");
            System.out.println("     .-\\:      /-.    ");
            System.out.println("    | (|:.     |) |    ");
            System.out.println("     '-|:.     |-'     ");
            System.out.println("       \\::.    /      ");
            System.out.println("        '::. .'        ");
            System.out.println("          ) (          ");
            System.out.println("        _.' '._        ");
            System.out.println("       '-------'       ");
            System.out.println("==============================================");
            System.out.println("          MUNDIAL DE FÚTBOL 2026");
            System.out.println("==============================================");
            System.out.println("1. Ver partidos");
            System.out.println("2. Ver tabla de posiciones");
            System.out.println("3. Ver banderas");
            System.out.println("4. Salir");
            System.out.println("==============================================");

            opcion = ConsoleInput.getInt("Seleccione una opción: ");

            switch (opcion) {

                case 1:
                    // Abrir el menú de partidos
                    Partidos.menu();
                    break;

                case 2:
                    // Mostrar tabla de posiciones
                    TablaPosiciones tabla = new TablaPosiciones();

                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("             TABLA DE POSICIONES");
                    System.out.println("==============================================");

                    tabla.mostrarTabla();

                    break;

                case 3:
                    // Mostrar menú de banderas
                    mostrarBanderas();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("     Gracias por utilizar el programa.");
                    System.out.println("==============================================");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 4);
    }


    // ============================================================
    // MENÚ DE BANDERAS (por grupos)
    // ============================================================

    public static void mostrarBanderas() {

        int opcion;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("                 BANDERAS");
            System.out.println("==============================================");

            for (int g = 0; g < GRUPOS.length; g++) {
                System.out.println((g + 1) + ". Grupo " + LETRAS[g] + ": "
                        + GRUPOS[g][0] + ", " + GRUPOS[g][1] + ", "
                        + GRUPOS[g][2] + ", " + GRUPOS[g][3]);
            }

            System.out.println("13. Volver");
            System.out.println("==============================================");

            opcion = ConsoleInput.getInt("Seleccione un grupo: ");

            switch (opcion) {

                case 1:
                    menuGrupoBanderas(0);
                    break;
                case 2:
                    menuGrupoBanderas(1);
                    break;
                case 3:
                    menuGrupoBanderas(2);
                    break;
                case 4:
                    menuGrupoBanderas(3);
                    break;
                case 5:
                    menuGrupoBanderas(4);
                    break;
                case 6:
                    menuGrupoBanderas(5);
                    break;
                case 7:
                    menuGrupoBanderas(6);
                    break;
                case 8:
                    menuGrupoBanderas(7);
                    break;
                case 9:
                    menuGrupoBanderas(8);
                    break;
                case 10:
                    menuGrupoBanderas(9);
                    break;
                case 11:
                    menuGrupoBanderas(10);
                    break;
                case 12:
                    menuGrupoBanderas(11);
                    break;

                case 13:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 13);
    }

    public static void menuGrupoBanderas(int g) {

        int opcion;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("            BANDERAS - GRUPO " + LETRAS[g]);
            System.out.println("==============================================");

            for (int k = 0; k < 4; k++) {
                System.out.println((k + 1) + ". " + GRUPOS[g][k]);
            }

            System.out.println("5. Volver");
            System.out.println("==============================================");

            opcion = ConsoleInput.getInt("Seleccione una bandera: ");

            switch (opcion) {

                case 1:
                    dibujarBandera(GRUPOS[g][0]);
                    break;
                case 2:
                    dibujarBandera(GRUPOS[g][1]);
                    break;
                case 3:
                    dibujarBandera(GRUPOS[g][2]);
                    break;
                case 4:
                    dibujarBandera(GRUPOS[g][3]);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);
    }


    // ============================================================
    // DIBUJAR UNA BANDERA (9 filas x 21 columnas, píxel = 2 espacios)
    // ============================================================

    public static void dibujarBandera(String pais) {

        // Buscar el descriptor del país en la matriz
        String[] d = null;

        for (int k = 0; k < BANDERAS.length; k++) {
            if (BANDERAS[k][0].equals(pais)) {
                d = BANDERAS[k];
            }
        }

        if (d == null) {
            System.out.println("No hay bandera para " + pais);
            return;
        }

        System.out.println();
        System.out.println(pais.toUpperCase());
        System.out.println();

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 21; j++) {

                // 1) color de fondo según la base de la bandera
                String celda = colorBase(d[1], d[2], d[3], d[4], i, j);

                // 2) primer adorno (si cubre esta celda, cambia el color)
                String extra = adorno(d[5], d[6], celda, i, j);
                if (extra != null) {
                    celda = extra;
                }

                // 3) segundo adorno
                extra = adorno(d[7], d[8], celda, i, j);
                if (extra != null) {
                    celda = extra;
                }

                System.out.print(color(celda) + "  ");
            }

            System.out.print(ConsoleColors.RESET);
            System.out.println();
        }
    }

    // Convierte el nombre del color en la constante de ConsoleColors
    public static String color(String nombre) {

        switch (nombre) {
            case "ROJO":     return ConsoleColors.RED_BACKGROUND;
            case "BLANCO":   return ConsoleColors.WHITE_BACKGROUND;
            case "AZUL":     return ConsoleColors.BLUE_BACKGROUND;
            case "VERDE":    return ConsoleColors.GREEN_BACKGROUND;
            case "AMARILLO": return ConsoleColors.YELLOW_BACKGROUND;
            case "NEGRO":    return ConsoleColors.BLACK_BACKGROUND;
            case "CELESTE":  return ConsoleColors.CYAN_BACKGROUND;
            case "NARANJA":  return ConsoleColors.ORANGE_BACKGROUND;
            case "GRANATE":  return ConsoleColors.PURPLE_BACKGROUND;
            default:         return ConsoleColors.WHITE_BACKGROUND;
        }
    }

    // Color de fondo de la celda (i = fila, j = columna)
    public static String colorBase(String base, String c1, String c2, String c3, int i, int j) {

        switch (base) {

            case "LISO":
                return c1;

            case "H2":
                if (i < 5) {
                    return c1;
                }
                return c2;

            case "H3":
                switch (i / 3) {
                    case 0:  return c1;
                    case 1:  return c2;
                    default: return c3;
                }

            case "H121":
                if (i < 2 || i > 6) {
                    return c1;
                }
                return c2;

            case "H211":
                if (i < 4) {
                    return c1;
                }
                if (i < 6) {
                    return c2;
                }
                return c3;

            case "V3":
                switch (j / 7) {
                    case 0:  return c1;
                    case 1:  return c2;
                    default: return c3;
                }

            case "V2":
                if (j < 10) {
                    return c1;
                }
                return c2;

            case "V2P":
                if (j < 8) {
                    return c1;
                }
                return c2;

            case "V121":
                if (j < 5 || j >= 16) {
                    return c1;
                }
                return c2;

            case "RAYAS":
                if (i % 2 == 0) {
                    return c1;
                }
                return c2;

            case "PANAMA":
                // Cuadrante blanco (arriba izquierda) con estrella azul
                if (i < 5 && j < 10) {
                    if ((i == 2 && j >= 4 && j <= 6) || (j == 5 && i >= 1 && i <= 3)) {
                        return "AZUL";
                    }
                    return "BLANCO";
                }
                // Cuadrante rojo (arriba derecha)
                if (i < 5) {
                    return "ROJO";
                }
                // Cuadrante azul (abajo izquierda)
                if (j < 10) {
                    return "AZUL";
                }
                // Cuadrante blanco (abajo derecha) con estrella roja
                if ((i == 6 && j >= 14 && j <= 16) || (j == 15 && i >= 5 && i <= 7)) {
                    return "ROJO";
                }
                return "BLANCO";

            default:
                return c1;
        }
    }

    // Adornos de la bandera: devuelve el color si cubre la celda, o null si no
    public static String adorno(String tipo, String c, String fondo, int i, int j) {

        int di = Math.abs(i - 4);    // distancia a la fila central
        int dj = Math.abs(j - 10);   // distancia a la columna central

        switch (tipo) {

            case "TRI":        // triángulo al lado izquierdo
                if (j <= 9 - 2 * di) {
                    return c;
                }
                break;

            case "TRIB":       // triángulo de Bosnia
                if (j >= 6 + (i * 9) / 8 && j <= 15) {
                    return c;
                }
                break;

            case "ESTRELLASB": // estrellas junto al triángulo de Bosnia
                if (i % 2 == 0 && j == 4 + (i * 9) / 8) {
                    return c;
                }
                break;

            case "EMB":        // escudo / emblema central
                if (i >= 3 && i <= 5 && j >= 9 && j <= 11) {
                    return c;
                }
                break;

            case "HOJA":       // hoja de arce
                if ((i >= 2 && i <= 6 && j >= 8 && j <= 12)
                        || ((i == 1 || i == 7) && j >= 9 && j <= 11)) {
                    return c;
                }
                break;

            case "ESTRELLA":   // estrella (cruz) central
                if ((i == 4 && dj <= 2) || (dj == 0 && di <= 2)) {
                    return c;
                }
                break;

            case "ESTRELLAH":  // estrella dentro del triángulo (Jordania)
                if ((i == 4 && j >= 1 && j <= 3) || (j == 2 && i >= 3 && i <= 5)) {
                    return c;
                }
                break;

            case "ESTRELLAD":  // estrella a la derecha (Turquía)
                if ((i == 4 && j >= 13 && j <= 15) || (j == 14 && i >= 3 && i <= 5)) {
                    return c;
                }
                break;

            case "DISCO":      // círculo grande central
                if ((i - 4) * (i - 4) + (j - 10) * (j - 10) <= 9) {
                    return c;
                }
                break;

            case "DISCOP":     // círculo pequeño central
                if ((i - 4) * (i - 4) + (j - 10) * (j - 10) <= 4) {
                    return c;
                }
                break;

            case "ESFERA":     // círculo sobre la unión de franjas (Portugal)
                if ((i - 4) * (i - 4) + (j - 8) * (j - 8) <= 4) {
                    return c;
                }
                break;

            case "MEDIALUNA":  // media luna: círculo blanco menos otro círculo
                if ((i - 4) * (i - 4) + (j - 10) * (j - 10) <= 6) {
                    return fondo;
                }
                if ((i - 4) * (i - 4) + (j - 8) * (j - 8) <= 9) {
                    return c;
                }
                break;

            case "CRUZ":       // cruz centrada de lado a lado
                if (i == 4 || j == 10) {
                    return c;
                }
                break;

            case "CRUZS":      // cruz suiza (brazos cortos)
                if ((j >= 9 && j <= 11 && i >= 1 && i <= 7)
                        || (i >= 3 && i <= 5 && j >= 7 && j <= 13)) {
                    return c;
                }
                break;

            case "NORDICA":    // cruz nórdica (desplazada a la izquierda)
                if ((i >= 3 && i <= 5) || (j >= 5 && j <= 7)) {
                    return c;
                }
                break;

            case "NORDICA2":   // cruz nórdica con borde azul (Noruega)
                if (i == 4 || j == 6) {
                    return "AZUL";
                }
                if ((i >= 3 && i <= 5) || (j >= 5 && j <= 7)) {
                    return c;
                }
                break;

            case "ASPA":       // cruz diagonal (Escocia)
                if (Math.abs(dj - 2.5 * di) <= 1.2) {
                    return c;
                }
                break;

            case "ROMBO":      // rombo (Brasil)
                if (dj <= 9 - 2 * di) {
                    return c;
                }
                break;

            case "CANTON":     // rectángulo arriba a la izquierda
                if (i < 5 && j < 9) {
                    return c;
                }
                break;

            case "UNION":      // canton tipo Union Jack (Australia y Nueva Zelanda)
                if (i < 5 && j < 10) {
                    if (i == 2 || j == 4 || j == 5) {
                        return "ROJO";
                    }
                    if (j == 2 * i || j == 9 - 2 * i) {
                        return "BLANCO";
                    }
                    return "AZUL";
                }
                break;

            case "ESTRELLAS":  // Cruz del Sur
                if ((i == 2 && j == 15) || (i == 4 && j == 18)
                        || (i == 6 && j == 15) || (i == 4 && j == 12)) {
                    return c;
                }
                break;

            case "BANDAH":     // banda horizontal que se abre (Sudáfrica)
                if (i == 4 || (i >= 3 && i <= 5 && j >= 8)) {
                    return c;
                }
                break;

            case "SIERRA":     // borde dentado a la izquierda (Catar)
                if (j < 5 + (i % 2)) {
                    return c;
                }
                break;

            case "TAEGUK":     // círculo rojo y azul (Corea del Sur)
                if ((i - 4) * (i - 4) + (j - 10) * (j - 10) <= 9) {
                    if (i < 4) {
                        return "ROJO";
                    }
                    return "AZUL";
                }
                break;

            case "TRIGRAMAS":  // bloques negros en las esquinas (Corea del Sur)
                if ((i <= 1 || i >= 7) && (j <= 2 || j >= 18)) {
                    return c;
                }
                break;

            case "FRANJAB":    // franja horizontal baja (Curazao)
                if (i == 6) {
                    return c;
                }
                break;

            case "PUNTOS":     // dos estrellas arriba a la izquierda (Curazao)
                if ((i == 1 && j == 2) || (i == 3 && j == 5)) {
                    return c;
                }
                break;

            case "TRIFRANJA":  // blanco-rojo-blanco (Cabo Verde)
                if (i == 6) {
                    return "ROJO";
                }
                if (i == 5 || i == 7) {
                    return c;
                }
                break;

            case "ANILLO":     // círculo de estrellas (Cabo Verde)
                double anillo = ((i - 6) * (i - 6) + (j - 7) * (j - 7)) / 4.0;
                if (anillo >= 0.7 && anillo <= 1.4 && (i + j) % 2 == 0) {
                    return c;
                }
                break;

            case "ESCRITURA":  // texto y espada (Arabia Saudita)
                if ((i == 3 && j >= 4 && j <= 16 && j % 2 == 0)
                        || (i == 6 && j >= 4 && j <= 16)) {
                    return c;
                }
                break;

            case "ESCRITURAC": // texto central (Irak)
                if (i == 4 && j >= 6 && j <= 14 && j % 2 == 0) {
                    return c;
                }
                break;

            case "SOLP":       // sol pequeño (Argentina)
                if ((i == 4 && j >= 9 && j <= 11) || (j == 10 && i >= 3 && i <= 5)) {
                    return c;
                }
                break;

            case "SOLC":       // sol en el canton (Uruguay)
                if (i >= 1 && i <= 3 && j >= 3 && j <= 5) {
                    return c;
                }
                break;

            case "DIAG":       // banda diagonal (RD Congo)
                double dist = Math.abs(j - 2.5 * (8 - i));
                if (dist <= 1.5) {
                    return c;
                }
                if (dist <= 3.0) {
                    return "AMARILLO";
                }
                break;

            default:           // "NADA"
                break;
        }

        return null;
    }
}


// ============================================================
// PARTIDOS
// ============================================================

class Partidos {

    public static void menu() {

        int opcion;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("                  PARTIDOS");
            System.out.println("==============================================");

            for (int g = 0; g < Mundial.GRUPOS.length; g++) {
                System.out.println((g + 1) + ". Grupo " + Mundial.LETRAS[g] + ": "
                        + Mundial.GRUPOS[g][0] + ", " + Mundial.GRUPOS[g][1] + ", "
                        + Mundial.GRUPOS[g][2] + ", " + Mundial.GRUPOS[g][3]);
            }

            System.out.println("13. Volver");
            System.out.println("==============================================");

            opcion = ConsoleInput.getInt("Seleccione un grupo: ");

            switch (opcion) {

                case 1:
                    menuGrupo(0);
                    break;
                case 2:
                    menuGrupo(1);
                    break;
                case 3:
                    menuGrupo(2);
                    break;
                case 4:
                    menuGrupo(3);
                    break;
                case 5:
                    menuGrupo(4);
                    break;
                case 6:
                    menuGrupo(5);
                    break;
                case 7:
                    menuGrupo(6);
                    break;
                case 8:
                    menuGrupo(7);
                    break;
                case 9:
                    menuGrupo(8);
                    break;
                case 10:
                    menuGrupo(9);
                    break;
                case 11:
                    menuGrupo(10);
                    break;
                case 12:
                    menuGrupo(11);
                    break;

                case 13:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 13);
    }

    public static void menuGrupo(int g) {

        int opcion;

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("            PARTIDOS - GRUPO " + Mundial.LETRAS[g]);
            System.out.println("==============================================");

            for (int k = 0; k < 4; k++) {
                System.out.println((k + 1) + ". " + Mundial.GRUPOS[g][k]);
            }

            System.out.println("5. Volver");
            System.out.println("==============================================");

            opcion = ConsoleInput.getInt("Seleccione un país: ");

            switch (opcion) {

                case 1:
                    mostrarPartidosDe(Mundial.GRUPOS[g][0]);
                    break;
                case 2:
                    mostrarPartidosDe(Mundial.GRUPOS[g][1]);
                    break;
                case 3:
                    mostrarPartidosDe(Mundial.GRUPOS[g][2]);
                    break;
                case 4:
                    mostrarPartidosDe(Mundial.GRUPOS[g][3]);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);
    }

    // Muestra la bandera y recorre la matriz con los partidos del país elegido
    public static void mostrarPartidosDe(String pais) {

        // Bandera del país
        Mundial.dibujarBandera(pais);

        System.out.println();
        System.out.println("==============================================");
        System.out.println("  PARTIDOS DE " + pais.toUpperCase());
        System.out.println("==============================================");

        for (int i = 0; i < Mundial.PARTIDOS.length; i++) {

            String[] p = Mundial.PARTIDOS[i];

            if (p[0].equals(pais) || p[1].equals(pais)) {

                System.out.println(p[0] + " vs " + p[1] + "  (Grupo " + p[2] + ")");
                System.out.println("  Fecha: " + p[3] + " de 2026");
                System.out.println("  Hora:  " + p[4] + " (hora de Colombia)");
                System.out.println("  Sede:  " + p[5]);
                System.out.println("----------------------------------------------");
            }
        }
    }
}


// ============================================================
// ENTRADA POR CONSOLA
// ============================================================

class ConsoleInput {

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static int getInt(String mensaje) {

        int numero = 0;
        boolean valido = false;

        while (!valido) {

            System.out.print(mensaje);
            String texto = sc.nextLine().trim();

            try {
                numero = Integer.parseInt(texto);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero.");
            }
        }

        return numero;
    }
}


// ============================================================
// COLORES DE FONDO (códigos ANSI)
// ============================================================

class ConsoleColors {

    public static final String RESET             = "\u001B[0m";
    public static final String BLACK_BACKGROUND  = "\u001B[40m";
    public static final String RED_BACKGROUND    = "\u001B[41m";
    public static final String GREEN_BACKGROUND  = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND   = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND   = "\u001B[46m";
    public static final String WHITE_BACKGROUND  = "\u001B[47m";
    public static final String ORANGE_BACKGROUND = "\u001B[48;5;208m";
}


// ============================================================
// TABLA DE POSICIONES (versión simple por grupos)
// ============================================================

class TablaPosiciones {

    public void mostrarTabla() {

        for (int g = 0; g < Mundial.GRUPOS.length; g++) {

            System.out.println();
            System.out.println("GRUPO " + Mundial.LETRAS[g]);
            System.out.println("Selección              PJ  PG  PE  PP  Pts");

            for (int k = 0; k < 4; k++) {

                String nombre = Mundial.GRUPOS[g][k];

                // Rellenar con espacios para alinear las columnas
                while (nombre.length() < 22) {
                    nombre = nombre + " ";
                }

                System.out.println(nombre + " 0   0   0   0   0");
            }
        }
    }
}

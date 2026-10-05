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


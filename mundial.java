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


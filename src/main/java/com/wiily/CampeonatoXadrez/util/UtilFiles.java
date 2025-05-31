package com.wiily.CampeonatoXadrez.util;

public class UtilFiles {

    //| Data
    public static String DataDir = "src/main/resources/data/";
    public static String IdData = "src/main/resources/data/id.json";
    public static String PlayersPath = "src/main/resources/data/players.json";

    //| MENUS
    public static String mainMenu = """
            \u001B[35m+-------------------------------------------------------------+
            \u001B[35m|                     \u001B[37mCAMPEONATO DE XADREZ                    \u001B[35m|
            \u001B[35m|                        \u001B[37mMENU PRINCIPAL                       \u001B[35m|
            \u001B[35m+-------------------------------------------------------------+
            \u001B[35m|                                                             \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m1\u001B[34m] \u001B[36mInspecionar jogador                                   \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m2\u001B[34m] \u001B[36mEstatísticas do Campeonato                            \u001B[35m|
            \u001B[35m|                                                             \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m0\u001B[34m] \u001B[36mAcessar menu de administração                         \u001B[35m|
            \u001B[35m|                                                             \u001B[35m|
            \u001B[35m+-------------------------------------------------------------+
            \u001B[0m""";
    public static String admMenu = """
            \u001B[35m+------------------------------------------------------------+
            \u001B[35m|           \u001B[37mCAMPEONATO DE XADREZ - MENU DE ADMINISTRAÇÃO     \u001B[35m|
            \u001B[35m+------------------------------------------------------------+
            \u001B[35m|                                                            |
            \u001B[35m|   \u001B[34m[\u001B[37m1\u001B[34m] \u001B[36mGerenciar participantes                              \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m2\u001B[34m] \u001B[36mIniciar campeonato                                   \u001B[35m|
            \u001B[35m|                                                            |
            \u001B[35m+------------------------------------------------------------+
            \u001B[0m""";
    public static String header = """
            \u001B[35m+------------------------------------------------------------+
            \u001B[35m|        \u001B[37mCAMPEONATO DE XADREZ - GERENCIAMENTO DE JOGADORES   \u001B[35m|
            \u001B[35m+------------------------------------------------------------+
            \u001B[0m""";

    public static String selectOptions = """
            \u001B[35m|   \u001B[36m- Cadastro de Jogadores                                  \u001B[35m|
            \u001B[35m|                                                            |
            \u001B[35m|   \u001B[34m[\u001B[37m1\u001B[34m] \u001B[36mAdicionar jogador                                    \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m2\u001B[34m] \u001B[36mRemover jogador                                      \u001B[35m|
            \u001B[35m|   \u001B[34m[\u001B[37m0\u001B[34m] \u001B[36mVoltar ao menu principal                             \u001B[35m|
            \u001B[35m+------------------------------------------------------------+
            \u001B[0m""";
    //| Colors
    public static String resetColor = "\u001B[0m";
    public static String redColor = "\u001B[31m";
    public static String yellowColor = "\u001B[33m";
}

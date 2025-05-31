package com.wiily.CampeonatoXadrez.database;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiily.CampeonatoXadrez.model.Player;
import com.wiily.CampeonatoXadrez.model.PlayerGameStyle;
import com.wiily.CampeonatoXadrez.model.PlayerLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.wiily.CampeonatoXadrez.util.UtilFiles.*;

public class Data implements iData{
    ObjectMapper mapper = new ObjectMapper();
    IdData id = new IdData();
    File idFile = new File(IdData);
    public void createPlayerData(String name, String level, String gameStyle) throws IOException {
        String playerLevel = "";
        String playerStyle = "";
        switch (level.toLowerCase()) {
            case "iniciante" -> playerLevel = PlayerLevel.INICIANTE.toString();
            case "intermediario" -> playerLevel = PlayerLevel.INTERMEDIARIO.toString();
            case "avançado" -> playerLevel = PlayerLevel.AVANCADO.toString();
        }
        switch (gameStyle.toLowerCase()) {
            case "agressivo" -> playerStyle = PlayerGameStyle.AGRESSIVO.toString();
            case "defensivo" -> playerStyle = PlayerGameStyle.DEFENSIVO.toString();
            case "equilibrado" -> playerStyle = PlayerGameStyle.EQUILIBRADO.toString();
        }

        Player player = new Player(name, playerLevel, playerStyle, id.getId());

        saveData(PlayersPath, player);
    }
    @Override
    public <T> void saveData(String path, T object) {
        File file = new File(path);
        List<T> list = new ArrayList<>();
        while(true) {
            try {
                if (file.exists()) {
                    list = mapper.readValue(file, new TypeReference<>() {
                    });
                    list.add(object);
                    mapper.writerWithDefaultPrettyPrinter()
                            .writeValue(file, list);
                    for (T u : list) {
                        System.out.println(u);
                    }
                    break;
                } else {
                    list.add(object);
                    mapper.writerWithDefaultPrettyPrinter()
                            .writeValue(file, list);
                    break;
                }
            } catch (FileNotFoundException e) {
                createDataDir();
            } catch (Exception e) {
                System.out.println(redColor + "Erro ao salvar JSON");
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public <T> void createDataDir() {
        System.out.println(yellowColor + "Diretório nao localizado. Criando diretório..." + resetColor);
        File dataDir = new File(DataDir);
        boolean dirCreated = dataDir.mkdir();
        if (dirCreated) {
            System.out.println(yellowColor + "Diretório criado, tentando salvar arquivo." + resetColor);
        } else {
            System.out.println(redColor + "Erro ao criar diretório! Tente criar manualmente!" + resetColor);
        }
    }
}

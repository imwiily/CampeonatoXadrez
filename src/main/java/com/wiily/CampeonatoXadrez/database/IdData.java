package com.wiily.CampeonatoXadrez.database;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wiily.CampeonatoXadrez.model.Id;

import java.io.File;
import java.io.IOException;

import static com.wiily.CampeonatoXadrez.util.UtilFiles.IdData;
public class IdData {
    ObjectMapper mapper = new ObjectMapper();
    File file = new File(IdData);
    public int getId() throws IOException {
        if (file.exists()) {
            Id id = mapper.readValue(file, Id.class);
            int intId = id.id();
            int newId = updateId();
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(file, new Id(newId));
            return intId;
        } else createIdFile(); return 0;

    }
    public int updateId() throws IOException {
        Id id = mapper.readValue(file, Id.class);
        int intId = id.id() + 1;
        System.out.println("Id atualiado");
        return intId;
    }
    public void createIdFile() {
        Id id = new Id(0);
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(file, id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

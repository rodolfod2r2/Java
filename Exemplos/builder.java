package br.com.conductor.jarvis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProcuderOutPut {

    public static void main(String[] args) {

        Path path = Paths.get("C://do/txt.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        String fileName = "txt.txt";
        ClassLoader classLoader = ProcuderOutPut.class.getClassLoader();

        File file = new File(classLoader.getResource(fileName).getFile());

        System.out.println("File Found : " + file.exists());

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, utf8)) {
            for (int i = 1; i <= 100; i++) {
                bufferedWriter.write("testando " + i);
                bufferedWriter.write(" ");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //string json
        String json_str = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":1998, \"genero\":\"Ficção\"}";

        //instancia um novo JSONObject passando a string como entrada
        JSONObject my_obj = new JSONObject(json_str);

        //recupera campo por campo com o método get() e imprime cada um
        String titulo = my_obj.getString("titulo");
        Integer ano = my_obj.getInt("ano");
        String genero = my_obj.getString("genero");

        System.out.println("titulo: " + titulo);
        System.out.println("ano: " + ano);
        System.out.println("genero: " + genero);

        StringBuilder loadText = new StringBuilder();
        loadText.append("header");
        loadText.append("full");
        System.out.print(loadText);
    }
}

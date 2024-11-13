package org.example;

import org.example.entity.body;
import org.example.entity.document;
import org.example.entity.paragraph.property.hyperlink;
import org.example.entity.paragraph.property.numPr;
import org.example.entity.paragraph.t;
import org.example.entity.table.tbl;
import org.example.entity.table.tr;
import org.example.entity.table.tc;
import org.example.entity.paragraph.r;
import org.simpleframework.xml.core.Persister;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestTable {
    public static void main(String[] args) throws Exception {
        List<String> nodes = new ArrayList<>();
        String xml = "";

        String zipFilePath = "s.docx";
        String fileNameToRead = "word/document.xml"; // Укажите имя файла, который нужно прочитать из ZIP

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                if (entry.getName().equals(fileNameToRead)) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(zipInputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        xml = line;
                    }
                    break; // Выйти из цикла после чтения целевого файла
                }
            }
            zipInputStream.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        xml = xml.replaceAll("r:", "");
//        xml = xml.replaceAll("xml:", "");
//        xml = xml.replaceAll("w:", "");
//        xml = xml.replaceAll("<w:", "<");
//        xml = xml.replaceAll("</w:", "</");

        StringReader reader = new StringReader(xml);
        Persister serializer = new Persister();

        document text = serializer.read(document.class, reader, false);

        for (body b : text.body) {
            if (b.p != null) {
                System.out.println(b.p);
            }

            if (b.tbl != null) {
                for (tbl tbl : b.tbl) {
                    for (tr t : tbl.tr) {
                        if (t.tc != null) {
                            for (tc tc : t.tc) {
                                if (tc.p != null) {
                                    for (r r : tc.p.r) {
                                        if (r.t != null) {
                                            System.out.print('\t' + r.t.text);
                                        }
                                    }
                                }
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }


    }
}

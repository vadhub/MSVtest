package org.example;


import org.example.entity.*;
import org.example.entity.paragraph.*;
import org.example.entity.paragraph.property.hyperlink;
import org.example.entity.paragraph.property.numPr;
import org.simpleframework.xml.core.Persister;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        String zipFilePath = "lab6.docx";
        String fileNameToRead = "word/document.xml"; // Укажите имя файла, который нужно прочитать из ZIP
        String xml = "";

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

//        xml = xml.replaceAll("r:", "");
//        xml = xml.replaceAll("xml:", "");
//        xml = xml.replaceAll("w:", "");
//        xml = xml.replaceAll("<w:", "<");
//        xml = xml.replaceAll("</w:", "</");

        StringReader reader = new StringReader(xml);
        Persister serializer = new Persister();

        document text = serializer.read(document.class, reader, false);

//
//        for (body: text.body) {
//            if (p.r != null) {
//                hyperlink hyperlink = p.hyperlink;
//                numPr numPr = p.pPr.numPr;
//                String mark = "";
//                if (hyperlink != null) {
//                    System.out.println(hyperlink.r.t.text);
//                }
//                if (numPr != null) {
//                    mark = "\t- ";
//                }
//                for (org.example.entity.paragraph.r r : p.r) {
//                    t t = r.t;
//                    if (t != null) {
//                        System.out.println(mark + t.text);
//                    }
//                }
//            }
//        }

//        System.out.println(text);

//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        StringWriter stringWriter = new StringWriter();
//
//        pPr property = new pPr(new pStyle("1"), new bidi("2"), new jc("3"));
//        r text1 = new r(new t(null, "1"));
//        r text2 = new r(new t("preserve", "2"));
//        p p = new p(List.of(text1, text2), property);
//        marshaller.marshal(p, stringWriter);
//        System.out.println(stringWriter);

    }
}
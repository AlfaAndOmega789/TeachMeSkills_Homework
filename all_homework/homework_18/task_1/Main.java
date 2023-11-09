package all_homework.homework_18.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        Document doc;
        try {
            doc = buildDocument();
        }catch (Exception e){
            System.out.println("Open parsing error " + e.toString());
            return;
        }

        Node sonnetNode = doc.getFirstChild();

        NodeList sonnetChilds = sonnetNode.getChildNodes();

        String mainTitle = null;
        Node authorNode = null;
        Node linesNode = null;

        for(int i = 0; i < sonnetChilds.getLength(); i++){

            if(sonnetChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            switch(sonnetChilds.item(i).getNodeName()){
                case "author": {
                    authorNode = sonnetChilds.item(i);
                }
                break;
                case "title": {
                    mainTitle = sonnetChilds.item(i).getTextContent();
                    System.out.println("title " + mainTitle);
                }
                break;
                case "lines":{
                    linesNode = sonnetChilds.item(i);
                }
                break;
            }
        }

        if(authorNode == null){
            return;
        }

        NodeList authorChilds = authorNode.getChildNodes();

        String lastName = null;
        String firstName = null;
        for(int i = 0; i < authorChilds.getLength(); i++) {

            if (authorChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (authorChilds.item(i).getNodeName()){
                case "lastName":{
                    lastName = authorChilds.item(i).getTextContent();
                    System.out.println(lastName);
                }
                break;
                case "firstName":{
                    firstName = authorChilds.item(i).getTextContent();
                    System.out.println(firstName);
                }
                break;
            }
        }

        if(linesNode == null){
            return;
        }

        NodeList linesChilds = linesNode.getChildNodes();
        List<String> list = new ArrayList<>();

        for(int i = 0;i < linesChilds.getLength();i++){

            if (linesChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            if(linesChilds.item(i).getNodeName().equals("line")){
                list.add(linesChilds.item(i).getTextContent());
            }
        }
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        writeInfoInFile(list, createFileName(firstName,lastName,mainTitle));


        }

    public static void writeInfoInFile(List<String> list, File file) throws IOException{

           try(BufferedWriter  writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8))){
               for(String str : list){
                writer.write(str);
                writer.newLine();}
           }catch (IOException e) {
                throw new RuntimeException(e);
           }
       }

    public static File createFileName(String firstName, String lastName, String title){
        File file  = new File(firstName + "_" +lastName + "_" + title + ".txt");
        return file;
    }

    private static Document buildDocument() throws Exception{
        File file = new File("C:\\Projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_18\\task_1\\someFile.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(file);
    }
}



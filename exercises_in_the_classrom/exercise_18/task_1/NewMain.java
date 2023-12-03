package exercises_in_the_classrom.exercise_18.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class NewMain {
    public static void main(String[] args) {
        Document doc = null;

        NodeList authorList =  doc.getElementsByTagName("author");
        for(int i = 0; i < authorList.getLength(); i++){
            Node s =authorList.item(i);

            if(s.getNodeType() == Node.ELEMENT_NODE){
//                Element author = s;
            }
        }
    }


    private static Document buildDocument() throws Exception{
        File file = new File("C:\\Users\\ivank\\IdeaProjects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_18\\task_1\\someFile.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(file);
    }
}

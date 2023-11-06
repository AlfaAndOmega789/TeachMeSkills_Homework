package exercises_in_the_classrom.exercise_18.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        Sonnet sonnet = new Sonnet();

        Document doc = null;
        try {
            doc = buildDocument();
        }catch (Exception e){
            System.out.println("Open parsing error " + e.toString());
            return;
        }

        Node sonnetNode = doc.getFirstChild();

        NodeList sonnetChilds = sonnetNode.getChildNodes();
        String title = null;

        for(int i = 0; i < sonnetChilds.getLength(); i++){

            if(sonnetChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            System.out.println("AAA " + sonnetChilds.item(i).getNodeName());
        }
    }

    private static Document buildDocument() throws Exception{
        File file = new File("C:\\Users\\ivank\\IdeaProjects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_18\\task_1\\someFile.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(file);
    }
}



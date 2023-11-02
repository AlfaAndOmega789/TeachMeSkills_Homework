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
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("C:\\projects\\TeachMeSkills_Homework\\exercises_in_the_classrom\\exercise_18\\task_1\\someFile.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder(); //создаем наш парсер
        Document document = builder.parse(file); // работаем с файлом, передаем его

//        NodeList sonetElement = document.getElementsByTagName("sonet"); // достаем элемент, приведение нужно, потому что возвращает Node

        Node root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for(int i = 0;  i < nodeList.getLength(); i++){
            Node element  = nodeList.item(i);

            if(element.getNodeType() != Node.TEXT_NODE){
                NodeList elementProp = element.getChildNodes();
                System.out.println(elementProp.item(i).getTextContent());
//                for(int j = 0; j < elementProp.getLength(); j++){
//                    Node newElementProp = elementProp.item(i);
//                    System.out.println(newElementProp.getTextContent());
//                }
            }


        }

//        String type = sonetElement.item(0).getAttributes().getNamedItem("type").getTextContent(); // здесь лежит Shakespearean
//        System.out.println(type);
//
//        NodeList authorNodeList = document.getElementsByTagName("author");

//        List<Author> authorList = new ArrayList<>();
//
//        for(int i = 0; i < authorNodeList.getLength(); i++){
//            if(authorNodeList.item(i).getNodeType() == Node.ELEMENT_NODE){
//                Element authorElement = (Element) authorNodeList.item(i);
//
//                Author author = new Author();
//
//            }
//        }
    }
}
class Author{
    private String lastName;
    private String firstName;
    private String nationality;
    private Integer yearOfBirth;
    private Integer yearOfDeath;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(Integer yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}

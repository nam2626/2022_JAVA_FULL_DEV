package read;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLFileReader {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("app.xml");
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(fis);
			document.getDocumentElement().normalize();
			
			NodeList tagList = document.getElementsByTagName("record");
			System.out.println(tagList.getLength());
			System.out.println(tagList.item(0).getChildNodes().getLength());
			NodeList childList = tagList.item(0).getChildNodes();
			for(int i=0;i<childList.getLength();i++) {
				System.out.println(childList.item(i).getNodeName()
						+ "," + childList.item(i).getTextContent());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

}










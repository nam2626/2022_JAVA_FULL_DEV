package read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLFileReader3 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("app_card.xml");
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(fis);
			document.getDocumentElement().normalize();
			
			NodeList node = document.getElementsByTagName("record");
			for(int i=0;i<node.getLength();i++) {
				NodeList childNodes = node.item(i).getChildNodes();
				CardVO vo = null;
				vo = new CardVO(childNodes);
				if(vo.getCardType().equals("americanexpress") && vo.getPrice() >= 2000 && vo.getPrice() < 4000 )
					System.out.println(vo.toString());
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}








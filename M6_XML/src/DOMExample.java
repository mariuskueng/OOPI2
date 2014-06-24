import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class DOMExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName= "Person.xml";
		try {
			DocumentBuilderFactory bf = DocumentBuilderFactory.newInstance();
			bf.setValidating(false); // Default is false
			DocumentBuilder db = bf.newDocumentBuilder();
			ErrorHandler h = new MyErrorHandler();
	        db.setErrorHandler(h);
			Document doc = db.parse(new File(fileName));
			
			//U4
			getContent(doc);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void getContent(Node next){
		NodeList list= next.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getChildNodes().getLength() > 1) {
				System.out.println(list.item(i).getNodeName());
				getContent(list.item(i));
			}
			else if (list.item(i).getChildNodes().getLength() == 1) {
				System.out.println(next.getTextContent());
				getAttributes(next);
			}
			
		}
	}

	private static void getAttributes(Node n) {
		if (n.hasAttributes()) {
			NamedNodeMap nnm= n.getAttributes();
			for (int i = 0; i < nnm.getLength(); i++) {
				System.out.println(nnm.item(i).getNodeName() + ": " + nnm.item(i).getNodeValue());
			}
		}
	}
	
	 private static class MyErrorHandler implements ErrorHandler {
	      public void warning(SAXParseException e) throws SAXException {
	         System.out.println("Warning: "); 
	         printInfo(e);
	      }
	      public void error(SAXParseException e) throws SAXException {
	         System.out.println("Error: "); 
	         printInfo(e);
	      }
	      public void fatalError(SAXParseException e) throws SAXException {
	         System.out.println("Fattal error: "); 
	         printInfo(e);
	      }
	      private void printInfo(SAXParseException e) {
	      	 System.out.println("   Public ID: "+e.getPublicId());
	      	 System.out.println("   System ID: "+e.getSystemId());
	      	 System.out.println("   Line number: "+e.getLineNumber());
	      	 System.out.println("   Column number: "+e.getColumnNumber());
	      	 System.out.println("   Message: "+e.getMessage());
	      }
	   }
}

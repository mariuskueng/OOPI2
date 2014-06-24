import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class MeinHandler extends DefaultHandler{
	String currentTag = new String();
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String text= new String(ch, start, length); 
		System.out.println("Text in "+currentTag+": "+text);

	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("EndTag </"+qName+">");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		System.out.println("StartTag </"+qName+">");
		for (int i = 0; i < atts.getLength(); i++) {
			System.out.println(atts.getLocalName(i)+": "+atts.getValue(i));
		}
		currentTag = qName;
	}

}

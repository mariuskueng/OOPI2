import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.helpers.DefaultHandler;

public class MeinParser {
	public static void main(String[] args) throws SAXException, IOException {
		String fileName = "Person.xml";
		SAXParserFactory pf = SAXParserFactory.newInstance();
		try {
			SAXParser parser = pf.newSAXParser();
			DefaultHandler handler = new MeinHandler();
			parser.parse(new File(fileName), handler);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
}

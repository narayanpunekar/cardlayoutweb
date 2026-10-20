package com.webapp.webdmi.platform;

//import static java.lang.System.out;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author narayan.punekar@yahoo.com
 */
public class clsXmlTraverser {
    private static final Logger log = Logger.getLogger(clsXmlTraverser.class.getName());
    
    static List<Node> lstNodes = new ArrayList<Node>();
    static Map mapNodes = new HashMap();

    public static Document fnLoadXml(String strFilename) {
        DocumentBuilderFactory dbFactory = null;
        DocumentBuilder documentBuilder = null;
        Document xmlDocument = null;
        File xmlFile = null;
        
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = dbFactory.newDocumentBuilder();
            xmlFile = new File(strFilename);
            xmlDocument = documentBuilder.parse(xmlFile);
        } catch (ParserConfigurationException pcex) {
            pcex.printStackTrace();
        } catch (SAXException saxex) {
            saxex.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return xmlDocument;
    }

    public static void fnTraverseNode(Node node) {
        NodeList nodelistChildren = null;
        Node nodeChild = null;

        log.info(node.getNodeName() + " gNN ");
        lstNodes.add(node);
        mapNodes.put(node, node);
        if(node.hasChildNodes()) {
            nodelistChildren = node.getChildNodes();
            for (int i=0; i<nodelistChildren.getLength(); i++) {
                nodeChild = nodelistChildren.item(i);
                if (nodeChild.getNodeType() == Node.TEXT_NODE) {
                    log.info(nodeChild.getTextContent() + " cNN ");
                    lstNodes.add(nodeChild);
                    mapNodes.put(nodeChild, nodeChild);
                //} else if (nodeChild.getNodeType() == Node.ATTRIBUTE_NODE) {
                //    out.print(nodeChild.getNodeValue() + " aNN ");
                } else {
                    fnTraverseNode(nodeChild);
                }
            }
        }
    }

    public static void fnIterator() {
        Node nodeListIterator = null;
        Node nodeMapKey = null;
        Node nodeMapVal = null;
        log.info(" * " + lstNodes.size());

        Iterator<Node> listIterator = lstNodes.iterator();
        while(listIterator.hasNext()) {
            nodeListIterator = listIterator.next();
            log.info(nodeListIterator.getNodeType() + " " + nodeListIterator.getNodeName() + " " + nodeListIterator.getNodeValue()+ " " + nodeListIterator.getTextContent());
            //if (nodeIterator.getNodeType() != Node.TEXT_NODE) {
            //    out.print(nodeIterator.getNodeName() + " ");
            //} else {
            //    out.println(nodeIterator.getTextContent() + " gTC ");
            //}
        }
        
        log.info(" * " + mapNodes.size());
        Iterator<Map.Entry> mapIterator = mapNodes.entrySet().iterator();
        while(mapIterator.hasNext()) {
            Map.Entry entry = mapIterator.next();
            nodeMapKey = (Node)entry.getKey();
            log.info("Key=" + nodeMapKey.getNodeType() + " " + nodeMapKey.getNodeName() + " " + nodeMapKey.getNodeValue()+ " " + nodeMapKey.getTextContent());
            nodeMapVal = (Node)entry.getValue();
            log.info(", Value=" + nodeMapVal.getNodeType() + " " + nodeMapVal.getNodeName() + " " + nodeMapVal.getNodeValue()+ " " + nodeMapVal.getTextContent());
        }
    }
    
    //public static void main (String args[]) {
    //    clsXmlTraverser xmlTraverser = new clsXmlTraverser();
    //    Document xmlDocument = xmlTraverser.fnLoadXml();
    //    log.info(xmlDocument.getFirstChild().getNodeName() + " fc ");
    //    xmlTraverser.fnTraverseNode(xmlDocument.getFirstChild());
    //    xmlTraverser.fnIterator();
    //}

}

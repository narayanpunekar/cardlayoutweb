/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.webdmi.platform;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.util.logging.Logger;
import java.util.HashMap;

/**
 *
 * @author narayan.punekar@yahoo.com
 * XmlProcessor
 *
 */
public class clsXmlProcessor {
    private static final Logger log = Logger.getLogger(clsXmlProcessor.class.getName());

    /**
     * Save the form
     */
    public static void fnProcessRequest(HashMap<String, String> key) {
        DocumentBuilderFactory dbFactory = null;
        DocumentBuilder documentBuilder = null;
        Document xmlDocument = null;
        Element elemProductBacklog = null;

        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = dbFactory.newDocumentBuilder();
            xmlDocument = documentBuilder.parse(new File("ProductBacklog.xml"));
            elemProductBacklog = xmlDocument.getDocumentElement();
        } catch(Exception e) {
            xmlDocument = documentBuilder.newDocument();
            elemProductBacklog = xmlDocument.createElement("ProductBacklog");
            xmlDocument.appendChild(elemProductBacklog);
            e.printStackTrace();
        } finally {
            try {
                XPath xpath = XPathFactory.newInstance().newXPath();
                String strSnocnt = "/ProductBacklog/SNo[last()]/@cnt";
                Double dSnocntVal = (Double)xpath.evaluate(strSnocnt, xmlDocument, XPathConstants.NUMBER);
                Integer strSnocntVal = dSnocntVal.intValue()+1;

                Element elemSNo = xmlDocument.createElement("SNo");
                elemProductBacklog.appendChild(elemSNo);

                Attr attrSNoCnt  = xmlDocument.createAttribute("cnt");
                attrSNoCnt.appendChild(xmlDocument.createTextNode(strSnocntVal.toString()));
                elemSNo.setAttributeNode(attrSNoCnt);

                Element elemFirstName = xmlDocument.createElement("FirstName");
                String strFirstName = key.get("strFirstName");
                elemFirstName.appendChild(xmlDocument.createTextNode(strFirstName));
                elemSNo.appendChild(elemFirstName);

                Element elemLastName = xmlDocument.createElement("LastName");
                String strLastName = key.get("strLastName");
                elemLastName.appendChild(xmlDocument.createTextNode(strLastName));
                elemSNo.appendChild(elemLastName);

                Element elemEmail = xmlDocument.createElement("Email");
                String strEmail = key.get("strEmail");
                elemEmail.appendChild(xmlDocument.createTextNode(strEmail));
                elemSNo.appendChild(elemEmail);

                Element elemPhoneOne = xmlDocument.createElement("PhoneOne");
                String strPhoneOne = key.get("strPhoneOne");
                elemPhoneOne.appendChild(xmlDocument.createTextNode(strPhoneOne));
                elemSNo.appendChild(elemPhoneOne);

                Element elemPhoneTwo = xmlDocument.createElement("PhoneTwo");
                String strPhoneTwo = key.get("strPhoneTwo");
                elemPhoneTwo.appendChild(xmlDocument.createTextNode(strPhoneTwo));
                elemSNo.appendChild(elemPhoneTwo);

                Element elemFaxPager = xmlDocument.createElement("FaxPagerchoice");
                String rdoFaxPager = key.get("rdoFaxPager");
                elemSNo.appendChild(elemFaxPager);
                Attr attrFaxPager = xmlDocument.createAttribute("faxpager");
                //attrFaxPager.appendChild(xmlDocument.createTextNode(chcFaxPager.getSelectedItem()));
                attrFaxPager.appendChild(xmlDocument.createTextNode(rdoFaxPager));
                elemFaxPager.setAttributeNode(attrFaxPager);
                
                Element elemFaxPagerNum = xmlDocument.createElement("FaxPagerNum");
                String strFaxPager = key.get("strFaxPager");
                elemFaxPagerNum.appendChild(xmlDocument.createTextNode(strFaxPager));
                elemSNo.appendChild(elemFaxPagerNum);

                /*
                Element elemOSchoice = xmlDocument.createElement("OSchoice");
                //elemOSchoice.appendChild(xmlDocument.createTextNode("Operating System choice"));
                elemSNo.appendChild(elemOSchoice);

                Attr attrOSchoice = xmlDocument.createAttribute("ostypechoice");
                attrOSchoice.appendChild(xmlDocument.createTextNode(chcOS.getSelectedItem()));
                elemOSchoice.setAttributeNode(attrOSchoice);
                */

                Element elemOSradio = xmlDocument.createElement("OSradio");
                //elemOSradio.appendChild(xmlDocument.createTextNode("Operating System radio"));
                elemSNo.appendChild(elemOSradio);

                String strOs = key.get("strOs");
                Attr attrOSradio = xmlDocument.createAttribute("ostyperadio");
                attrOSradio.appendChild(xmlDocument.createTextNode(strOs));
                elemOSradio.setAttributeNode(attrOSradio);

                Element elemSoftware = xmlDocument.createElement("Software");
                //elemSoftware.appendChild(xmlDocument.createTextNode("Software"));
                elemSNo.appendChild(elemSoftware);

                //String strWord = new String();
                //if(chkWord.getState()==true){
                //    strWord = chkWord.getLabel();
                //}
                String strWord = key.get("strWord");
                Attr attrWord = xmlDocument.createAttribute("Word");
                attrWord.appendChild(xmlDocument.createTextNode(strWord));
                elemSoftware.setAttributeNode(attrWord);

                //String strExcel = new String();
                //if(chkExcel.getState()==true){
                //    strExcel = chkExcel.getLabel();
                //}
                String strExcel = key.get("strExcel");
                Attr attrExcel = xmlDocument.createAttribute("Excel");
                attrExcel.appendChild(xmlDocument.createTextNode(strExcel));
                elemSoftware.setAttributeNode(attrExcel);

                //String strPowerpoint = new String();
                //if(chkPowerpoint.getState()==true){
                //    strPowerpoint = chkPowerpoint.getLabel();
                //}
                String strPowerpoint = key.get("strPowerpoint");
                Attr attrPowerpoint = xmlDocument.createAttribute("Powerpoint");
                attrPowerpoint.appendChild(xmlDocument.createTextNode(strPowerpoint));
                elemSoftware.setAttributeNode(attrPowerpoint);

                //String strOutlook = new String();
                //if(chkOutlook.getState()==true){
                //    strOutlook = chkOutlook.getLabel();
                //}
                String strOutlook = key.get("strOutlook");
                Attr attrOutlook = xmlDocument.createAttribute("Outlook");
                attrOutlook.appendChild(xmlDocument.createTextNode(strOutlook));
                elemSoftware.setAttributeNode(attrOutlook);

                //String strVarious = new String();
                //if(chkVarious.getState()==true){
                //    strVarious = chkVarious.getLabel();
                //}
                String strVarious = key.get("strVarious");
                Attr attrVarious = xmlDocument.createAttribute("Various");
                attrVarious.appendChild(xmlDocument.createTextNode(strVarious));
                elemSoftware.setAttributeNode(attrVarious);

                Element elemProblemDescription = xmlDocument.createElement("ProblemDescription");
                String strProblemDescription = key.get("strProblemDescription");
                elemProblemDescription.appendChild(xmlDocument.createTextNode(strProblemDescription));
                elemSNo.appendChild(elemProblemDescription);

                Element elemPassword = xmlDocument.createElement("Password");
                String strPassword = key.get("strPassword");
                elemPassword.appendChild(xmlDocument.createTextNode(strPassword));
                elemSNo.appendChild(elemPassword);

                Element elemAddress = xmlDocument.createElement("Address");
                String strAddress = key.get("strAddress");
                elemAddress.appendChild(xmlDocument.createTextNode(strAddress));
                elemSNo.appendChild(elemAddress);

                Element elemZipCode = xmlDocument.createElement("ZipCode");
                String strZipcode = key.get("strZipcode");
                elemZipCode.appendChild(xmlDocument.createTextNode(strZipcode));
                elemSNo.appendChild(elemZipCode);

                Element elemUserName = xmlDocument.createElement("UserName");
                String strUsername = key.get("strUsername");
                elemUserName.appendChild(xmlDocument.createTextNode(strUsername));
                elemSNo.appendChild(elemUserName);

                Element elemUserType = xmlDocument.createElement("UserType");
                String rdoUserType = key.get("rdoUserType");
                elemSNo.appendChild(elemUserType);
                Attr attrUserType = xmlDocument.createAttribute("usertype");
                attrUserType.appendChild(xmlDocument.createTextNode(rdoUserType));
                elemUserType.setAttributeNode(attrUserType);

                Element elemNewsletters = xmlDocument.createElement("Newsletters");
                String rdoNewsletters = key.get("rdoNewsletters");
                elemSNo.appendChild(elemNewsletters);
                Attr attrNewsletters = xmlDocument.createAttribute("newsletters");
                attrNewsletters.appendChild(xmlDocument.createTextNode(rdoNewsletters));
                elemNewsletters.setAttributeNode(attrNewsletters);

                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.transform(new DOMSource(xmlDocument), new StreamResult(new File("ProductBacklog.xml")));
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Populate the form with the saved data
     */
    public static HashMap fnProcessXPath(String iCnt) {
        HashMap<String, String> key = new HashMap<>();
        try {
            log.info("iCnt: " + iCnt);
            key.put("iCntVal", iCnt);

            DocumentBuilderFactory dbFactory = null;
            DocumentBuilder documentBuilder = null;
            Document xmlDocument = null;
            XPath xpath = null;

            dbFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = dbFactory.newDocumentBuilder();
            xmlDocument = documentBuilder.parse(new File("ProductBacklog.xml"));
            xpath = XPathFactory.newInstance().newXPath();

            String strFirstName = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/FirstName";
            String strFirstNameVal = (String)xpath.evaluate(strFirstName, xmlDocument, XPathConstants.STRING);
            //txtFirstName.setText(strFirstNameVal);
            key.put("strFirstName", strFirstNameVal);

            String strLastName = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/LastName";
            String strLastNameVal = (String)xpath.evaluate(strLastName, xmlDocument, XPathConstants.STRING);
            //txtLastName.setText(strLastNameVal);
            key.put("strLastName", strLastNameVal);
            
            String strEmail = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Email";
            String strEmailVal = (String)xpath.evaluate(strEmail, xmlDocument, XPathConstants.STRING);
            //txtEmail.setText(strEmailVal);
            key.put("strEmail", strEmailVal);

            String strPhoneOne = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/PhoneOne";
            String strPhoneOneVal = (String)xpath.evaluate(strPhoneOne, xmlDocument, XPathConstants.STRING);
            //txtPhoneOne.setText(strPhoneOneVal);
            key.put("strPhoneOne", strPhoneOneVal);

            String strPhoneTwo = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/PhoneTwo";
            String strPhoneTwoVal = (String)xpath.evaluate(strPhoneTwo, xmlDocument, XPathConstants.STRING);
            //txtPhoneTwo.setText(strPhoneTwoVal);
            key.put("strPhoneTwo", strPhoneTwoVal);

            String strFaxPagerChoice = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/FaxPagerchoice/@faxpager";
            String strFaxPagerChoiceVal = (String)xpath.evaluate(strFaxPagerChoice, xmlDocument, XPathConstants.STRING);
            //chcFaxPager.select(strFaxPagerChoiceVal);
            key.put("rdoFaxPager", strFaxPagerChoiceVal);

            String strFaxPagerNum = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/FaxPagerNum";
            String strFaxPagerNumVal = (String)xpath.evaluate(strFaxPagerNum, xmlDocument, XPathConstants.STRING);
            //txtFaxPager.setText(strFaxPagerNumVal);
            key.put("strFaxPager", strFaxPagerNumVal);

            //String strOSchoice = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/OSchoice/@ostypechoice";
            //String strOSchoiceVal = (String)xpath.evaluate(strOSchoice, xmlDocument, XPathConstants.STRING);
            //chcOS.select(strOSchoiceVal);

            String strOSradio = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/OSradio/@ostyperadio";
            String strOSradioVal = (String)xpath.evaluate(strOSradio, xmlDocument, XPathConstants.STRING);
            key.put("strOs", strOSradioVal);

            //String strSoftware = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software";
            //Node nodeSoftware = (Node)xpath.evaluate(strSoftware, xmlDocument, XPathConstants.NODE);
            //String strWordVal = nodeSoftware.getAttributes().getNamedItem("Word").getNodeValue();
            //String strExcelVal = nodeSoftware.getAttributes().getNamedItem("Excel").getNodeValue();
            //String strPowerpointVal = nodeSoftware.getAttributes().getNamedItem("Powerpoint").getNodeValue();
            //String strOutlookVal = nodeSoftware.getAttributes().getNamedItem("Outlook").getNodeValue();
            //String strVariousVal = nodeSoftware.getAttributes().getNamedItem("Various").getNodeValue();

            String strWord = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software/@Word";
            String strWordVal = (String)xpath.evaluate(strWord, xmlDocument, XPathConstants.STRING);
            key.put("strWord", strWordVal);

            String strExcel = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software/@Excel";
            String strExcelVal = (String)xpath.evaluate(strExcel, xmlDocument, XPathConstants.STRING);
            key.put("strExcel", strExcelVal);

            String strPowerpoint = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software/@Powerpoint";
            String strPowerpointVal = (String)xpath.evaluate(strPowerpoint, xmlDocument, XPathConstants.STRING);
            key.put("strPowerpoint", strPowerpointVal);

            String strOutlook = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software/@Outlook";
            String strOutlookVal = (String)xpath.evaluate(strOutlook, xmlDocument, XPathConstants.STRING);
            key.put("strOutlook", strOutlookVal);

            String strVarious = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Software/@Various";
            String strVariousVal = (String)xpath.evaluate(strVarious, xmlDocument, XPathConstants.STRING);
            key.put("strVarious", strVariousVal);

            String strProblemDescription = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/ProblemDescription";
            String strProblemDescriptionVal = (String)xpath.evaluate(strProblemDescription, xmlDocument, XPathConstants.STRING);
            //txaProblemDescription.setText(strProblemDescriptionVal);
            key.put("strProblemDescription", strProblemDescriptionVal);
            
            String strPassword = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Password";
            String strPasswordVal = (String)xpath.evaluate(strPassword, xmlDocument, XPathConstants.STRING);
            //txtPassword.setText(strPasswordVal);
            key.put("strPassword", strPasswordVal);
            
            //Begin branch210123_1: Solution Description placeholder text @ Solutions Department screen
            String strSolutionDescription = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/SolutionDescription";
            String strSolutionDescriptionVal = (String)xpath.evaluate(strSolutionDescription, xmlDocument, XPathConstants.STRING);
            //txaSolutionDescription.setText(strSolutionDescriptionVal);
            key.put("strSolutionDescription", strSolutionDescriptionVal);
            //txaSolutionDescription.setFont(new Font(Font.SERIF,Font.ITALIC,15));
            //txaSolutionDescription.setText("<Enter Solution...>");
            //End branch210123_1: Solution Description placeholder text @ Solutions Department screen

            String strAddress = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/Address";
            String strAddressVal = (String)xpath.evaluate(strAddress, xmlDocument, XPathConstants.STRING);
            key.put("strAddress", strAddressVal);

            String strZipcode = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/ZipCode";
            String strZipcodeVal = (String)xpath.evaluate(strZipcode, xmlDocument, XPathConstants.STRING);
            key.put("strZipcode", strZipcodeVal);

            String strUsername = "/ProductBacklog/SNo[@cnt=" + iCnt + "]/UserName";
            String strUsernameVal = (String)xpath.evaluate(strUsername, xmlDocument, XPathConstants.STRING);
            key.put("strUsername", strUsernameVal);

            log.info("strFirstName=" + key.get("strFirstName"));
            log.info("strAddress=" + key.get("strAddress"));
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            return key;
        }
    }

    /**
     * Save the Solution
     */
    public static HashMap fnProcessSolution(HashMap<String, String> key) {
        String iCnt = key.get("iCntVal");
        log.info("fnProcessSolution iCnt: " + iCnt);

        DocumentBuilderFactory dbFactory = null;
        DocumentBuilder documentBuilder = null;
        Document xmlDocument = null;
        Element elemSolutionDescription = null;
        Node nodeSNo = null;
        Element elemSNo = null;

        Document xmlDocumentPieChart = null;
        Element elemPieChartData = null;

        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            documentBuilder = dbFactory.newDocumentBuilder();
            xmlDocumentPieChart = documentBuilder.parse(new File("PieChartData.xml"));
            elemPieChartData = xmlDocumentPieChart.getDocumentElement();
        } catch(Exception e) {
            xmlDocumentPieChart = documentBuilder.newDocument();
            elemPieChartData = xmlDocumentPieChart.createElement("PieChartData");
            xmlDocumentPieChart.appendChild(elemPieChartData);
            e.printStackTrace();
        } finally {
            try {
                xmlDocument = documentBuilder.parse(new File("ProductBacklog.xml"));
                XPath xpath = XPathFactory.newInstance().newXPath();

                //new <SNo><SolutionDescription>, increment <SolvedCnt>
                String strSolutionDescription = "/ProductBacklog/SNo[@cnt=" + iCnt + "][SolutionDescription]";
                Node nodeSolutionDescriptionExists = null;
                boolean bNodeSolutionDescriptionExists = false;
                nodeSolutionDescriptionExists = (Node)xpath.evaluate(strSolutionDescription, xmlDocument, XPathConstants.NODE);
                if (nodeSolutionDescriptionExists != null)
                    bNodeSolutionDescriptionExists = true;

                if (!bNodeSolutionDescriptionExists) {
                    String strSolvedcnt = "/PieChartData/SolvedCnt[last()]";
                    Double dSolvedcntVal = (Double)xpath.evaluate(strSolvedcnt, xmlDocumentPieChart, XPathConstants.NUMBER);
                    Element elemSolvedCnt = xmlDocumentPieChart.createElement("SolvedCnt");
                    int iSolvedcntVal = dSolvedcntVal.intValue() + 1;
                    elemSolvedCnt.appendChild(xmlDocumentPieChart.createTextNode((new Integer(iSolvedcntVal)).toString()));
                    elemPieChartData.appendChild(elemSolvedCnt);
                }
                
                //new <SolutionDescription>, increment <SolvedNum>
                String strSolvednum = "/PieChartData/SolvedNum[last()]";
                Double dSolvednumVal = (Double)xpath.evaluate(strSolvednum, xmlDocumentPieChart, XPathConstants.NUMBER);
                Element elemSolvedNum = xmlDocumentPieChart.createElement("SolvedNum");
                int iSolvednumVal = dSolvednumVal.intValue() + 1;
                elemSolvedNum.appendChild(xmlDocumentPieChart.createTextNode((new Integer(iSolvednumVal)).toString()));
                elemPieChartData.appendChild(elemSolvedNum);

                String strSnocnt = "/ProductBacklog/SNo[@cnt=" + iCnt +"]";
                nodeSNo = (Node)xpath.evaluate(strSnocnt, xmlDocument, XPathConstants.NODE);
                elemSNo = (Element) nodeSNo;

                elemSolutionDescription = xmlDocument.createElement("SolutionDescription");
                String strSolutionDescriptionVal = key.get("strSolutionDescription");
                elemSolutionDescription.appendChild(xmlDocument.createTextNode(strSolutionDescriptionVal));
                elemSNo.appendChild(elemSolutionDescription);

                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.transform(new DOMSource(xmlDocument), new StreamResult(new File("ProductBacklog.xml")));

                Transformer transformerPieChart = TransformerFactory.newInstance().newTransformer();
                transformerPieChart.transform(new DOMSource(xmlDocumentPieChart), new StreamResult(new File("PieChartData.xml")));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                return key;
            }
        }
    }

}

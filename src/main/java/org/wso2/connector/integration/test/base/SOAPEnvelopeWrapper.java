package org.wso2.connector.integration.test.base;

import org.apache.axiom.om.*;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPVersion;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;

public class SOAPEnvelopeWrapper implements SOAPEnvelope {
    private String response;

    public SOAPEnvelopeWrapper(String response) {
        this.response = response;
    }

    @Override
    public SOAPHeader getHeader() throws OMException {
        return null;
    }

    @Override
    public SOAPBody getBody() throws OMException {
        return null;
    }

    @Override
    public SOAPVersion getVersion() {
        return null;
    }

    @Override
    public boolean hasFault() {
        return false;
    }

    @Override
    public OMNamespace getSOAPBodyFirstElementNS() {
        return null;
    }

    @Override
    public String getSOAPBodyFirstElementLocalName() {
        return null;
    }

    @Override
    public Iterator getChildElements() {
        return null;
    }

    @Override
    public OMNamespace declareNamespace(String s, String s1) {
        return null;
    }

    @Override
    public OMNamespace declareDefaultNamespace(String s) {
        return null;
    }

    @Override
    public OMNamespace getDefaultNamespace() {
        return null;
    }

    @Override
    public OMNamespace declareNamespace(OMNamespace omNamespace) {
        return null;
    }

    @Override
    public OMNamespace findNamespace(String s, String s1) {
        return null;
    }

    @Override
    public OMNamespace findNamespaceURI(String s) {
        return null;
    }

    @Override
    public Iterator getAllDeclaredNamespaces() throws OMException {
        return null;
    }

    @Override
    public Iterator getAllAttributes() {
        return null;
    }

    @Override
    public OMAttribute getAttribute(QName qName) {
        return null;
    }

    @Override
    public String getAttributeValue(QName qName) {
        return null;
    }

    @Override
    public OMAttribute addAttribute(OMAttribute omAttribute) {
        return null;
    }

    @Override
    public OMAttribute addAttribute(String s, String s1, OMNamespace omNamespace) {
        return null;
    }

    @Override
    public void removeAttribute(OMAttribute omAttribute) {

    }

    @Override
    public void setBuilder(OMXMLParserWrapper omxmlParserWrapper) {

    }

    @Override
    public void setFirstChild(OMNode omNode) {

    }

    @Override
    public OMElement getFirstElement() {
        return null;
    }

    @Override
    public void setText(String s) {

    }

    @Override
    public void setText(QName qName) {

    }

    @Override
    public String getText() {
        return response;
    }

    @Override
    public QName getTextAsQName() {
        return null;
    }

    @Override
    public String getLocalName() {
        return null;
    }

    @Override
    public void setLocalName(String s) {

    }

    @Override
    public OMNamespace getNamespace() {
        return null;
    }

    @Override
    public void setNamespace(OMNamespace omNamespace) {

    }

    @Override
    public void setNamespaceWithNoFindInCurrentScope(OMNamespace omNamespace) {

    }

    @Override
    public QName getQName() {
        return null;
    }

    @Override
    public String toStringWithConsume() throws XMLStreamException {
        return null;
    }

    @Override
    public QName resolveQName(String s) {
        return null;
    }

    @Override
    public OMElement cloneOMElement() {
        return null;
    }

    @Override
    public void setLineNumber(int i) {

    }

    @Override
    public int getLineNumber() {
        return 0;
    }

    @Override
    public OMXMLParserWrapper getBuilder() {
        return null;
    }

    @Override
    public void addChild(OMNode omNode) {

    }

    @Override
    public Iterator getChildrenWithName(QName qName) {
        return null;
    }

    @Override
    public Iterator getChildrenWithLocalName(String s) {
        return null;
    }

    @Override
    public Iterator getChildrenWithNamespaceURI(String s) {
        return null;
    }

    @Override
    public OMElement getFirstChildWithName(QName qName) throws OMException {
        return null;
    }

    @Override
    public Iterator getChildren() {
        return null;
    }

    @Override
    public OMNode getFirstOMChild() {
        return null;
    }

    @Override
    public OMContainer getParent() {
        return null;
    }

    @Override
    public OMNode getNextOMSibling() throws OMException {
        return null;
    }

    @Override
    public OMNode detach() throws OMException {
        return null;
    }

    @Override
    public void discard() throws OMException {

    }

    @Override
    public void insertSiblingAfter(OMNode omNode) throws OMException {

    }

    @Override
    public void insertSiblingBefore(OMNode omNode) throws OMException {

    }

    @Override
    public int getType() {
        return 1234;
    }

    @Override
    public OMNode getPreviousOMSibling() {
        return null;
    }

    @Override
    public void serialize(OutputStream outputStream) throws XMLStreamException {

    }

    @Override
    public void serialize(Writer writer) throws XMLStreamException {

    }

    @Override
    public void serialize(OutputStream outputStream, OMOutputFormat omOutputFormat) throws XMLStreamException {

    }

    @Override
    public void serialize(Writer writer, OMOutputFormat omOutputFormat) throws XMLStreamException {

    }

    @Override
    public void serializeAndConsume(OutputStream outputStream) throws XMLStreamException {

    }

    @Override
    public void serializeAndConsume(Writer writer) throws XMLStreamException {

    }

    @Override
    public void serializeAndConsume(OutputStream outputStream, OMOutputFormat omOutputFormat) throws XMLStreamException {

    }

    @Override
    public void serializeAndConsume(Writer writer, OMOutputFormat omOutputFormat) throws XMLStreamException {

    }

    @Override
    public void buildWithAttachments() {

    }

    @Override
    public void buildNext() {

    }

    @Override
    public XMLStreamReader getXMLStreamReader() {
        return null;
    }

    @Override
    public XMLStreamReader getXMLStreamReaderWithoutCaching() {
        return null;
    }

    @Override
    public XMLStreamReader getXMLStreamReader(boolean b) {
        return null;
    }

    @Override
    public OMFactory getOMFactory() {
        return null;
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public void build() {

    }

    @Override
    public void close(boolean b) {

    }

    @Override
    public void serialize(XMLStreamWriter xmlStreamWriter) throws XMLStreamException {

    }

    @Override
    public void serializeAndConsume(XMLStreamWriter xmlStreamWriter) throws XMLStreamException {

    }

    @Override
    public void serialize(XMLStreamWriter xmlStreamWriter, boolean b) throws XMLStreamException {

    }
}

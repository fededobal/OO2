package org.refactoring;

public class PDFReport extends ReportStrategy {
    @Override
    protected byte[] adicional(Document document, DocumentFile docFile) {
        docFile.setContentType("applicattion/pdf");
        docFile.setPageSize("A4");
        PDFExporter exporter = new PDFExporter();
        byte[] content = exporter.generatePDFFile(document);
        return content;
    }
}

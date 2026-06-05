package org.refactoring;

public class XLSReport extends ReportStrategy {
    @Override
    protected byte[] adicional(Document document, DocumentFile docFile) {
        docFile.setContentType("applicattion/vnd.ms-excel");
        docFile.setSheetName(document.getSubtitle());
        ExcelWriter writer = new ExcelWriter();
        byte[] content = writer.generateExcelFile(document);
        return content;
    }
}

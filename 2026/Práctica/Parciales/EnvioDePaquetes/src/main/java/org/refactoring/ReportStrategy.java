package org.refactoring;

public abstract class ReportStrategy {
    public void generateReport(Document document) {
        DocumentFile docFile = new DocumentFile();
        docFile.setTitle(document.getTitle());
        String authors = document.getAuthors().stream().Collect(collectors.joining(“,”));
        docFile.setAuthor(authors);
        docFile.setContent(this.adicional(document,docFile));
        this.saveExportedFile(docFile);
    }

    protected abstract byte[] adicional(Document document, DocumentFile docFile);
}

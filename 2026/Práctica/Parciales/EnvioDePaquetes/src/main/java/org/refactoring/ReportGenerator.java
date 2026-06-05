package org.refactoring;

public class ReportGenerator {
    private ReportStrategy reportStrategy;

    public ReportGenerator(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    public void setReportStrategy(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    public void generateReport(Document document) {
        reportStrategy.generateReport(document);
    }
}

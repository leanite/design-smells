package abstraction.unutilized;

public class Demo {
    public static void main(String[] args) {
        ReportGenerator reportGenerator;
        String reportType = "pdf";

        if (reportType.equals("pdf")) {
            reportGenerator = new PdfReportGenerator();
        }
        else {
            reportGenerator = new HtmlReportGenerator();
        }

        reportGenerator.generateReport();
    }
}

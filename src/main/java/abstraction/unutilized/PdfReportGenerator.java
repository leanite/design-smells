package abstraction.unutilized;

import java.io.File;

public class PdfReportGenerator extends ReportGenerator {
    // ...

    @Override
    File generateReport() {
        return new File("report.pdf");
    }
}

package abstraction.unutilized;

import java.io.File;

public class HtmlReportGenerator extends ReportGenerator {
    // ...

    @Override
    File generateReport() {
        return new File("report.html");
    }
}

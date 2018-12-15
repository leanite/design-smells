package abstraction.unutilized;

import java.io.File;

// Unused class
public class XmlReportGenerator extends ReportGenerator {
    // ...

    @Override
    File generateReport() {
        return new File("report.xml");
    }
}

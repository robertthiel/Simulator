package rtc.command.pattern;

public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textfile) {
        this.textFile = textfile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }

}

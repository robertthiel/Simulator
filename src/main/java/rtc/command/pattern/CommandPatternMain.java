package rtc.command.pattern;

public class CommandPatternMain {


    public static void main(String[] args) {

        System.out.println("in main ..");

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        if ( false ) {
            textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
            textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
        } else {
            //textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
            textFileOperationExecutor.executeOperation(() ->  "Saving file file2.txt"  );

            TextFile textFile = new TextFile("file1.txt");
            textFileOperationExecutor.executeOperation(textFile::open);
            textFileOperationExecutor.executeOperation(textFile::save);

        }


    }


}

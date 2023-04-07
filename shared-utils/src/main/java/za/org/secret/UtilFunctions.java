package za.org.secret;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UtilFunctions {
    public static Map<String, String> readConfig() throws IOException {
        Map<String, String> parsedConfig = new HashMap<>();
        String rawResponse = fetch(Constants.JAV_CONFIG_URL).body().string();
        try (Scanner scanner = new Scanner(new StringReader(rawResponse))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                line = line.replace("param=", "").replace("msg=", "");

                // Split the string on the "=" sign and limit the split to 2 in case some of the parameters use the "=" sign
                String[] splitLine = line.split("=", 2);
                // Check if the value is empty and add an empty parameter with the name
                if (splitLine.length == 1)
                    parsedConfig.put(splitLine[0], "");
                // Check there is a value and add the parameter with the value
                if (splitLine.length == 2)
                    parsedConfig.put(splitLine[0], splitLine[1]);
            }
        }
        return parsedConfig;
    }

    public static Response fetch(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request).execute();
    }

    public static boolean isObfuscated(String fileName) {
        return fileName.length() <= 2 || fileName.equals("client");
    }
}

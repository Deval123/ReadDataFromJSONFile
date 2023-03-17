package org.jsonprojet.jsonFile;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJSONFile {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("How To Read Data from JSON File in Java | JSON Simple API!");
        JSONParser jsonParser = new JSONParser();

        FileReader reader = new FileReader("src/main/java/org/jsonprojet/jsonFile/employee.json");

        Object obj = jsonParser.parse(reader);

        JSONObject empjsonobj=(JSONObject)obj;

        String fname=(String)  empjsonobj.get("firstName");
        String lname=(String)  empjsonobj.get("lastName");

        System.out.println("First name:"+fname);
        System.out.println("Last name:"+lname);

        JSONArray array=(JSONArray)empjsonobj.get("address");
        for(int i=0; i<array.size(); i++){

            JSONObject address =(JSONObject) array.get(i);

            String street=(String)  address.get("street");
            String city=(String)  address.get("city");
            String state=(String)  address.get("state");

            System.out.println("Address of "+i+"is..........");
            System.out.println("street:"+street);
            System.out.println("street:"+city);
            System.out.println("street:"+state);

        }

    }
/*public static void main(String[] args) throws IOException, ParseException {
    System.out.println("How To Read Data from JSON File in Java | JSON Simple API!");
    JSONParser jsonParser = new JSONParser();

    FileReader reader = new FileReader("src/main/java/org/jsonprojet/jsonFile/appconfig.json");

    Object obj = jsonParser.parse(reader);

    JSONObject appconfig=(JSONObject)obj;

    JSONArray array=(JSONArray)appconfig.get("buConfs");
    for(int i=0; i<array.size(); i++){

        JSONObject buConfs =(JSONObject) array.get(i);

        String queuein=(String)  buConfs.get("queuein");
        String queueout=(String)  buConfs.get("queueout");
        String queuedlq=(String)  buConfs.get("queuedlq");
        String channel=(String)  buConfs.get("channel");
        String qeueManager=(String)  buConfs.get("qeueManager");
        String connectionList=(String)  buConfs.get("connectionList");
        //String applicationId=(String)  buConfs.get("applicationId");
        String applicationId=String.valueOf(buConfs.get("applicationId"));
        String applicationUuid=(String)  buConfs.get("applicationUuid");

        System.out.println("The size of the array is : "+i+array.size()+"\n");
        System.out.println("Address of "+i+"is..........");
        System.out.println("queuein:"+queuein);
        System.out.println("queueout:"+queueout);
        System.out.println("queuedlq:"+queuedlq);
        System.out.println("channel:"+channel);
        System.out.println("qeueManager:"+qeueManager);
        System.out.println("connectionList:"+connectionList);
        System.out.println("applicationId:"+applicationId);
        System.out.println("applicationUuid:"+applicationUuid);

    }

}*/

}

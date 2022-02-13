package BitPanda.API;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;


public class HERE_LOCATION {

    @Test
    public void mainTestCase() {

        String baseUrl = "https://geocoder.ls.hereapi.com/6.2/geocode.json";
        String apiKey = "kUVU9QEEEoqsNTUOVDlh1S69vYKqMwOMG5cfRY-Do7Q";
        String addressParameters = "&housenumber=425&street=randolph&city=chicago&country=usa";

        HttpResponse<JsonNode> jsonResponse = Unirest.get(baseUrl + "?apiKey=" + apiKey + addressParameters).asJson();

        org.junit.Assert.assertNotNull(jsonResponse);

        System.out.println(jsonResponse.getStatus());
        System.out.println(jsonResponse.getBody().toPrettyString());


    }

}

package BitPanda.API;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;


public class HERE_LOCATION_ERROR {

    @Test
    public void Unauthorized() {

        String baseUrl = "https://geocoder.ls.hereapi.com/6.2/geocode.json";
        String addressParameters = "&housenumber=425&street=randolph&city=chicago&country=usa";

        HttpResponse<JsonNode> jsonResponse = Unirest.get(baseUrl + addressParameters).asJson();

        org.junit.Assert.assertNotNull(jsonResponse);
        org.junit.Assert.assertEquals("Unauthorized", jsonResponse.getBody().getObject().get("error"));

        System.out.println(jsonResponse.getStatus());
        System.out.println(jsonResponse.getBody().toPrettyString());


    }

}

package steps;

import models.Pet;

import io.cucumber.java.ru.*;
import io.restassured.response.Response;
import org.apache.logging.log4j.*;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 *
 */
public class APITestSteps {
    private final Logger log = LogManager.getLogger(getClass());

    private static final Pet pet = new Pet();
    private static final String OBJECT = "body";
    private static final String RESPONSE = "response";
    private static final Map<String,Object> storage = new HashMap<String,Object>();

    /**
     *
     * @param id
     * @param name
     */
    @Дано("питомец с параметрами ID {int}, Имя {string}")
    public void setPet(int id, String name) {
        pet.setId(id);
        pet.setName(name);
        log.debug("Заданы параметры объекта ID={}, Name={}",id,name);
    }

    /**
     *
     */
    @Если("добавить питомца запросом POST")
    public void postObjectToEndpoint() {
        Response resp = given().body(pet).when().post("/pet");
        storage.put(RESPONSE,resp);
        log.debug("Выполнено добавление объекта запросом POST");
    }

    /**
     *
     * @param code
     */
    @То("возвращается код ответа {int}")
    public void getResponseCode(int code) {
        Response resp = (Response)storage.get(RESPONSE);
        resp.then().statusCode(code);
    }

    /**
     *
     * @param id
     */
    @Если("получить питомца запросом GET по ID {int}")
    public void getObjectByIdFromEndpoint(int id) {
        Response resp = given().pathParam("petId",id)
                .when().get("/pet/{petId}");
        storage.put(RESPONSE,resp);
        log.debug("Выполнен запрос объекта запросом GET");
    }

    /**
     *
     * @param code
     */
    @То("возвращается код ответа {int} и запрошенный питомец")
    public void getResponseCodeAndRequestedObject(int code) {
        Response resp = (Response)storage.get(RESPONSE);
        Pet obj = resp.then().statusCode(code).extract().body().as(Pet.class);
        storage.put(OBJECT,obj);
        log.debug("Получен корректный ответ");
    }

    /**
     *
     */
    @Если("полученный питомец совпадает с добавленным")
    public void compareReceivedObjectWithExpected() {
        Pet actualObj = (Pet)storage.get(OBJECT);
        Assert.assertEquals(actualObj, pet);
        log.debug("Получен запрошенный объект");
    }

    /**
     *
     * @param id
     */
    @То("удалить питомца запросом DELETE по ID {int}")
    public void deleteObjectByIdFromEndpoint(int id) {
        Response resp =given().pathParam("petId", id).when().delete("/pet/{petId}");
        storage.put(RESPONSE,resp);
        log.debug("Добаленный объект удаляется запросом DELETE");
    }
}

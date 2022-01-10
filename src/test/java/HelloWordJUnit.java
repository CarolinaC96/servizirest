import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;


//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
public class HelloWordJUnit {

    public final String BASE_URL= "http://localhost:8080";
   public final String RANDOM_WORD_CONTROLLER="/randomWord";


   //test 1 e 2 per la richiesta GET
    @Test
    public void whenGetRequest_thenCorrect1() throws IOException {

        OkHttpClient client = new OkHttpClient();//crea il Client

        Request request = new Request.Builder()//richiesta
                .url(BASE_URL +  RANDOM_WORD_CONTROLLER + "/hello")
                .build();

        Call call = client.newCall(request); //chiamata

        Response response = call.execute(); //risposta

        //assertThat(response.code(), equalTo(200));

        System.out.println(response.body().string());
    }


    @Test
    public void whenGetRequest_thenCorrect2() throws IOException {

        OkHttpClient client = new OkHttpClient();//crea il Client

        Request request = new Request.Builder()//richiesta
                .url(BASE_URL +  RANDOM_WORD_CONTROLLER + "/hello/1")
                .build();

        Call call = client.newCall(request); //chiamata

        Response response = call.execute(); //risposta

        //assertThat(response.code(), equalTo(200));

        System.out.println(response.body().string());
    }

    }

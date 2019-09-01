package com.aexp.exercises.udacity.dogapidemo;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DogApiDemoApplicationTests {

	@BeforeClass
	public static void setupApi() {
		DogApiDemoApplication.main(new String[]{});
	}

	@Test
	public void getDogs() throws Exception{
		HttpUriRequest request = new HttpGet( "http://localhost:8080/dogs");
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		Assert.assertThat(
				httpResponse.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_OK));

		String responseBody = EntityUtils.toString(httpResponse.getEntity());

		Assert.assertTrue(responseBody.contains("Aspin"));
		Assert.assertTrue(responseBody.contains("Golden Retriever"));

	}

	@Test
	public void postDog() throws Exception{

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost( "http://localhost:8080/dogs");

		String json = "{\"name\": \"rocket\",\"breed\":\"Shitzu\",\"origin\" : \"Japan\", \"id\" " +
				": \"1\"}";
		StringEntity entity = new StringEntity(json);
		httpPost.setHeader("Content-Type", "application/json");
		httpPost.setEntity(entity);
		HttpResponse postResponse = client.execute(httpPost);

		Assert.assertThat(
				postResponse.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_CREATED));

		HttpUriRequest httpGet = new HttpGet( "http://localhost:8080/dogs");
		HttpResponse getResponse = HttpClientBuilder.create().build().execute(httpGet);
		String responseBody = EntityUtils.toString(getResponse.getEntity());

		Assert.assertTrue(responseBody.contains("rocket"));
	}
}

package com.aexp.exercises.udacity.dogapidemo;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.AfterClass;
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

	private String uri = "http://localhost:8762/dogs";
	private static CredentialsProvider provider;
	private static HttpClient client;

	@BeforeClass
	public static void setupApi() {

		DogApiDemoApplication.main(new String[]{});

		provider = new BasicCredentialsProvider();
		UsernamePasswordCredentials credentials
				= new UsernamePasswordCredentials("admin", "password");
		provider.setCredentials(AuthScope.ANY, credentials);

		client = HttpClientBuilder.create()
				.setDefaultCredentialsProvider(provider)
				.build();
	}

	@Test
	public void getDogs() throws Exception{
		HttpResponse httpResponse = client.execute(new HttpGet(uri));
		Assert.assertThat(
				httpResponse.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_OK));

		String responseBody = EntityUtils.toString(httpResponse.getEntity());
		Assert.assertTrue(responseBody.contains("Aspin"));
		Assert.assertTrue(responseBody.contains("Golden Retriever"));

	}

	@Test
	public void postDog() throws Exception{

		HttpPost httpPost = new HttpPost(uri);
		String json = "{\"name\": \"rocket\",\"breed\":\"Shitzu\",\"origin\" : \"Japan\", \"id\": \"1\"}";
		StringEntity entity = new StringEntity(json);
		httpPost.setHeader("Content-Type", "application/json");
		httpPost.setEntity(entity);
		HttpResponse postResponse = client.execute(httpPost);
		Assert.assertThat(
				postResponse.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_CREATED));

		HttpResponse getResponse = client.execute(new HttpGet(uri));
		String responseBody = EntityUtils.toString(getResponse.getEntity());
		Assert.assertTrue(responseBody.contains("rocket"));
	}
}

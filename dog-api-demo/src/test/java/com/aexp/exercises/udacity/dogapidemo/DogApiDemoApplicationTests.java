package com.aexp.exercises.udacity.dogapidemo;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DogApiDemoApplicationTests {

	@BeforeClass
	public static void setupApi() {
		DogApiDemoApplication.main(new String[]{});
	}

	@Test
	public void testDogName() throws Exception{
		String name = "?name=boboy";
		HttpUriRequest request = new HttpGet( "http://localhost:8080/dogs/breeds" + name );
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		Assert.assertThat(
				httpResponse.getStatusLine().getStatusCode(),
				equalTo(HttpStatus.SC_OK));

		Assert.assertEquals("Aspin", EntityUtils.toString(httpResponse.getEntity
				()));
	}

	@Test
	public void testDogs() throws Exception{
		HttpUriRequest request = new HttpGet( "http://localhost:8080/dogs/names");
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		Assert.assertEquals("[\"Amy\",\"Boboy\"]", EntityUtils.toString(httpResponse.getEntity()));
	}
}

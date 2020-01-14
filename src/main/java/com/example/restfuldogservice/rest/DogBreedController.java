package com.example.restfuldogservice.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfuldogservice.Breeds;
import com.example.restfuldogservice.Dog;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class DogBreedController {

	@NonNull
	@Value("${ancillary.app.url}")
	private String ancillaryAppURL;

	@GetMapping(value = "/get-dogs", headers = "Accept=application/json")
	public Breeds letTheDogsOut(HttpServletRequest request) {
		OkHttpClient client = new OkHttpClient();

		Request httpRequest = new Request.Builder().url(ancillaryAppURL).get().build();

		try {
			Response response = client.newCall(httpRequest).execute();

			JSONParser parser = new JSONParser();
			String jsonData2 = response.body().string();
			JSONObject json2 = (JSONObject) parser.parse(jsonData2);

			JSONObject businessObject = (JSONObject) json2.get("message");
			int counter = 0;
			Set<?> set = businessObject.keySet();
			Breeds b = new Breeds();
			ArrayList<Dog> dogpound = new ArrayList<Dog>();
			for (Object object : set) {
				Dog d = new Dog();
				d.setName(object.toString());
				d.setId(counter);
				dogpound.add(d);
				counter++;
			}
			b.setDogs(dogpound);

			return b;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
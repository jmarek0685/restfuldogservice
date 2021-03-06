package com.example.restfuldogservice;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)
@WebMvcTest
public class WebLayerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/v1/get-dogs")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("{\"dogs\":[{\"name\":\"pyrenees\",\"id\":0},{\"name\":\"affenpinscher\",\"id\":1},{\"name\":\"kuvasz\",\"id\":2},{\"name\":\"dingo\",\"id\":3},{\"name\":\"pug\",\"id\":4},{\"name\":\"husky\",\"id\":5},{\"name\":\"dachshund\",\"id\":6},{\"name\":\"greyhound\",\"id\":7},{\"name\":\"buhund\",\"id\":8},{\"name\":\"deerhound\",\"id\":9},{\"name\":\"appenzeller\",\"id\":10},{\"name\":\"schipperke\",\"id\":11},{\"name\":\"stbernard\",\"id\":12},{\"name\":\"basenji\",\"id\":13},{\"name\":\"mountain\",\"id\":14},{\"name\":\"retriever\",\"id\":15},{\"name\":\"beagle\",\"id\":16},{\"name\":\"coonhound\",\"id\":17},{\"name\":\"dhole\",\"id\":18},{\"name\":\"rottweiler\",\"id\":19},{\"name\":\"airedale\",\"id\":20},{\"name\":\"elkhound\",\"id\":21},{\"name\":\"brabancon\",\"id\":22},{\"name\":\"springer\",\"id\":23},{\"name\":\"whippet\",\"id\":24},{\"name\":\"mexicanhairless\",\"id\":25},{\"name\":\"boxer\",\"id\":26},{\"name\":\"labrador\",\"id\":27},{\"name\":\"kelpie\",\"id\":28},{\"name\":\"pointer\",\"id\":29},{\"name\":\"chow\",\"id\":30},{\"name\":\"akita\",\"id\":31},{\"name\":\"shihtzu\",\"id\":32},{\"name\":\"bulldog\",\"id\":33},{\"name\":\"briard\",\"id\":34},{\"name\":\"cattledog\",\"id\":35},{\"name\":\"leonberg\",\"id\":36},{\"name\":\"entlebucher\",\"id\":37},{\"name\":\"saluki\",\"id\":38},{\"name\":\"collie\",\"id\":39},{\"name\":\"pekinese\",\"id\":40},{\"name\":\"bluetick\",\"id\":41},{\"name\":\"germanshepherd\",\"id\":42},{\"name\":\"weimaraner\",\"id\":43},{\"name\":\"schnauzer\",\"id\":44},{\"name\":\"otterhound\",\"id\":45},{\"name\":\"australian\",\"id\":46},{\"name\":\"cockapoo\",\"id\":47},{\"name\":\"mastiff\",\"id\":48},{\"name\":\"sheepdog\",\"id\":49},{\"name\":\"eskimo\",\"id\":50},{\"name\":\"samoyed\",\"id\":51},{\"name\":\"corgi\",\"id\":52},{\"name\":\"malamute\",\"id\":53},{\"name\":\"papillon\",\"id\":54},{\"name\":\"chihuahua\",\"id\":55},{\"name\":\"lhasa\",\"id\":56},{\"name\":\"pembroke\",\"id\":57},{\"name\":\"spaniel\",\"id\":58},{\"name\":\"clumber\",\"id\":59},{\"name\":\"ridgeback\",\"id\":60},{\"name\":\"keeshond\",\"id\":61},{\"name\":\"pitbull\",\"id\":62},{\"name\":\"dane\",\"id\":63},{\"name\":\"redbone\",\"id\":64},{\"name\":\"waterdog\",\"id\":65},{\"name\":\"bouvier\",\"id\":66},{\"name\":\"mix\",\"id\":67},{\"name\":\"komondor\",\"id\":68},{\"name\":\"malinois\",\"id\":69},{\"name\":\"cotondetulear\",\"id\":70},{\"name\":\"puggle\",\"id\":71},{\"name\":\"borzoi\",\"id\":72},{\"name\":\"poodle\",\"id\":73},{\"name\":\"groenendael\",\"id\":74},{\"name\":\"cairn\",\"id\":75},{\"name\":\"hound\",\"id\":76},{\"name\":\"terrier\",\"id\":77},{\"name\":\"maltese\",\"id\":78},{\"name\":\"bullterrier\",\"id\":79},{\"name\":\"african\",\"id\":80},{\"name\":\"newfoundland\",\"id\":81},{\"name\":\"shiba\",\"id\":82},{\"name\":\"pomeranian\",\"id\":83},{\"name\":\"pinscher\",\"id\":84},{\"name\":\"setter\",\"id\":85},{\"name\":\"frise\",\"id\":86},{\"name\":\"vizsla\",\"id\":87},{\"name\":\"wolfhound\",\"id\":88},{\"name\":\"dalmatian\",\"id\":89},{\"name\":\"doberman\",\"id\":90}]}")));
	}
}

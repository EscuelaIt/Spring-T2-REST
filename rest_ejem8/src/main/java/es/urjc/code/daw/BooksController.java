package es.urjc.code.daw;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

class BooksResponse {
	List<Book> items;
}

class Book {
	VolumeInfo volumeInfo;
}

class VolumeInfo {
	String title;
}

@RestController
public class BooksController {

	@RequestMapping("/booktitles")
	public List<String> getBookTitles(@RequestParam String title) {

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + title;

		BooksResponse data = restTemplate.getForObject(url, BooksResponse.class);

		List<String> bookTitles = new ArrayList<String>();

		for (Book book : data.items) {
			bookTitles.add(book.volumeInfo.title);
		}

		return bookTitles;
	}
}

package com.example.hellowebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {

	@GetMapping("/")
	Flux<String> hello() {
		return Flux.just("Hello", "World");
	}

	@GetMapping("/hoge")
	Flux<String> hoge() {

		if (false) {
			System.out.println("Never reach");
		}
		return Flux.just("hoge", "fugo");
	}
}

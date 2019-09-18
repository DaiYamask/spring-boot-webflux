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

		// todo fix issue
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < 1; k++) {
					for (int l = 0; l < 1; l++) {
						System.out.println(l);
					}
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < 1; k++) {
					for (int l = 0; l < 1; l++) {
						System.out.println(l);
					}
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < 1; k++) {
					for (int l = 0; l < 1; l++) {
						System.out.println(l);
					}
				}
			}
		}

		return Flux.just("hoge", "fugo");
	}
}

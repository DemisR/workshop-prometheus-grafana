package com.example.springbootmanagementexample;

import java.util.Date;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Counter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	private Counter hellos = Metrics.counter("hellos");

	@GetMapping("/example")
	public String example() {
		hellos.increment();
		return "Hello User !! " + new Date();
	}
}

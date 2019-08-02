package org.cloud.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@RequestMapping(value = "/getOrder", method = RequestMethod.GET)
	public String getOrder() {
		return "order";
	}
}

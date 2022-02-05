package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping(value = "/")
	public String Main() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "contents/login";
	}
	
	@RequestMapping(value = "/register")
	public String register() {
		return "contents/register";
	}
	
	@RequestMapping(value = "/chart")
	public String chart() {
		return "contents/musicChart";
	}
	
	@RequestMapping(value = "/music/music")
	public String music() {
		return "contents/rMusic";
	}
	
	@RequestMapping(value = "/music/album")
	public String album() {
		return "contents/rAlbum";
	}
	
	@RequestMapping(value = "/genre/ballad")
	public String ballad() {
		return "contents/ballad";
	}
	@RequestMapping(value = "/genre/rbsoul")
	public String rbsoul() {
		return "contents/ballad";
	}
	
	@RequestMapping(value = "/genre/dance")
	public String dance() {
		return "contents/ballad";
	}
	
	@RequestMapping(value = "/genre/rap")
	public String rap() {
		return "contents/ballad";
	}
	
	@RequestMapping(value = "/genre/indi")
	public String indi() {
		return "contents/ballad";
	}

	@RequestMapping(value = "/genre/pop")
	public String pop() {
		return "contents/pop";
	}
	
	@RequestMapping(value = "/genre/rbVideo")
	public String rbVideo() {
		return "contents/rbVideo";
	}
}
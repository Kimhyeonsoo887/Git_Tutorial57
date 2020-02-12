@Controller
public Class UserController(){
	
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로:login")

		return "user/login";
	}
	@RequestMapping("/user/insert.do")
	public String insert(){
		logger.info("login: insert")
		return "user/insert";
	}

	@RequestMapping("/user/update.do")
	public String update(){
		logger.info("update: update")
		return "user/update";
	}
}

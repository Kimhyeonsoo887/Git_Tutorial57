@Controller
public Class UserController(){
	
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로:login")

		return "user/login";
	}
}
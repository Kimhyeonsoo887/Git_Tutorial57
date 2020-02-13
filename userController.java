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

	@RequestMapping("/user/delete.do")
	public String delete(){
		logger.info("delete: delete")
		return "user/delete";
	}


	//회원조회 페이지로 이동 - dev
	@RequestMapping("/user/select.do")
	public String select (){
		logger.info("경로:" + select);
		return "user/select";
	}

}

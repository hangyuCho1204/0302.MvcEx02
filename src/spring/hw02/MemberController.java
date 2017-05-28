package spring.hw02;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(method=RequestMethod.GET, params="newMember")
	
	public String createMember(Model model){
		
		Member member = new Member();
		model.addAttribute("member", member);
		System.out.println("get!방식");

		return "member";
	}
	@RequestMapping(method=RequestMethod.POST, params="newMember")
	public String createMember(@Valid Member member, BindingResult bindingresult) {
	//@Valid Member에 적용된 Pattern안에 유효성 검사를 적용 시 적용되는 어노테이션
	//BindingResult는 유효성 검사를 하고난 후의 결과 값이 넘어온다.
		
		if(bindingresult.hasErrors()){
			return "member";
		}
		
		//bindingresult에 error가 있으면 member로 가~ 라는 뜻!
		
		return "result";
	}
}

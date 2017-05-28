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
		System.out.println("get!���");

		return "member";
	}
	@RequestMapping(method=RequestMethod.POST, params="newMember")
	public String createMember(@Valid Member member, BindingResult bindingresult) {
	//@Valid Member�� ����� Pattern�ȿ� ��ȿ�� �˻縦 ���� �� ����Ǵ� ������̼�
	//BindingResult�� ��ȿ�� �˻縦 �ϰ� ���� ��� ���� �Ѿ�´�.
		
		if(bindingresult.hasErrors()){
			return "member";
		}
		
		//bindingresult�� error�� ������ member�� ��~ ��� ��!
		
		return "result";
	}
}

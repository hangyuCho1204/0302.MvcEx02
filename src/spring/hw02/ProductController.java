package spring.hw02;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.tags.BindErrorsTag;
@Controller
public class ProductController {
	@RequestMapping(method=RequestMethod.GET, params="newProduct")
	public String Product(Model model){
		model.addAttribute("product", new Product());
		return "product";
	}
	
	@RequestMapping(method=RequestMethod.POST, params="newProduct")
	public String Product(@Valid Product product, BindingResult binBindingResult){
		return "result";
	}
}

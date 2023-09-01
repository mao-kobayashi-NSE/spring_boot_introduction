package SampleForm;

public class SampleForm{
	private String name;
	private String bloodType;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
}

/*import org.springframework.web.bind.annotation.PostMapping;
import SampleForm.SampleForm;

@Controller
@RequestMapping("/lesson")
public class LessonController{
	@PostMapping("/request_test")
	@ResponseBody
	public String postTest(SampleForm sampleForm) {
		return "名前" + sampleForm.getName() + "<br>血液型" + sampleForm.getBloodType();
	}
	
	@GetMapping("/form_test")
	public String formTest(SampleForm sampleForm, Model model) {
		model.addAttribute("sampleForm", sampleForm);
		return "lesson/form_test";
	}
}
*/


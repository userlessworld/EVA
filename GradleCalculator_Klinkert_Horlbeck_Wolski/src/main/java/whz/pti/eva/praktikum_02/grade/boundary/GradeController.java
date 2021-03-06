package whz.pti.eva.praktikum_02.grade.boundary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import whz.pti.eva.praktikum_02.grade.domain.Grade;
import whz.pti.eva.praktikum_02.grade.service.GradeService;

@Controller
public class GradeController {
	@Autowired
	private GradeService gradeService;
	
	@RequestMapping("/grades")
		public String listAllGrades(@RequestParam String lecture, @RequestParam String grades, Model model) {
			List<Grade> list = gradeService.listAllGrades();
			model.addAttribute("listAllGrades", list);
			model.addAttribute("Grade", grades);
			model.addAttribute("Lecture", lecture);
			return "grades";
		
	}
	
}

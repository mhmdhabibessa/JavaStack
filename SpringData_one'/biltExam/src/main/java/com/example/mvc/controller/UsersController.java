package com.example.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mvc.models.Course;
import com.example.mvc.models.User;
import com.example.mvc.services.CourseServeces;
import com.example.mvc.services.UserService;
import com.example.mvc.validator.UserValidator;


//imports removed for brevity
@Controller
public class UsersController {
	private final UserService userService;
    private final UserValidator userValidator;
	private final CourseServeces courseService;


 public UsersController(UserService userService,UserValidator userValidator,CourseServeces courseServeces) {
     this.userService = userService;
     this.userValidator = userValidator;
     this.courseService=courseServeces;

 }
 
 @RequestMapping("/registration")
 public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 }
@RequestMapping("/login")
 public String login() {
     return "homePage.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    
	 	userValidator.validate(user, result);
	 	if(result.hasErrors()) {
	 	     return "registrationPage.jsp";
	 	}
	 	User u = userService.registerUser(user);
	 	session.setAttribute("userId",u.getId());
        return "redirect:/home";
 }
 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if (isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/home";
		} else {
			model.addAttribute("user", new User());
			model.addAttribute("error", "Invalid ");
			return "registrationPage.jsp";
		}
	}
	 
 
 
// @RequestMapping("/home")
// public String home(HttpSession session, Long id, Model model) {
//	 Long userId=(Long) session.getAttribute("userId");
//	 User u = userService.findUserById(userId);
//	 model.addAttribute("user",u);
//	 course c =courseService.findcourse(id);
//	 model.addAttribute("course",c);

//	 return "homePage.jsp";
// }
 
//display homepage
		@RequestMapping("/home")
		public String homepage(HttpSession session, Model model) {
			if (session.getAttribute("userId") != null) {
				Long userId = (Long) session.getAttribute("userId");
				User u = userService.findUserById(userId);
				 model.addAttribute("user",u);

				// render courses in table

				List<Course> courseList = courseService.findAllcourses();
				model.addAttribute("courses", courseList);
				return "homePage.jsp";

			} else {
				return "redirect:/login";
			}
		}

		@RequestMapping("/courses/new")
		public String courseCreation(@ModelAttribute("course") Course myCourse) {
			return "addCourse.jsp";
		}
		
		@PostMapping("/courses/new")
		public String createCourse(@Valid @ModelAttribute("course") Course myCourse, BindingResult result) {
			if (result.hasErrors()) {
				return "addCourse.jsp";
			} else {
				courseService.createCourse(myCourse);
				return "redirect:/home";
			}
		}
 
 
 
 
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
	 session.invalidate();
		return "redirect:/login";

 }
 
 
 @RequestMapping("courses/{id}")
	public String displayCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Course myCourse = courseService.findCourseById(myId);
		model.addAttribute("course", myCourse);

		List<User> users = myCourse.getUsers();
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		model.addAttribute("currentUser",u);
		return "aboutCourse.jsp";
	}
 @RequestMapping("/courses/add/{id}")
	public String addCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		Course course = courseService.findCourseById(myId);
		
		u.getCourses().add(course);
		userService.updateUser(u);
		
		
		return "redirect:/home";
	}
 
 @RequestMapping("/courses/{id}/edit")
	public String editPage(@ModelAttribute("course") Course myCourse, @PathVariable("id") Long myId, Model model) {
		Course course = courseService.findCourseById(myId);
		model.addAttribute("course", course);
		return "edit.jsp";
	}
 @PostMapping("/courses/update")
	public String updateCourse(@Valid @ModelAttribute("course") Course myCourse, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			List<User> myStudents =myCourse.getUsers();
			courseService.updateCourse(myCourse);
			return "redirect:/home";
		}
	}
 
	@RequestMapping("/courses/{id}/remove")
	public String removeUserFromCourse(@PathVariable("id") Long myId, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUserById(userId);
		Course course = courseService.findCourseById(myId);
		
		u.getCourses().remove(course);
		userService.updateUser(u);
		
		return "redirect:/home";
	}
 
 
 
 @RequestMapping("/courses/delete/{id}")
	public String deleteCourse(@PathVariable("id") Long id) {
		Course myCourse = courseService.findCourseById(id);
		if (myCourse != null) {
			courseService.deleteCourse(myCourse);
			return "redirect:/home";
		} else {
			return "redirect:/home";
		}

	}
 
 
}
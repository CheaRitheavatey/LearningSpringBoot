package com.example.wtfamidoing.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student") // so instead of localhost8080 now we want localhost8080/api/v1/student
public class StudentController {
    private final StudentService studentService;

    // dependency injection
    @Autowired // we say that the data field studentservice should auto instantiate and injected into this.studentService for us and no need to = new StudentService() ourself
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping()
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // api that will take payload and store it in the system
    // post is to add a new student

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) { // we take the request body and map it
        studentService.adddNewStudent(student);
    }

    @DeleteMapping(path= "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long id, @RequestParam(required = false) String name, @RequestParam(required = false) String email) {
        studentService.updateStudent(id,name,email);
    }
}

# LearningSpringBoot

# week 0: 
- basic java ✅
- mini practice: ✅
create a simpe console-based task manger application in java. the purpose of this application is to allow users to add, view and delete tasks from a list.

key features:
    add task: users can input a task description, which will be stored

    view tasks: users can view all their added tasks
    
    delete task: users can delete a task by specifying its index

    exit: users can exit the application gracefully

- database sql
    what is database? -> collection of data stored in a format that can easily be accessed

    we use DMBS have 2: relational (each table store data a specific type of object and we use sql) and no relational (no table or relationship between table and dont understand sql)

    - create a database


# week 1:
- intro to spring boot:
    - controller classs = responsible for handling incoming HTTP request and give back response
      example, take request from web or mobile app and return json
    - @RestController = combine 2 things (@Controller: mark which class is controller + @ResponseBody: the return value should be written directly in HTTP usually as json)
    - So, when you use @RestController, you don't need to annotate each method with @ResponseBody; it's applied automatically.
    - @RequestMapping: map HTTP requests to handler methods of MVC and REST controllers
      can be applied at both the class and method levels
      Flexibility: You can specify the HTTP method (GET, POST, etc.), request parameters, headers, and more.
      example, @RequestMapping("/api/products") --> from localhost:8080 to localhost:8080/api/products
                public class ProductController {
                    // Methods to handle requests
                }

    - @GetMapping = is a shortcut for @RequestMapping(method = RequestMethod.GET)
      used to handle HTTP GET requests
      @GetMapping("/{id}") -->  it mean: /api/products/{id} and return returns a Product object
        public Product getProduct(@PathVariable Long id) {
            return productService.getProductById(id);
        }


    - what is spring boot:

    - setting up spring boot with spring initializr
    - application structure (main class, annotations: @SpringBootApplication, @Component)
    - properties config (application.properties)
    - dependency injection: @Component, @Service, @Autowired
    - exercise: build a simple "Hello world" REST app
    - mini project: create a greeting REST API with custom message from application.properties




package pe.suasnabar.appusers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.suasnabar.appusers.dto.request.CreateUserRequest;
import pe.suasnabar.appusers.services.IUserService;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/{userId}")
    @ResponseBody
    public ResponseEntity<?> getFavouriteMoviesByUserId(@PathVariable Integer userId) {
        return ResponseEntity.ok().body(iUserService.getFavouriteMoviesByUserId(userId));
    }

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<?> getUserList() {
        return ResponseEntity.ok().body(iUserService.usersList());
    }

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok().body(iUserService.createUser(request));
    }

    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok().body("Hello world 3!!!.");
    }

}

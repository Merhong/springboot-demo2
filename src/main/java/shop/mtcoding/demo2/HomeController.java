package shop.mtcoding.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController : 값을 리턴
@Controller // 리턴되는 이름의 파일을 찾아냄!
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home"; // ViewResolver 클래스 발동 WEB-INF/views/home.jsp
        // prefix :  WEB-INF/views/ 를 붙이고
        // suffix : .jsp를 붙여줌
    }
}

// 예외 처리하기 - 컨테이너의 기본 예외 페이지 변경
package bitcamp.app2;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller06_2 {

  // web.xml 변경
  // <error-page>
  // <location>/error</location>
  // </error-page>
  //
  // 테스트:
  // => 존재하지 않는 URL로 요청하기
  //
  @GetMapping("/error")
  public ModelAndView error(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("status", request.getAttribute("javax.servlet.error.status_code"));
    mv.addObject("reason", request.getAttribute("javax.servlet.error.message"));
    mv.setViewName("error3");
    return mv;
  }

}



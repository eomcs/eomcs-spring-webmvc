// 예외 처리하기
package bitcamp.app2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c06_1")
public class Controller06_1 {

  // 테스트:
  // http://.../app2/c06_1/h1
  @GetMapping("h1")
  public void handler1() {
    System.out.println("c06_1.handler1() 호출");
  }

  // 테스트:
  // http://.../app2/c06_1/h2
  @GetMapping("h2")
  public void handler2() throws Exception {
    throw new Exception("예외 발생!");
  }

  // request handler를 실행하다가 오류가 발생하면,
  // @ExceptionHandler가 붙은 메서드를 호출한다.
  //
  // 현재 페이지 컨트롤러에 해당 메서드가 없으면,
  // @ControllerAdvice 객체에서 해당 메서드를 찾는다.
  //
  // @ExceptionHandler
  // public ModelAndView error(Exception ex) {
  // ModelAndView mv = new ModelAndView();
  // mv.addObject("error", ex);
  // mv.setViewName("error1");
  // return mv;
  // }
}



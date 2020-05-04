package bitcamp.app2;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// @ControllerAdvice
// => 이름에 이미 역할에 대한 정보가 담겨있다.
// => 페이지 컨트롤러를 실행할 때 충고하는 역할을 수행한다.
// 즉 프론트 컨트롤러가 페이지 컨트롤러의 request handler를 호출하기 전에
// 이 애노테이션이 붙은 클래스를 참고하여 적절한 메서드를 호출한다.
@ControllerAdvice
public class GlobalControllerAdvice {

  @ExceptionHandler
  public ModelAndView handleException(Exception ex) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("error", ex);
    mv.setViewName("error2");
    return mv;
  }
}



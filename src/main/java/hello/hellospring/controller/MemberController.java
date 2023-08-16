package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;


    //생성자 통한 주입이 가장 좋다.!
   @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

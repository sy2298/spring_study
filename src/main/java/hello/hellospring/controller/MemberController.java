package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
//    @Autowired private MemberService memberService;
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;

    }
//    @Autowired //스프링이 스프링 컨테이너에 있는 MemberService를 연결시켜준다.
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
}

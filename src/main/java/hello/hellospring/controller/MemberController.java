package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
//    @Autowired private MemberService memberService;
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;

    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }
//    @Autowired //스프링이 스프링 컨테이너에 있는 MemberService를 연결시켜준다.
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
    @PostMapping("members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
}

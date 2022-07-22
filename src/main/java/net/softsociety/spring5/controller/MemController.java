package net.softsociety.spring5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring5.domain.Mem;
import net.softsociety.spring5.service.MemServiceImpl;

@Slf4j
@Controller
public class MemController {

    @Autowired
    MemServiceImpl service;

    @GetMapping("/member/join")
    public String join() {
        return "join";
    }

    @PostMapping("/member/join")
    public String join(Mem m) {
        service.joinMember(m);
        return "redirect:/";

    }

    @GetMapping("/member/idcheck")
    public String idcheck() {
        return "idcheck";
    }

    @PostMapping("/member/idcheck")
    public String idcheck(String searchId, Model model) {
        log.debug("검색할ID: {}", searchId);
        boolean result = service.idcheck(searchId);

        log.debug("사용가능여부:{}", result);

        if (result == false) {
            log.debug("사용가능합니다");
        } else {
            log.debug("사용못해요 잔넨다");
        }

        model.addAttribute("searchId", searchId);
        model.addAttribute("result", result);

        return "idcheck";
    }

}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class translate {
    @GetMapping("")
        public String Translate(){
        return "index";
    }
    @PostMapping("/translate")
    public String translates(@RequestParam String word, Model model){
        Map<String,String> trans=new HashMap<>();
        trans.put("hello","Xin chao");
        trans.put("dog","cho'");
        trans.put("chicken","Anh thanh");
        trans.put("book","sa'ch");

        for (String key : trans.keySet()){
            if (key.equalsIgnoreCase(word.trim())){
                model.addAttribute("result",trans.get(key));
                break;
            }
        }
        return "index";
    }
}

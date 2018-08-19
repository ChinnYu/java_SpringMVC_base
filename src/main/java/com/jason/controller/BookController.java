package com.jason.controller;

import com.jason.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @program: c6_3
 * @description:
 * @author: Liu
 * @create: 2018-08-15
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("msg","book list action!1");
        return "book/list";
    }

    @RequestMapping("/list2")
    public String list2(Model model){
        model.addAttribute("msg","book list action!222");
        return "book/list";
    }

    @RequestMapping//當前controller下的默認action訪問時無需指定
    public String list3(Model model){
        model.addAttribute("msg","book list action!3dd123");
        return "book/list";
    }

    @RequestMapping("/list4/{id}/{type}")
    public String list4(@PathVariable int id,@PathVariable String type, Model model){
        model.addAttribute("msg","book list action!dd4"+"id:"+id+"type:"+type);
        return "book/list";
    }

    @RequestMapping("/list5")
    public String list4(Model model, @RequestParam(required = false,defaultValue = "unknown") String bookname, @RequestParam(required = false,defaultValue = "0.0") double price){
        model.addAttribute("msg","book list action!dd5, bookname = "+bookname+"price = "+price);
        return "book/list";
    }

    @RequestMapping("/list6")
    public String list6(Model model, Book book){
        model.addAttribute("msg","book list action!dd6, "+book);
        return "book/list";
    }

    @RequestMapping("/list7")
    public String list7(Model model,@RequestParam("hobby") List<Integer> hobbies){
        model.addAttribute("msg","book list action!dd7, "+Arrays.deepToString(hobbies.toArray()));
        return "book/list";
    }

    @RequestMapping("/list8")
    public String list8(Model model,@RequestParam("hobby") List<String> hobbies){
        model.addAttribute("msg","book list action!dd8, "+Arrays.deepToString(hobbies.toArray()));
        return "book/list";
    }

    @RequestMapping("/list9")
    public String list9(Model model, RedirectAttributes attributes){
        model.addAttribute("msg","book list action!dd9, ");
        Book book = new Book();
        book.setName("MKK");
        book.setPrice(55);
        attributes.addFlashAttribute("book",book);
        return "redirect:list10";
    }

    @RequestMapping("/list10")
    public String list10(Model model,Book book){
        model.addAttribute("msg","book list action!dd10, "+book);
        return "book/list";
    }

}

package com.nk.controller;

import com.nk.domain.*;
import com.nk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private UserService userService;
    @Autowired
    private TagService tagService;
    @Autowired
    private OperaService operaService;
    @Autowired
    private KeywordService keywordService;
    @Autowired
    private ShowService showService;
    @Autowired
    private VideoService videoService;
    @Autowired
    private TopService topService;


    @RequestMapping("login.do")
    public String login(HttpServletRequest request,String username,String password){
        Client client = clientService.queryByUP(username,password);
        System.out.println(client);
        if(client==null||"".equals(client)){
            return "login";
        }
        else {
            request.getSession().setAttribute("client",client);
            return "redirect:index.html";
        }
    }
    @RequestMapping("/index.html")
    public String index(HttpServletRequest request){
        List<User> users = userService.findTop();
        List<Tag> tags = tagService.findAll();
        List<Top>tops = topService.findtopall();
        request.setAttribute("users",users);
        request.setAttribute("tops",tops);
        request.setAttribute("tags",tags);
        return "index";
    }
    @RequestMapping("/tag.html")
    public String tag(HttpServletRequest request){
        List<Tag> tags = tagService.findAll();
        request.setAttribute("tags",tags);
        return "tag";
    }
    @RequestMapping("/user.html")
    public String table_user(HttpServletRequest request){
        List<User> users = userService.findAll();
        request.setAttribute("users",users);
        return "user";
    }


    @ResponseBody
    @RequestMapping("/charts_video.do")
    public List<Video> charts_video(){
        List<Video> vs =videoService.findAll();
        System.out.println(vs);
        return vs;
    }
    @ResponseBody
    @RequestMapping("/charts_user.do")
    public List<User> charts_user(){
        return userService.findAll();
    }
    @ResponseBody
    @RequestMapping("/charts_tag.do")
    public List<Tag> charts_tag(){
        return tagService.findAll();
    }
    @ResponseBody
    @RequestMapping("/opera1")
    public  List<Opera> find9() {
        return operaService.select9();
    }
    @ResponseBody
    @RequestMapping("/opera2")
    public  List<Opera> find8() {
        return operaService.select8();
    }
    @ResponseBody
    @RequestMapping("/opera3")
    public List<Opera> find7() {
        return operaService.select7();
    }
    @ResponseBody
    @RequestMapping("/opera4")
    public List<Opera> find6() {
        return operaService.select6();
    }
    @ResponseBody
    @RequestMapping("/getShowPlaceNum.do")
    public List<Showcity> findPlaceNum(){
        return showService.findPlaceNum();
    }
    @ResponseBody
    @RequestMapping("/getShowAll.do")
    public List<Show> findShowAll(){
        return showService.findShowAll();
    }
    @ResponseBody
    @RequestMapping("/getShowAvgprice.do")
    public List<Showcity> findAvgPrice(){
        return showService.findAvgPrice();
    }
    @ResponseBody
    @RequestMapping("/getMainShowCity.do")
    public List<Showcity> findMainCity(){
        return showService.findMainCity();
    }
    @ResponseBody
    @RequestMapping("/getKeyword.do")
    public List<Keyword> findKeyword(){
        return keywordService.findKeyword();
    }
    @ResponseBody
    @RequestMapping("/getMaxMinPrice.do")
    public List<Showprice> findMaxMinPrice(){
        return showService.findMaxMinPrice();
    }
    @ResponseBody
    @RequestMapping("/findtopall.do")
    public List<Top> findtopall() {
        return topService.findtopall();
    }
    @ResponseBody
    @RequestMapping("/findpartall.do")
    public List<Top> findpartall(){
        return topService.findpartall();
    }
}

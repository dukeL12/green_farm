package com.ruanku.farm.controller.User;

import com.ruanku.farm.pojo.Bussiness;
import com.ruanku.farm.service.BusinessService;
import com.ruanku.farm.service.ProduceServiceInter;
import com.ruanku.farm.utils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UploadController {
    @Resource
    private ProduceServiceInter produceServiceInter;
    @Resource
    private BusinessService businessService;

    @PostMapping("/bus/upload-file")
    public String upload(@RequestParam("in_Pro_name") String in_Pro_name,@RequestParam("imgFile") MultipartFile imgFile,@RequestParam("in_Pro_price") String in_Pro_price,@RequestParam("in_Pro_address") String in_Pro_address,@RequestParam("in_pro_type") int in_pro_type, @RequestParam("in_Pro_Detail") String in_Pro_Detail,HttpServletRequest request, HttpSession session) {
        Map<String,Object> map = new HashMap<>();
        if (imgFile.isEmpty()) {
// 设置错误状态码
            map.put("code","500");
            map.put("message","上传失败，请选择文件");
//            return map;
        }
// 拿到文件名
        String filename = imgFile.getOriginalFilename();
        String pro_gif = "/static/images/"+filename;
// 存放上传图片的文件夹
        File fileDir = UploadUtils.getImgDirFile();
// 输出文件夹绝对路径 – 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
        System.out.println(imgFile.getOriginalFilename());
        System.out.println(fileDir.getAbsolutePath());
        try {
// 构建真实的文件路径
            File newFile = new File(fileDir.getAbsolutePath() + File.separator + filename);
            System.out.println(newFile.getAbsolutePath());
// 上传图片到 -》 “绝对路径”
            imgFile.transferTo(newFile);
            Bussiness s = businessService.selBusByAcc(session.getAttribute("acc").toString());
            produceServiceInter.inProByBus(in_Pro_name,pro_gif,in_Pro_price,in_Pro_address,s.getBns_id(),in_pro_type,in_Pro_Detail,1);
            map.put("code","200");
            map.put("message","上传成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "BusInProSuccess";
    }
}

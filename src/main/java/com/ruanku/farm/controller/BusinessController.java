package com.ruanku.farm.controller;

import com.ruanku.farm.entity.Farm;
import com.ruanku.farm.entity.Produce;
import com.ruanku.farm.service.ServiceImpl.BusinessServiceIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BusinessController {

    @Autowired
    private BusinessServiceIplm businessServiceIplm;

    @PostMapping("/selBusinessFarm")
    public String selBusinessFarm(Model model, String bns_id){
        List<Farm> farm = businessServiceIplm.selFarm(Integer.parseInt(bns_id));
        model.addAttribute("farm",farm);
        model.addAttribute("bns_id",bns_id);
        return "business/selBusinessFarm";
    }

    @RequestMapping("delBusinessFarm")
    public String delBusinessFarm(Model model, String farm_id,String bns_id) {
        businessServiceIplm.delFarm(Integer.parseInt(farm_id));
        return selBusinessFarm(model,bns_id);
    }

    @PostMapping("/addBusinessFarm")
    public String addBusinessFarm(Model model, String farm_name,String farm_gif,String farm_price,String farm_locate,String bns_id,String farm_detail,String farm_area){
        Farm farm = new Farm(farm_name,farm_gif,Double.parseDouble(farm_price),farm_locate,Integer.parseInt(bns_id),farm_detail,Double.parseDouble(farm_area));
//        File file = new File(farm_gif);
//        file.saveAs("/farm_picture/" + file.getFileName());
        businessServiceIplm.addFarm(farm);
        return selBusinessFarm(model,bns_id);
    }

    //
//    @PostMapping("/selBusinessProduce")
//    public String selBusinessProduce(Model model, String bns_id){
//        List<Produce> produce = businessServiceIplm.selProduce(Integer.parseInt(bns_id));
//        model.addAttribute("produce",produce);
//        model.addAttribute("bns_id",bns_id);
//        return "business/selBusinessProduce";
//    }
//    @RequestMapping("delBusinessProduce")
//    public String delBusinessProduce(Model model, String pro_id,String bns_id) {
//        businessServiceIplm.delProduce(Integer.parseInt(pro_id));
//        return selBusinessProduce(model,bns_id);
//    }
//
//    @PostMapping("/addBusinessProduce")
//    public String addBusinessProduce(Model model, String pro_name,String pro_gif,String pro_price,String pro_address,String bns_id,String pro_type,String pro_Detail){
//        Produce produce = new Produce(pro_name,pro_gif,Double.parseDouble(pro_price),pro_address,Integer.parseInt(bns_id),pro_type,pro_Detail);
//        businessServiceIplm.addProduce(produce);
//        return selBusinessProduce(model,bns_id);
//    }
}

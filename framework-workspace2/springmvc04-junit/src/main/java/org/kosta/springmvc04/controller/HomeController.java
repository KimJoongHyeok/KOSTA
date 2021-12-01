package org.kosta.springmvc04.controller;

import org.kosta.springmvc04.model.domain.ItemDTO;
import org.kosta.springmvc04.model.mapper.ItemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	private ItemMapper itemMapper;
	
	public HomeController(ItemMapper itemMapper) {
		super();
		this.itemMapper = itemMapper;
	}

	@GetMapping("home.do")
	public String home(Model model) {
		model.addAttribute("totalItemCount",itemMapper.getTotalItemCount());
		return "index";
	}
	
	@GetMapping("findItemByNo.do")
	public String findItemByNo(int itemNo,Model model) {
		ItemDTO itemDTO = itemMapper.findItemByNo(itemNo);
		if(itemDTO == null) {
			return "findbyno-fail";
		}else {
			model.addAttribute("itemDTO",itemDTO);
			return "findbyno-success";
		}
	}
	
	@GetMapping("getAllItemList.do")
	public String getAllItemList(Model model) {
		model.addAttribute("itemList",itemMapper.getAllItemList());		
		return "item-list";
	}
	
	@PostMapping("registerItem.do")
	public String registerItem(ItemDTO itemDTO) {
		itemMapper.registerItem(itemDTO);
		return "redirect:registerResult.do?itemNo="+itemDTO.getItemNo();
	}
	
	@GetMapping("registerResult.do")
	public String registerResult(int itemNo,Model model) {
		model.addAttribute("itemDTO",itemMapper.findItemByNo(itemNo));
		return  "register-item-result";
	}
}

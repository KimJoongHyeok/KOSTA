package org.kosta.myproject.controller;

import org.kosta.myproject.model.mapper.ItemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	private ItemMapper itemMapper;
	
	public ItemController(ItemMapper itemMapper) {
		super();
		this.itemMapper = itemMapper;
	}
	
	@GetMapping("getTotalItemCount")
	public String getTotalItemCount(Model model) {
		model.addAttribute("totalItemCount",itemMapper.getTotalItemCount());
		return "item-count";
	}
}

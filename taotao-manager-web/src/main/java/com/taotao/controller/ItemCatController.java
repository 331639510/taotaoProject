package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.service.ItemCatService;

@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0") Long parentId) {
		
		List<EasyUITreeNode> list = itemCatService.getCatList(parentId);
		return list;
	}
	
}

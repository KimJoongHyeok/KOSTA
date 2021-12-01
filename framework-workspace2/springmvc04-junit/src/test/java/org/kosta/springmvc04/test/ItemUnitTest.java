package org.kosta.springmvc04.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc04.model.domain.ItemDTO;
import org.kosta.springmvc04.model.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class ItemUnitTest {
	
	@Autowired
	private ItemMapper itemMapper;
	
	@Test
	public void getTotalItemCount() {
		System.out.println(itemMapper.getTotalItemCount());
	}
	
	@Test
	public void findItemById() {
		int itemNo = 1;
		ItemDTO item = itemMapper.findItemByNo(itemNo);
		System.out.println(item);
	}
	
	@Test
	public void getAllItemList() {
		List<ItemDTO>list = itemMapper.getAllItemList();
		for(ItemDTO vo:list)
			System.out.println(vo);
	}
	
	@Test
	public void registerItem() {
		ItemDTO itemDTO = new ItemDTO("맥스","오비",1510);
		System.out.println("등록전 : " + itemDTO);
		itemMapper.registerItem(itemDTO);
		//Assert.assertEquals(itemMapper.findItemByNo(3), itemDTO);
		System.out.println("등록후 : " + itemDTO);
	}
	
	
}

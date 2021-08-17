package step3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class CartService {
	private LinkedHashMap<String,ProductVO> map = new LinkedHashMap<String,ProductVO>();
	/**
	 * map�� key : ProductVO�� id
	 * map�� value : ProductVO ��ü
	 * @param vo
	 */
	public void addProduct(ProductVO vo) {
		map.put(vo.getId(), vo);
	}
	
	/**
	 * map�� ����� value�鸸 ��� ���
	 */
	
	public void printAll() {
		Collection<ProductVO>col = map.values(); //<Generic> �ȿ��� value�� �� Ÿ���� ProductVO�� ��
		Iterator<ProductVO>it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public ProductVO findProductById(String id) {
		return map.get(id);
	}

	public void deleteProductById(String id) {
		map.remove(id);
	}
	
	public int getTotalPrice() {
		int totalPrice = 0;
		//�Ʒ� ���� ���ٷ� ǥ������ : Iterator<ProductVO> it = map.values().iterator();
		Collection<ProductVO>col = map.values(); //<Generic> �ȿ��� value�� �� Ÿ���� ProductVO�� ��
		Iterator<ProductVO>it = col.iterator();
		while(it.hasNext()) {
			totalPrice += it.next().getPrice();
		}
		return totalPrice;
	}
}	

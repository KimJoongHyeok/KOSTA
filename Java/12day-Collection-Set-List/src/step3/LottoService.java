package step3;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {

	/**
	 * �ζ� 1~45������ ���� (�ߺ��Ǿ�� �ȵȴ�) 6���� ���;��Ѵ�
	 * ������ �� �߻���Ű�� ���� Random�� �̿�
	 * �ߺ� ����x,���� ���� TreeSet �̿�
	 * while loop �� ����(������ random �� nextInt() �� ������ ������ ������� �ֱ� ������)
	 * @return
	 */
	public TreeSet<Integer> createLottoNumber() {
			TreeSet<Integer> set = new TreeSet<Integer>();
			Random r = new Random();

			while(set.size()<6) {
				set.add(r.nextInt(45)+1);
			}

		return set;
	}

}

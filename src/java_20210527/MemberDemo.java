package java_20210527;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {

		// MemberDto d = new MemberDto(112,"김산다라","개성","F");
		MemberDao dao = MemberDao.getInstance();

		// dao.insert(d);

		// MemberDto d1 = new MemberDto("전주","F",110);
		// dao.update(d1);

		// dao.delete(112);
		
		ArrayList<MemberDto> list = dao.select(0, 4);
		for(MemberDto dto : list) {
			System.out.println(dto.getNum()+"\t"+ dto.getName()+"\t"+ dto.getAddr()+"\t"+ dto.getSex());
		}
		

	}

}

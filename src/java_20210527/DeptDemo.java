package java_20210527;

import java.util.ArrayList;

public class DeptDemo {

	public static void main(String[] args) {
		
		DeptDto dto = new DeptDto(50,"Camera","DAEGU");
		DeptDao dao = DeptDao.getInstance();
		
		dao.insert(dto);
		
		dao.update("Kill", 10);
		
		dao.delete(50);
		
		ArrayList<DeptDto> list = dao.select();
		System.out.println("DEPTNO\tDNAME\tLOC");
		for(DeptDto d : list) {
			System.out.println(d.getNum() +"\t"+ d.getName() +"\t"+ d.getLoc());
		}

	}

}

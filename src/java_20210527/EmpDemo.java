package java_20210527;

import java.util.ArrayList;

public class EmpDemo {

	public static void main(String[] args) {
		
		EmpDto d = new EmpDto(8001,"김용","장의사",7689,"2009-08-19",3700,10,20);
		EmpDao dao = EmpDao.getInstance();
		
		dao.insert(d);
		
		dao.delete(8001);
		EmpDto d1 = new EmpDto(5400,7698);
		dao.update(d1);
		
		ArrayList<EmpDto> list = dao.select(0, 14);
		System.out.println("Empno\t\tEname\t\tJob\t\tMgr\t\tHiredate\t\tsal\t\tcomm\t\tdeptno");
		for(EmpDto dd : list) {
			System.out.println(	dd.getEmpno()+"\t\t"+ dd.getEname()+"\t\t"+ 
								dd.getJob()+"\t\t"+ dd.getMgr() +"\t\t"+
								dd.getHiredate()+"\t\t"+dd.getSal() +"\t\t"+ 
								dd.getComm() +"\t\t"+ dd.getDeptno());
		}
	}

}

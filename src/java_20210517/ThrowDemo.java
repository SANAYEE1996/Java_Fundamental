package java_20210517;

public class ThrowDemo {
	
	private static double withdraw(String account, double amount) throws InsufficientBalanceException,InCorrectAccountException {
		double myBalance = 10000;
		String myAccount = "111-222-333";
		
		if(myAccount.equals(account)){
			if(myBalance - amount >= 0) {
				myBalance -= amount;
				return myBalance;
			}
			else {
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}
		}
		else{
			throw new InCorrectAccountException("잘못된 계좌번호 입니다.");
		}
	}
	
	
	public static void main(String[] args){
		
		
		try {
			System.out.println("돈을 인출하면 얼마나 남는가 ? "+withdraw("111-222-333",100000));
		}
		catch (InCorrectAccountException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch (InsufficientBalanceException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			//Exception은 상위 클래스라 맨 위에 있으면 밑의 모든 것을 포함하므로 무조건 맨 밑에 작성한다.
		}
		
	}

}

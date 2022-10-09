package GitText;

import java.util.ArrayList;

public class SchoolSystem implements ISignUp{
	public SchoolSystem(int big, int medium, int small) {
		
	}

	public static void main(String[] args) throws Exception{
		 IParams params = ISignUp.parse();
	        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
	        ArrayList<Integer> plan = params. getPlanSignUp ();
	        for (int i = 0; i < plan.size(); i++) {
	            sc. addStudent (plan.get(i));
	        }
	        sc.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addStudent(int stuType) {
		// TODO Auto-generated method stub
		return false;
	}

}
